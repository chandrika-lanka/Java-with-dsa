public class _08_SearchElement {
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

    static boolean search(int value) {
        if (head == null) return false;
        Node t = head;
        do {
            if (t.data == value) return true;
            t = t.next;
        } while (t != head);
        return false;
    }

    public static void main(String[] args) {
        add(10); add(20); add(30);
        System.out.println(search(20) ? "Found" : "Not Found");
    }
}
