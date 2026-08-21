public class _05_DeleteBeginning {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node head = null;

    static void add(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n; n.next = head; return;
        }
        Node t = head;
        while (t.next != head) t = t.next;
        t.next = n; n.next = head;
    }

    static void deleteBeginning() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node t = head;
        while (t.next != head) t = t.next;
        head = head.next;
        t.next = head;
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
        add(10); add(20); add(30);
        deleteBeginning();
        display();
    }
}
