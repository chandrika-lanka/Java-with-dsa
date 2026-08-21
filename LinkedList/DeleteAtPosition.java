public class DeleteAtPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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
    }

    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;

        // Move to node before target
        for (int i = 1; i < position - 1; i++) {

            if (current.next == null) {
                System.out.println("Invalid position");
                return;
            }

            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Invalid position");
            return;
        }

        current.next = current.next.next;
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

        DeleteAtPosition list = new DeleteAtPosition();

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