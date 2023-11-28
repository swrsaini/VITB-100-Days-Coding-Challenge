class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }
    
    static void preorderTraversal(Node root, ArrayList<Integer> result){
        if( root != null){
            result.add(root.data);
            
            preorderTraversal(root.left, result);
            
            preorderTraversal(root.right, result);
        }
    }

}