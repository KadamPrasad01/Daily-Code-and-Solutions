package BinaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BT tree = new BT();
        // tree.populate(scanner);
        // tree.display();

        //Exectution of the easy BST code 

        easyBST tree = new easyBST();

        tree.root = tree.insert(tree.root , 10);
        tree.root = tree.insert(tree.root , 5);
        tree.root = tree.insert(tree.root , 15);
        tree.root = tree.insert(tree.root , 3);
        tree.root = tree.insert(tree.root , 7);

        System.out.println("Inorder Traversal");
        tree.displayInorder(tree.root);

        System.out.println("PreOrder Traversal");
        tree.displayPreorder(tree.root);
        System.out.println("PostOrder Traversal");
        tree.displayPostorder(tree.root);
    }
}
