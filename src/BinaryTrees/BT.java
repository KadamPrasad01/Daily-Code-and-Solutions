package BinaryTrees;
import java.util.*;

public class BT {
    
    // This is the basic structure of the node in the tree.
    private static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    private Node root;

    //Insert the elements in the tree;
    // This inserts the root of the tree and makes scope for adding the left and right child of that node.
    // Since every node can be called as root node so it is passed recursively in it. 
    public void populate(Scanner scanner){
        System.out.println("Enter the Root Node : ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner , root);
    }

    // Firstly the root node is created and we ask the user if he wants to add the left node for the root node and if not it asks for the right of the node.
    // 
    private void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter the left node of : " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left node of : " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner , node.left);
        }

        System.out.println("Do you want to enter the right node of : " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right node of : " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner , node.right);
        }
    }
    // This ist done because when user calls the display function we dont want user to pass those extra values every time so what we did we removed the parameters and call it recursively in that function only.
    public void display(){
        display(root , "");
    }
    private void display(Node node , String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");
    }

    
}
