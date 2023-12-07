class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }
    private void inOrderTraversal(Node root, ArrayList<Integer> result) {
        if (root != null) {
            inOrderTraversal(root.left, result);
            result.add(root.data);
            inOrderTraversal(root.right, result);
        }
    }
}