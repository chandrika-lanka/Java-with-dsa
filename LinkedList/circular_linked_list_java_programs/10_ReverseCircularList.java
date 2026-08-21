public class _10_ReverseCircularList {
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

    static void reverse() {
        if (head == null || head.next == head) return;

        Node prev = null;
        Node cur = head;
        Node next;

        do {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        } while (cur != head);

        Node oldHead = head;
        head = prev;
        oldHead.next = head;

        Node t = head;
        while (t.next != oldHead)
            t = t.next;
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
        add(10); add(20); add(30); add(40);
        reverse();
        display();
    }
}
