package BinaryTrees;

public class BST {

    public static class Node{
        int val;
        Node left; 
        Node right;
        int height;

        Node(int val){
            this.val = val;
        }

        public int getValue(){
            return val;
        }
    }

    private Node root;

    // this is the function to calculate the height from a given node it can also be the root node.
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    //Function to check if there is tree;
    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root , "Root Node : ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left , "Left child of : " + node.getValue() + ":");
        display(node.right , "Right child of : " + node.getValue() + ":");
    }

    public void insert(int val){

    }
    // private Node insert(int val , Node node){
    //     if(node == null){
    //         return new Node(val);
    //     }
    //     if(val < node.val){
    //         node.left = insert(val , node.left);
    //     }else{
    //         node.right = insert(val , node.right);
    //     }
    // }
}
