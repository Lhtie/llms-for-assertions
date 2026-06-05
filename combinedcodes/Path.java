package combinedcodes;

import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Structure;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;

/**
 * Path description.
 * 
 * <p>
 * A path is a class that stores ordered lists of nodes and links that are
 * adjacent. Such a path may be manipulated with nodes and/or edges added or
 * removed. This class is designed as a dynamic structure that is, to add edges
 * during the construction of the path. Only edges need to be added, the nodes
 * list is maintained automatically.
 * </p>
 * 
 * <p>
 * The two lists (one for nodes, one for edges) may be acceded at any moment in
 * constant time.
 * </p>
 * 
 * <p>
 * The constraint of this class is that it needs to know the first node of the
 * path (the root). This root can be set with the {@link #setRoot(Node)} method
 * or by using the {@link #add(Node, Edge)} method.
 * </p>
 * 
 * <p>
 * The normal use with this class is to first use the {@link #setRoot(Node)}
 * method to initialize the path; then to use the {@link #add(Edge)} method to
 * grow it and the {@link #popEdge()} or {@link #popNode()}.
 * 
 */
public class Path implements Structure {

	/**
	 * class level logger
	 */
	private static final Logger logger = Logger.getLogger(Path.class.getSimpleName());

	/**
	 * The root of the path;
	 */
	private Node root = null;

	/**
	 * The list of edges that represents the path.
	 */
	Stack<Edge> edgePath;

	/**
	 * The list of nodes representing the path.
	 */
	Stack<Node> nodePath;

	/**
	 * New empty path.
	 */
	public Path() {
		edgePath = new Stack<Edge>();
		nodePath = new Stack<Node>();
        // @@@ the path is empty immediately after it is created
        // assert this.empty();
        // @@@ The size of the path is zero when a new path is created.
        // assert this.size()==0;
	}
	
	/**
	 * Adds a node and an edge to the path. If root is not set, the node will be
	 * set as root. Otherwise from node must be the same as the head node of the
	 * path.
	 *
	 * @param from
	 * 		The start node.
	 * @param edge
	 * 		The edge used.
	 */
	public void add(Node from, Edge edge) {
		if (root == null) {
			if (from == null) {
				throw new IllegalArgumentException("From node cannot be null.");
			} else {
				setRoot(from);
			}
		}

		if (from == null) {
			from = nodePath.peek();
		}

		if (!nodePath.peek().equals(from)) {
			throw new IllegalArgumentException("From node must be at the head of the path");
		}

		if (!edge.getSourceNode().equals(from) && !edge.getTargetNode().equals(from)) {
			throw new IllegalArgumentException("From node must be part of the edge");
		}

		nodePath.push(edge.getOpposite(from));
		edgePath.push(edge);
	}

	/**
	 * Adds an edge to the path.
	 *
	 * @param edge
	 * 		The edge to add to the path.
	 */
	public void add(Edge edge) {
		if (nodePath.isEmpty()) {
			add(null, edge);
		} else {
			add(nodePath.peek(), edge);
		}
        // @@@ The path contains the added edge after the operation.
        // assert this.contains(edge);
        // @@@ If the edge is null, then the last element in the path is null; if the edge is not null, then the last element in the path is the added edge.
        // assert edge==null && this.getEdgePath().get(this.size()-1)==null || edge!=null && edge.equals(this.getEdgePath().get(this.size()-1));
	}

	/**
	 * Clears the path;
	 */
	public void clear() {
		nodePath.clear();
		edgePath.clear();
		// Runtime.getRuntime().gc();
		root = null;
        // @@@ The path is empty after clearing it.
        // assert this.empty();
        // @@@ The size of the path is zero after clearing it.
        // assert this.size()==0;
	}

	/**
	 * Says whether the path contains this node or not.
	 * 
	 * @param node
	 *            The node tested for existence in the path.
	 * @return <code>true</code> if the path contains the node.
	 */
	public boolean contains(Node node) {
		return nodePath.contains(node);
	}

	/**
	 * Says whether the path contains this edge or not.
	 * 
	 * @param edge
	 *            The edge tested for existence in the path.
	 * @return <code>true</code> if the path contains the edge.
	 */
	public boolean contains(Edge edge) {
		return edgePath.contains(edge);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.graphstream.graph.Structure#edges()
	 */
	@Override
	public Stream<Edge> edges() {
		return edgePath.stream();
	}

	/**
	 * Returns true if the path is empty.
	 * 
	 * @return <code>true</code> if the path is empty.
	 */
	public boolean empty() {
		return nodePath.empty();
	}

	/**
	 * Compare the content of the current path and the specified path to decide
	 * weather they are equal or not.
	 * 
	 * @param p
	 *            A path to compare to the curent one.
	 * @return True if both paths are equal.
	 */
	public boolean equals(Path p) {
		if (nodePath.size() != p.nodePath.size()) {
			return false;
		} else {
			for (int i = 0; i < nodePath.size(); i++) {
				if (nodePath.get(i) != p.nodePath.get(i)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Get a copy of this path
	 * 
	 * @return A copy of this path.
	 */
	@SuppressWarnings("unchecked")
	public Path getACopy() {
		Path newPath = new Path();
		newPath.root = this.root;
		newPath.edgePath = (Stack<Edge>) edgePath.clone();
		newPath.nodePath = (Stack<Node>) nodePath.clone();

		return newPath;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.graphstream.graph.Structure#getEdgeCount()
	 */
	@Override
	public int getEdgeCount() {
		return edgePath.size();
	}

	/**
	 * Returns the list of edges representing the path.
	 * 
	 * @return The list of edges representing the path.
	 */
	public List<Edge> getEdgePath() {
		return edgePath;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.graphstream.graph.Structure#getEdgeSet()
	 */
	@SuppressWarnings("unchecked")
	public <T extends Edge> Collection<T> getEdgeSet() {
		return (Collection<T>) edgePath;
	}

	/**
	 * Returns the size of the path. Identical to {@link #size()}.
	 * 
	 * @return The size of the path.
	 */
	@Override
	public int getNodeCount() {
		return nodePath.size();
	}

	/**
	 * Construct an return a list of nodes that represents the path.
	 * 
	 * @return A list of nodes representing the path.
	 */
	public List<Node> getNodePath() {
		return nodePath;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.graphstream.graph.Structure#getNodeSet()
	 */
	@SuppressWarnings("unchecked")
	public <T extends Node> Collection<T> getNodeSet() {
		return (Collection<T>) nodePath;
	}

	/**
	 * It returns the sum of the <code>characteristic</code> given value in the
	 * Edges of the path.
	 * 
	 * @param characteristic
	 *            The characteristic.
	 * @return Sum of the characteristics.
	 */
	public Double getPathWeight(String characteristic) {
		double d = 0;
		for (Edge l : edgePath) {
			d += (Double) l.getAttribute(characteristic, Number.class);
		}
		return d;
	}

	/**
	 * Get the root (the first node) of the path.
	 * 
	 * @return the root of the path.
	 */
	public Node getRoot() {
		return this.root;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.graphstream.graph.Structure#nodes()
	 */
	@Override
	public Stream<Node> nodes() {
		return nodePath.stream();
	}

	/**
	 * Looks at the edge at the top of the stack without removing it from the stack.
	 * 
	 * @return The edge at the top of the stack.
	 */
	public Edge peekEdge() {
		return edgePath.peek();
	}

	/**
	 * Looks at the node at the top of the stack without removing it from the stack.
	 * 
	 * @return The node at the top of the stack.
	 */
	public Node peekNode() {
		return nodePath.peek();
	}

	/**
	 * This methods pops the 2 stacks (<code>edgePath</code> and
	 * <code>nodePath</code>) and returns the removed edge.
	 * 
	 * @return The edge that have just been removed.
	 */
	public Edge popEdge() {
		nodePath.pop();
		return edgePath.pop();
	}

	/**
	 * This methods pops the 2 stacks (<code>edgePath</code> and
	 * <code>nodePath</code>) and returns the removed node.
	 * 
	 * @return The node that have just been removed.
	 */
	public Node popNode() {
		edgePath.pop();
		return nodePath.pop();
	}

	/**
	 * A synonym for {@link #add(Edge)}.
	 */
	public void push(Node from, Edge edge) {
		add(from, edge);
	}

	/**
	 * A synonym for {@link #add(Edge)}.
	 */
	public void push(Edge edge) {
		add(edge);
	}

	/**
	 * Remove all parts of the path that start at a given node and pass a new at
	 * this node.
	 */
	public void removeLoops() {
		int n = nodePath.size();
		// For each node-edge pair
		for (int i = 0; i < n; i++) {
			// Lookup each other following node. We start
			// at the end to find the largest loop possible.
			for (int j = n - 1; j > i; j--) {
				// If another node match, this is a loop.
				if (nodePath.get(i) == nodePath.get(j)) {
					// We found a loop between i and j.
					// Remove ]i,j].
					for (int k = i + 1; k <= j; k++) {
						nodePath.remove(i + 1);
						edgePath.remove(i);
					}
					n -= (j - i);
					j = i; // To stop the search.
				}
			}
		}
	}

	/**
	 * Set the root (first node) of the path.
	 * 
	 * @param root
	 *            The root of the path.
	 */
	public void setRoot(Node root) {
		if (this.root == null) {
			this.root = root;
			nodePath.push(root);
		} else {
			logger.warning("Root node is not null - first use the clear method.");
		}
	}

	/**
	 * Returns the size of the path
	 */
	public int size() {
		return nodePath.size();
	}

	/**
	 * Returns a String description of the path.
	 * 
	 * @return A String representation of the path.
	 */
	@Override
	public String toString() {
		return nodePath.toString();
	}
}