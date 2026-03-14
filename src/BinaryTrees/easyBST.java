package BinaryTrees;

public class easyBST {
    public class Node{
        int val; 
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    Node root;

    //Insert the node into tree;

    Node insert(Node node , int val){
        if(node == null){
            // If there is no node in the tree or current creation of the node is a leaf node then we need to create a new node and pass the value to it.
            return new Node(val);
        }

        if(val < node.val){
            node.left = insert(node.left , val);
        }else{
            node.right = insert(node.right , val);
        }
        return node;
    }

    //Display tree function;
    void displayInorder(Node node){
        if(node == null){
            return;
        }
        displayInorder(node.left);
        System.out.println(node.val + " ");
        displayInorder(node.right);
    }
    void displayPreorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val + " ");
        displayPreorder(node.left);
        displayPreorder(node.right);
    }
    void displayPostorder(Node node){
        if(node == null){
            return;
        }
        displayPostorder(node.left);
        displayPostorder(node.right);
        System.out.println(node.val + " ");
    }
}
