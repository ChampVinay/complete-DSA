package linkedList;

public class LinkList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this .data=data;
            this.next=null;
        }
    }

    public void insertNodeAtEnd(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        
        LinkList linkList=new LinkList();
        Node head=linkList.new Node(5);
        head.next=linkList.new Node(10);
        linkList.insertNodeAtEnd(head,20);
        linkList.insertNodeAtEnd(head,30);
        linkList.insertNodeAtEnd(head,40);
        linkList.insertNodeAtEnd(head,50);
        linkList.display(head);
    }
}
