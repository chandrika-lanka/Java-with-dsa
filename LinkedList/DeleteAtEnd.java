public class DeleteAtEnd {

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

    void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        // Find second-last node
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
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

        DeleteAtEnd list = new DeleteAtEnd();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before deletion:");
        list.display();

        list.deleteAtEnd();

        System.out.println("After deletion:");
        list.display();
    }
}