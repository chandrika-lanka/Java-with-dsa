public class _04_InsertAtPosition {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node head = null;

    static void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        Node t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }

    static void insertAtPosition(int data, int pos) {
        Node n = new Node(data);

        if (pos <= 1 || head == null) {
            if (head == null) {
                head = n;
                n.next = head;
            } else {
                Node t = head;
                while (t.next != head) t = t.next;
                n.next = head;
                t.next = n;
                head = n;
            }
            return;
        }

        Node t = head;
        for (int i = 1; i < pos - 1 && t.next != head; i++)
            t = t.next;

        n.next = t.next;
        t.next = n;
    }

    static void display() {
        if (head == null) return;
        Node t = head;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != head);
    }

    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(40);
        insertAtPosition(30, 3);
        display();
    }
}
