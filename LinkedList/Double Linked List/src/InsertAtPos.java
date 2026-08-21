public class InsertAtPos {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
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
        newNode.prev = current;
    }

    void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {

            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            head = newNode;
            return;
        }

        Node current = head;

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
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

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

        InsertAtPos list =
                new InsertAtPos();

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