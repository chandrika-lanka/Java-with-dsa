public class LinkedListSearch {

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

    boolean search(int key) {

        Node current = head;

        while (current != null) {

            if (current.data == key) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {

        LinkedListSearch list = new LinkedListSearch();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        int key = 30;

        if (list.search(key)) {
            System.out.println(key + " found in the list");
        } else {
            System.out.println(key + " not found in the list");
        }
    }
}