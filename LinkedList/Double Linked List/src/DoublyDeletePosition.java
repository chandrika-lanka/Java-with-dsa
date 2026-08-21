public class DoublyDeletePosition {

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

    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {

            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return;
        }

        Node current = head;

        for (int i = 1; i < position; i++) {

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

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
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

        DoublyDeletePosition list =
                new DoublyDeletePosition();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Before deletion:");
        list.display();

        list.deleteAtPosition(3);

        System.out.println("After deletion:");
        list.display();
    }
}