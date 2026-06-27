package naturalness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * A simple Unicode-aware Trie (prefix tree) for arbitrary Java Strings.
 *
 * <p>This implementation iterates Strings by <strong>Unicode code points</strong>
 * (not 16-bit chars) to handle surrogate pairs correctly. Each node maps a code
 * point (int) to a child node. The trie stores one node per code point (no
 * compression) and supports basic operations such as {@link #add(String)},
 * {@link #remove(String)}, {@link #contains(String)}, {@link #startsWith(String)},
 * and {@link #keysWithPrefix(String)}.</p>
 *
 * <p><strong>Ordering:</strong> Children are kept in a {@link TreeMap} so that
 * {@link #keysWithPrefix(String)} returns lexicographically ordered results by
 * code point. This is a simple, understandable choice over micro-optimizations.</p>
 *
 * <p><strong>Thread-safety:</strong> This class is not thread-safe.</p>
 */
public class Trie {

    /** Root node (represents the empty prefix). */
    private final Node root = new Node();

    /** Number of distinct words stored in the trie. */
    private int size = 0;

    /**
     * Adds the given word to the trie if not already present.
     *
     * @param word the word to add (non-null)
     * @return {@code true} if this call inserted a new word; {@code false} if it was already present
     * @throws NullPointerException if {@code word} is null
     */
    public boolean add(String word) {
        if (word == null) throw new NullPointerException("word");

        Node cur = root;
        cur.pass++; // empty prefix is passed by every word
        int i = 0, n = word.length();
        while (i < n) {
            final int cp = word.codePointAt(i);
            Node next = cur.children.get(cp);
            if (next == null) {
                next = new Node();
                cur.children.put(cp, next);
            }
            cur = next;
            cur.pass++;
            i += Character.charCount(cp);
        }
        if (cur.isWord) {
            // Already present: revert the pass counts we just incremented.
            decrementPath(word);
            return false;
        }
        cur.isWord = true;
        size++;
        return true;
        // @@@ the string given for insertion will be present in the trie after addition, unless it's null
        // assert word!=null => this.contains(word);
        // @@@ Returns true if the word is already present
        // assert word!=null => !\old(this.contains(word)) == (\result==true);
        // @@@ Trie grows by 1 in size if a new word not already present is added to it
        // assert word!=null&&!\old(this.contains(word)) => this.size()==\old(this.size())+1;
        // @@@ If the word is already present, then addition is trivial and the size of the trie remains the same
        // assert word!=null&&\old(this.contains(word)) => this.size()==\old(this.size());
        // @@@ After addition the trie not only contains the inserted word but all its nontrivial prefixes as well
        // assert word!=null => \forall int i; 1<=i&&i<=word.length(); this.startsWith(word.substring(0,i))==true;
        // @@@ If a new word is added, the number of words sharing the prefix goes up by 1 for each prefix of the added word
        // assert word!=null&&!\old(this.contains(word)) => \forall int i; 1<=i&&i<=word.length(); this.countPrefix(word.substring(0,i))==\old(this.countPrefix(word.substring(0,i)))+1;
        // @@@ After insertion, if we query the set of all words starting with w for any prefix w of the inserted word, then the inserted word must be part of the result
        // assert word!=null => \forall int i; 1<=i&&i<=word.length(); this.keysWithPrefix(word.substring(0,i)).contains(word);
    }

    /**
     * Returns {@code true} if the trie contains the given word.
     *
     * @param word the word to check (non-null)
     * @return {@code true} if present; {@code false} otherwise
     * @throws NullPointerException if {@code word} is null
     */
    public boolean contains(String word) {
        if (word == null) throw new NullPointerException("word");
        Node n = node(word);
        return n != null && n.isWord;
    }

    /**
     * Removes the given word from the trie if present.
     *
     * <p>This method also prunes now-unreachable nodes to keep memory usage modest.</p>
     *
     * @param word the word to remove (non-null)
     * @return {@code true} if a word was removed; {@code false} if it was not present
     * @throws NullPointerException if {@code word} is null
     */
    public boolean remove(String word) {
        if (word == null) throw new NullPointerException("word");
        if (!contains(word)) return false;

        // Walk down, keeping the path (node + incoming codepoint) to support pruning.
        Deque<PathElem> path = new ArrayDeque<>();
        Node cur = root;
        path.push(new PathElem(cur, null));

        int i = 0, n = word.length();
        while (i < n) {
            final int cp = word.codePointAt(i);
            cur = cur.children.get(cp);
            path.push(new PathElem(cur, cp));
            i += Character.charCount(cp);
        }

        // Unset terminal mark and update size.
        cur.isWord = false;
        size--;

        // Decrement pass and prune children that reach pass==0 on the way back up.
        while (!path.isEmpty()) {
            PathElem e = path.pop();
            e.node.pass--;
            if (e.node.pass == 0 && !path.isEmpty()) {
                PathElem parent = path.peek();
                if (e.incomingCp != null) {
                    parent.node.children.remove(e.incomingCp);
                }
            }
        }
        return true;
        // @@@ word is not in the trie after removal
        // assert word!=null => !this.contains(word);
        // @@@ if the method returns true, then the word must have been in the trie before the method (unless word itself was null)
        // assert word!=null => (\result==true) == \old(this.contains(word));
        // @@@ removal of any non-null word in the trie decreases its size by 1
        // assert word!=null&&\old(this.contains(word)) => this.size()==\old(this.size())-1;
        // @@@ If you try to remove a word that's not present in the trie its size remains the same
        // assert word!=null&&!\old(this.contains(word)) => this.size()==\old(this.size());
        // @@@ if the word is not null and present in the trie, all of the number of strings contained in the trie that start with each prefix of the given word should decrease by 1 after the remove operation.
        // assert word!=null&&\old(this.contains(word)) => \forall int i; 1<=i&&i<=word.length(); this.countPrefix(word.substring(0,i))==\old(this.countPrefix(word.substring(0,i)))-1;
        // @@@ The removed word can no longer be found as a completion of any of its prefixes
        // assert word!=null => \forall int i; 1<=i&&i<=word.length(); !this.keysWithPrefix(word.substring(0,i)).contains(word);
    }

    /**
     * Removes all words from the trie.
     *
     * <p>Time is O(1) for the root reset; the old nodes become unreachable for GC.</p>
     */
    public void clear() {
        root.children.clear();
        root.isWord = false;
        root.pass = 0;
        size = 0;
        // @@@ Clear empties the trie
        // assert this.isEmpty();
        // @@@ The size of the trie should be 0 after clearing it
        // assert this.size()==0;
    }

    /**
     * Returns {@code true} if there exists at least one word that starts with {@code prefix}.
     *
     * @param prefix any (possibly empty) prefix (non-null)
     * @return {@code true} if any word with the prefix exists, {@code false} otherwise
     * @throws NullPointerException if {@code prefix} is null
     */
    public boolean startsWith(String prefix) {
        if (prefix == null) throw new NullPointerException("prefix");
        return node(prefix) != null;
    }

    /**
     * Counts how many words begin with the given prefix.
     *
     * @param prefix any prefix (non-null)
     * @return number of words sharing the prefix
     * @throws NullPointerException if {@code prefix} is null
     */
    public int countPrefix(String prefix) {
        if (prefix == null) throw new NullPointerException("prefix");
        Node n = node(prefix);
        return (n == null) ? 0 : n.pass;
    }

    /**
     * Returns a list of all words that start with {@code prefix}, in lexicographic order
     * by Unicode code point.
     *
     * @param prefix any prefix (non-null)
     * @return immutable list of words with the given prefix (possibly empty)
     * @throws NullPointerException if {@code prefix} is null
     */
    public List<String> keysWithPrefix(String prefix) {
        if (prefix == null) throw new NullPointerException("prefix");

        Node start = node(prefix);
        if (start == null) return Collections.emptyList();

        List<String> out = new ArrayList<>();
        StringBuilder sb = new StringBuilder(prefix);
        dfs(start, sb, out);
        return Collections.unmodifiableList(out);
        // @@@ The number of keys with the given prefix is the same as the result of performing countprefix
        // assert prefix!=null => \result.size()==this.countPrefix(prefix);
        // @@@ Every member of the returned list is contained in the trie, and they all start with the given prefix string
        // assert prefix!=null => \forall int i; 0<=i&&i<\result.size(); this.contains(\result.get(i))&&\result.get(i).startsWith(prefix);
    }

    /**
     * Returns the number of distinct words currently stored in the trie.
     *
     * @return the size of the trie
     */
    public int size() {
        return size;
    }

    /**
     * Returns {@code true} if the trie contains no words.
     *
     * @return {@code true} if empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    // ---------------------------------------------------------------------
    // Internal representation
    // ---------------------------------------------------------------------

    private static final class Node {
        /** Children keyed by Unicode code point (kept sorted for lexicographic traversal). */
        final NavigableMap<Integer, Node> children = new TreeMap<>();
        /** Whether a word ends at this node. */
        boolean isWord;
        /**
         * Number of words whose paths pass through this node (including a word
         * ending at this node). Useful for pruning and prefix counts.
         */
        int pass = 0;
    }

    private static final class PathElem {
        final Node node;
        final Integer incomingCp; // null for root; otherwise code point from parent to this node
        PathElem(Node node, Integer incomingCp) { this.node = node; this.incomingCp = incomingCp; }
    }

    /** Returns the node reached by following {@code s} from root, or {@code null} if any link is absent. */
    private Node node(String s) {
        Node cur = root;
        int i = 0, n = s.length();
        if (n == 0) return cur; // empty prefix maps to root
        while (i < n) {
            final int cp = s.codePointAt(i);
            cur = cur.children.get(cp);
            if (cur == null) return null;
            i += Character.charCount(cp);
        }
        return cur;
    }

    /** Undo pass++ along the path of {@code word} when add() discovers it already existed. */
    private void decrementPath(String word) {
        Node cur = root;
        cur.pass--;
        int i = 0, n = word.length();
        while (i < n) {
            final int cp = word.codePointAt(i);
            cur = cur.children.get(cp);
            // cur is guaranteed non-null here because we just walked it in add()
            cur.pass--;
            i += Character.charCount(cp);
        }
    }

    /** DFS collecting words under {@code start}; {@code sb} holds the current prefix. */
    private static void dfs(Node start, StringBuilder sb, List<String> out) {
        if (start.isWord) out.add(sb.toString());
        for (var entry : start.children.entrySet()) {
            int cp = entry.getKey();
            Node nxt = entry.getValue();
            sb.appendCodePoint(cp);
            dfs(nxt, sb, out);
            // remove last code point
            int len = sb.length();
            // delete the last code point safely (handles surrogate pairs)
            int back = Character.charCount(cp);
            sb.delete(len - back, len);
        }
    }
}
