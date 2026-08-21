public class _09_CountNodes {
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

    static int count() {
        if (head == null) return 0;
        int count = 0;
        Node t = head;
        do {
            count++;
            t = t.next;
        } while (t != head);
        return count;
    }

    public static void main(String[] args) {
        add(10); add(20); add(30); add(40);
        System.out.println("Nodes = " + count());
    }
}
