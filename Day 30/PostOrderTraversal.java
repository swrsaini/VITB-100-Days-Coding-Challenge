class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }
    
    private void postOrderTraversal(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left, result);
        postOrderTraversal(node.right, result);
        result.add(node.data);
    }
}