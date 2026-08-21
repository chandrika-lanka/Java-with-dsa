public class DoublyDeleteBeginning {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    void deleteAtBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DoublyDeleteBeginning list =
                new DoublyDeleteBeginning();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before deletion:");
        list.display();

        list.deleteAtBeginning();

        System.out.println("After deletion:");
        list.display();
    }
}