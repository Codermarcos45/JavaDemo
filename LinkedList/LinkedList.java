/*
 Linked List : 
 LL is a linear data structure.
 LL is a collection of some nodes which contanis a data part & a pointer part.

 ADDING ELEMENTS : 
 Add first() : O(1)
 Step 1 -> Create new node;
 Step 2 -> New node's next = head;
 Step 3 -> head = new node;

 Add last() : O(1)
 Step 1 -> Create new node;
 Step 2 -> Tail's next = newNode;
 Step 3 -> newNode's next = Tail;

 Add in the middle(index, data) : O(n)  
 ----------------------------------------------------------- : >

 Print LinkedList :  O(n)
 1) Create a temporary node 
 2) while temp != null, print temp.data 
 3) temp = temp.next

 REMOVING ELEMENTS : 
 Remove first() : O(1)
 Step 1 -> head = head.next 
 After the step 1, garbage collector automatically delete the previous node.
 */

package LinkedList;

import JavaDemo.ArraysQuestions.printSubarrays;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    public void addFirst(int data) {
        //step 1 : create new node
        Node newNode = new Node(data);
        size++;
        //if linked list is empty 
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step 2 : New node's next = head
        newNode.next = head;

        //step 3 : head = new node
        head = newNode;
    }

    public void addLast(int data) {
        //step 1 : create new node
        Node newNode = new Node(data);
        size++;
        //if linked list is empty 
        if(tail == null) {
            tail = head = newNode;
        }

        //step 2 : Tail's next = newNode
        tail.next = newNode;

        //step 3 : newNode's next = tail
        tail = newNode;
    }


    public void printLinkedList() {     //O(n)
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    //Finding index == O(n) but linking == O(1) overall : O(n)
    public void add(int index,int data) { 
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < index-1) {
            temp = temp.next;
            i++;
        }

        //i == index-1 (temp -> prev)
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if(size == 0) {             //when linkedlist is empty 
            System.out.println("Linked list is empty!");
            return Integer.MIN_VALUE;
        } else if(size == 1) {      //when linkedlist contained only one element
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("linked list is empty!");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++) {
            prev = prev.next;
        }

        int val = prev.next.data;   //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key) {     //O(n)
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key) {     //O(n) 
        //base case
        if(head == null) return -1;

        //key found
        if(head.data == key) return 0;

        //recursive function
        int idx =  helper(head.next,key);

        //key not found!
        if(idx == -1) return -1;

        //returning the head's index + 1
        return idx+1;
    }   
    public int recurSearch(int key) {
        return helper(head,key);
    }

    /*
     REVERSE OF A LINKEDLIST : (Iterative approach)
     Step 1 -> next = curr.next;
     Step 2 -> curr.next = prev;
     Step 3 -> prev = curr;
     Step 4 -> curr = next;
     */

    public void reverse() {         //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        //3 variable & 4 steps

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    /*
     Find & Remove Nth node from end. (Iterative approach)
     */

     public void deleteNthFromEnd(int n) {
        //calculating size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        //if n == 1 (to delete head)
        if(sz == n) {
            head = head.next;       //remove first operation
            return;
        }

        //sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;

        while( i < iToFind) {
            prev = prev.next;       //actual previous
            i++;
        }

        prev.next = prev.next.next;
        return;
     }
     

     /*
      PALINDROME : 
      Check if a linked list is Palindrome.
     //Slow-fast concept
     //Half reverse LL
      */

      public Node findNode(Node head) {  //finding midNode by using slow-fast or Turtle-Hare technique
        Node turtle = head;
        Node hare = head;

        while(hare != null && hare.next != null) {
            turtle = turtle.next;       //jump by 1 step
            hare = hare.next.next;
        }

        return turtle;  //turtle is my midNode
      }

      public boolean isPalindrome() {
        //base cases or corner cases
        if(head == null || head.next == null) return false;

        //Step 1 : Find mid node.
        Node mid = findNode(head);      

        //Step 2 : Reverse the second half : (3 variable & 4 step)
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right  = prev;         //After reversing, prev = Second half's head (which will be my right pointer)
        Node left = head;           //left pointer

        //Step 3 : Checking 1st half == 2nd half ?
        while(right != null) {      
            if(left.data != right.data) return false;       
            left = left.next;
            right = right.next;
        }

        return true;
      }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLinkedList();
        System.out.println(ll.isPalindrome());
        

    }

    public void removeNthNodeFromEnd(int index) {
        Node temp = head;
        int sz = 0;

        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        if(index == sz) {
            head = head.next;       //remove first operation
            return;
        }

        int i = 1;
        int iToFind = sz - index;
        Node prev = head;

        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }


    
}