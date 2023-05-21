public class DoublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    //add at first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    //add at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //remove

    public int removeFirst() {
        if(head == null) {                  //if LL have no element
            return Integer.MIN_VALUE;
        } 

        if(head.next == null) {          //if LL have only one element
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return value;
    }

    //Remove Last
    public int removeLast() {
        if(head == null) {              //if LL have no element
            return Integer.MIN_VALUE;
        } 

        if(head.next == null) {
            int value = tail.data;
            head = tail = null;
            return value;
        }

        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;

        return value;
    }


    //Printing LinkedList
    public void printDoublyLL() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printReverse() {
        Node temp = tail;

        while(temp != null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    //REVERSE DOUBLY LINKED LIST : 3 variable & 5 steps (almost same as singly ll reverse)
    public void reverseDoublyLL() {
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;

    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(5);
        dll.addLast(6);
        dll.addLast(7);
        

        dll.printDoublyLL();

        dll.reverseDoublyLL();

        dll.printDoublyLL();    
        dll.printReverse();
    }
    
}
