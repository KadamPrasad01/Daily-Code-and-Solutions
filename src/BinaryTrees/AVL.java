package BinaryTrees;

public class AVL{

    public class Node{
        int val;
        int height;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            height = 1;
        }
    }

    Node root;

    // Height function
    int height(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    // Get balance factor - It tells us whether a node in AVL tree is balanced or not value should be (-1 , 0 , 1) other than this means the tree is unbalanced.
    int getBalance(Node node){
        if(node == null){
            return 0;
        }
        return height(node.left) - height(node.right);
    }

//          RIGHT ROTATION 
//        y
//      /                       x
//     x      ---->            / \
//    /                       A   y
//   A

    // In the above tree y is unbalanced and to make it balanced we need to right rotate it and make x the root and A and y the left and right children.
    // y is the node to be rotated to right.
    Node rightRotate(Node y){
        Node x = y.left; // currently x is left child of y
        Node T2 = x.right; // we declare a node 

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation
    Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert with AVL balancing
    Node insert(Node node , int val){

        if(node == null){
            return new Node(val);
        }

        if(val < node.val){
            node.left = insert(node.left , val);
        }else if(val > node.val){
            node.right = insert(node.right , val);
        }else{
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL Case
        if(balance > 1 && val < node.left.val){
            return rightRotate(node);
        }

        // RR Case
        if(balance < -1 && val > node.right.val){
            return leftRotate(node);
        }

        // LR Case
        if(balance > 1 && val > node.left.val){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if(balance < -1 && val < node.right.val){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Traversals
    void displayInorder(Node node){
        if(node == null) return;
        displayInorder(node.left);
        System.out.print(node.val + " ");
        displayInorder(node.right);
    }

    void displayPreorder(Node node){
        if(node == null) return;
        System.out.print(node.val + " ");
        displayPreorder(node.left);
        displayPreorder(node.right);
    }

    void displayPostorder(Node node){
        if(node == null) return;
        displayPostorder(node.left);
        displayPostorder(node.right);
        System.out.print(node.val + " ");
    }
}