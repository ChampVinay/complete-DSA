package linkedList;

public class InsertNodeAtStarting extends LinkList {
    public Node insertNodeAtStart(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        InsertNodeAtStarting linkList = new InsertNodeAtStarting();
        InsertNodeAtStarting.Node head = linkList.new Node(5);
        head.next = linkList.new Node(10);
        head=linkList.insertNodeAtStart(head, 20);
        linkList.display(head);
    }
}
