public class DoubleLinkedList{
    static class Node{
        int data;
        Node pre;
        Node next;

        Node (int data){
            this.data = data;
            this.pre = null;
            this.next = null;
        }
    }
    Node head = null;

    void insert(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
        newnode.pre = current;
    }
    void traverse(){
        Node current = head;

        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        DoubleLinkedList list = new DoubleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Double Linked List:");
        list.traverse();
    }
}