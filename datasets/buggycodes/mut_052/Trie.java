package buggycodes.mut_052;

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
        
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * Removes all words from the trie.
     *
     * <p>Time is O(1) for the root reset; the old nodes become unreachable for GC.</p>
     */
    public void clear() {
        

        // @@@ The collection is empty after clearing.
        // assert this.isEmpty();
        // @@@ The size is zero after clearing.
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
