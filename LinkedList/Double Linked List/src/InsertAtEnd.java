public class InsertAtEnd{
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;

        }
    }

    Node head = null;

    void insertAtEnd (int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newnode;
        newnode.prev = current;
    }

    void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        InsertAtEnd list = new InsertAtEnd();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Inserted at End");
        list.display();
    }
}