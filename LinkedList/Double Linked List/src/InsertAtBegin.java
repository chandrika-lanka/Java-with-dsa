public class InsertAtBegin{
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }

    }

    Node head = null;

    void insertAtBegin(int data){
        Node newnode = new Node(data);

        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    void display(){
        Node current = head;
        while(current !=null){
            System.out.print(current.data+" ");
            current = current.next;
        }

        System.out.println();
    }
    public static void main(String[] args){
        InsertAtBegin list = new InsertAtBegin();

        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);

        System.out.println("Insert At Begin: " );
        list.display();
    }
}