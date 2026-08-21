public class InsertAtPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insertAtEnd(int data) {

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
    }

    void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        // Move to node before required position
        for (int i = 1; i < position - 1; i++) {

            if (current == null) {
                System.out.println("Invalid position");
                return;
            }

            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
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

        InsertAtPosition list = new InsertAtPosition();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("Before insertion:");
        list.display();

        list.insertAtPosition(30, 3);

        System.out.println("After insertion:");
        list.display();
    }
}