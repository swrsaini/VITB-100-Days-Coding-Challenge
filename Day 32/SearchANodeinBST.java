class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        if (root == null || root.data == x) {
            return root != null;
        }

        if (x < root.data) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
        }
    }
}