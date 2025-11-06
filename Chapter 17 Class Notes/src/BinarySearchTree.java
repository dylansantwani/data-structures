import java.util.*;

/**
 * This class implements a binary search tree whose
 * nodes hold objects that implement the Comparable
 * interface.
 */
public class BinarySearchTree {
    private Node root;

    /**
     * Constructs an empty tree.
     */
    public BinarySearchTree() {
        root = null;
        root.right = null;
        root.left = null;
    }

    /**
     * Inserts a new node into the tree.
     * 
     * @param obj the object to insert
     */
    public void add(Comparable obj) {
        Node newnode = new Node();
        newnode.data = obj;
        newnode.left = null;
        newnode.right = null;
        if (root.left == null && root.right == null && root.data == null) {
            root = newnode;
        } else {
            root.addNode(newnode);
        }
    }

    /**
     * Tries to find an object in the tree.
     * 
     * @param obj the object to find
     * @return true if the object is contained in the tree
     */
    public boolean find(Comparable obj) {
        if (root.data.equals(obj)) {
            return true;
        }
        if (root.left != null) {
            if (root.left.data.compareTo(obj) < 0) {
                return false;
            } else {
                BinarySearchTree subtree = new BinarySearchTree();
                subtree.root = root.left;
                return subtree.find(obj);
            }
        }
        if (root.right != null) {
            if (root.right.data.compareTo(obj) > 0) {
                return false;
            } else {
                BinarySearchTree subtree = new BinarySearchTree();
                subtree.root = root.right;
                return subtree.find(obj);
            }
        }
        return false;
    }

    /**
     * Tries to remove an object from the tree. Does nothing
     * if the object is not contained in the tree.
     * 
     * @param obj the object to remove
     */
    public void remove(Comparable obj) { // to complete
        if (root.data.equals(obj)) {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left != null && root.right == null) {
                root = root.left;
            } else if (root.right != null && root.left == null) {
                root = root.right;
            } else {
                // go to the nodes right child then all the way to the left then use that node
                // to replace the root
                Node leastParent = root;
                Node least = root.right;
                while (least.left != null) {
                    leastParent = least;
                    least = least.left;
                }
                root.data = least.data;

                while (leastParent.left != least) {
                    leastParent = least;
                    least = least.left;
                }
                leastParent.left = least.right;
            }

        }
        if (root.left != null) {
            if (root.left.data.compareTo(obj) < 0) {
                return;
            } else {
                BinarySearchTree subtree = new BinarySearchTree();
                subtree.root = root.left;
                subtree.remove(obj);
            }
        }
        if (root.right != null) {
            if (root.right.data.compareTo(obj) > 0) {
                return;
            } else {
                BinarySearchTree subtree = new BinarySearchTree();
                subtree.root = root.right;
                subtree.remove(obj);
            }
        }
    }

    /**
     * Prints the contents of the tree in sorted order.
     */
    public void print() {
        
    }

    /**
     * Prints a node and all of its descendants in sorted order.
     * 
     * @param parent the root of the subtree to print
     */
    private static void print(Node parent) {
        //print the tree using inorder traversal
        if (parent == null){
            return;
        }
        print(parent.left);
        System.out.println(parent.data + " ");
        print(parent.right);
        
        System.out.println();
    }

    /**
     * A node of a tree stores a data item and references
     * to the left and right child nodes.
     */
    static class Node {

        public Comparable data;
        public Node left;
        public Node right;

        /**
         * Inserts a new node as a descendant of this node.
         * 
         * @param newNode the node to insert
         */
        public void addNode(Node newNode) {
            if (newNode.data.compareTo(this.data) < 0) {
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else if (newNode.data.compareTo(this.data) == 0) {
                return;
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }
    }
}