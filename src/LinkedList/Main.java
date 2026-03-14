package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(3);
        // list.insert(7,3);
        list.deleteNode(9);
        list.display();
    }
}
