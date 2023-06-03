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

import javax.xml.transform.Templates;

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


    public  void printLinkedList(Node headNode) {     //O(n)
        Node temp = headNode;

        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    public static void printLinkedListRecursive(Node headNode) {
        if(headNode == null) {
            System.out.print("null");
            return;
        }
        System.out.print(headNode.data+" -> ");
        printLinkedListRecursive(headNode.next);
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


      /*
       Detect a Loop/Cycle in a LinkedList :
       Approach : Floyd's cycle finding algorithm (slow-fast technique).
       */

    public static boolean detectingLoop() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;       // +1 moves
            fast = fast.next.next;  // +2 moves

            if(slow == fast) return true;       //cycle exists
        }

        return false;               //cycle doesn't exist
      }
     /*
     Detecting loop true condtion code
      head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.next.next.next.next = head;
        
        System.out.println(detectingLoop());
      */

      /*
       Remove a LOOP/CYCLE from a Linked List : 
       Approach : Java Notebook
       */
    public static void removeCycle() {
        // Step 1 : Detect loop
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;       //loop detected!
                break;
            }    
        }

        if(cycle == false) return;      //loop not find!

        // Step 2 : Find meeting point
        Node prev = null;
        slow = head;
        

        while(slow != fast) {
            slow = slow.next;       //+1 moves
            prev = fast;
            fast = fast.next;       // +1 moves
        }

        // Step 3 : Remove cycle -> lastNode.next = null
        prev.next = null;       //prev our lastNode so that prev.next = null & finally loop removed!!!

      }

    /*
     MERGE SORT ON LINKEDLIST : 
     Time complexity : O(nlogn)
     Space complexity : O(n)
     Inputs : 
     /* 
     LinkedList ll = new LinkedList();

        ll.addLast (2);
        ll.addLast(9);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(10);
        ll.addLast(1);
        ll.addLast(9);
        ll.addFirst(11);

        ll.printLinkedList(head);

        head = ll.merge2Sort(head);
        ll.printLinkedList(head); */
    
    public Node mergeSort(Node headNode) {
        //base case
        if(headNode == null || headNode.next == null) return headNode;

        Node mid = getMid(headNode);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(headNode);
        Node newRight = mergeSort(rightHead);

        return merger(newLeft,newRight);
      }

    private Node merger(Node left, Node right) {
        Node dumyLL = new Node(-1);
        Node temp = dumyLL;

        while(left != null && right != null) {
            if(left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while(left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return dumyLL.next;


      }

    private Node getMid(Node headNode) {
            Node slow = headNode;
            Node fast = headNode.next;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
      }




    /*
    ZIG-ZAG Linked List :  MEDIUM LEVEL QUESTION
    For a linked list of the form : L(1) -> L(2) -> L(3) -> L(4)... L(n-1) -> L(n)
    convert it into a zig-zag form i.e. : L(1) -> L(n) -> L(2) -> L(n-1) -> L(3) -> L(n-2)...
    |1| -> |2| -> |3| -> |4| -> |5|
    Form :      |1| -> |5| -> |2| -> |4| -> |3| 

    Approach : (slightly similar to palindrome)
    Step 1 : Find mid (mid ==  1st half's lastNode)
    Step 2 : Reverse second half
    Step 3 : Alternate merging (most important step -->> Notebook)
    */  
    private Node findMidNode() {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zigZagLL() {
        //Step 1 : Find mid 
        Node mid = findMidNode();
        

        //Step 2 : Reverse 2nd half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node nxt;

        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        Node leftHead = head;               //1st half's head
        Node rightHead = prev;               //2nd half's head
        

        //Step 3 : Alternate merging
        
        Node nextR, nextL;

        while(leftHead != null && rightHead != null) {
            //Zig-Zag steps
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            //Updation steps
            leftHead  = nextL;
            rightHead = nextR;

        }

    }
    
    public Node mid2Node(Node headNode) {
        Node turtle = headNode, hare = headNode.next;

        while(hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }

        return turtle;
    }
    public Node merge2Sort(Node headNode) {
        //base case
        if(headNode == null || headNode.next == null) return headNode;

        Node mid = mid2Node(headNode);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = merge2Sort(headNode);   //left part call
        Node right = merge2Sort(rightHead);  //right part call

        return merger2(left,right);

    }

    public Node merger2(Node left, Node right) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(left != null && right != null) {
            if(left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next  = right;
                right = right.next;
                temp = temp.next;
                
            }

            
        }

        while(left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while(right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }



    //print zigzag : 1)find mid, 2)reverse second half 3)alternate merging

    public void zigzag(Node headNode) {
        Node mid = findMid2(headNode);

        //reverse second half
        Node rightHead = mid.next;
        mid.next = null;

        Node prev = null;
        Node curr = rightHead;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        rightHead = prev;

        Node left = headNode;
        Node right = rightHead;
        Node leftPntr = null;
        Node ritPntr = null;

        while(left != null && right != null) {
            //zigzag steps
            leftPntr = left.next;
            ritPntr = right.next;
            left.next = right;
            right.next = leftPntr;

            //updation steps
            left = leftPntr;
            right = ritPntr;
        }

    }

    private Node findMid2(Node headNode) {
        Node turtle = headNode;
        Node hare = headNode.next;

        while(hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
    }


    public static Node reverseRecursive(Node headNode) {
        if(headNode.next == null) return headNode;

        Node newNode = reverseRecursive(headNode.next);
        headNode.next.next = headNode;
        headNode.next = null;
        return newNode;
    }

    public boolean isPalindrome2(Node headNode) {
        //find mid
        //reverse 2nd half
        //checking 1st & 2nd half data
        Node mid = findMid2(headNode);
        Node left = headNode;
        Node right = mid.next;
        mid.next = null;

        Node prev = null;
        Node curr = right;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        right = prev;

        while(right != null) {
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    /*
    TWIN SUM PROBLEM : 
    Find the maximum twin sum of a linkedlist  of even length.
    Twin of any node at (i)th index is the node at (n-1-i)th index. Twin sum is the sum of values of a node and its twin.
     */

    public int twinSum(Node headNode) {
        if(head == null) return Integer.MIN_VALUE;      //in case of linked list    
        if(head.next == null) return head.data;         // if linked list contains 1 values

        //Step 1 : Find mid
        Node mid = findMid2(headNode);                  //mid
        Node right = mid.next;
        mid.next = null;

        //Step 2 : Reverse 2nd half
        Node prev = null;
        Node curr = right;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        right = prev;   //prev is head of reversed 2nd half
        Node tempLeft = headNode;


        Node tempRight = right;
        int maxSum = Integer.MIN_VALUE;

        while(tempRight != null) {
            if((tempLeft.data + tempRight.data) > maxSum) {
                maxSum = tempLeft.data + tempRight.data;
            }
            tempLeft = tempLeft.next;
            tempRight = tempRight.next;
        }

        return maxSum;
    }

    /*
     * Copy List with random pointer : 
     * Construct a deep copy of a linked list where each node contains an additional random pointer, which 
     * could point to any node in the list or null.
     * An interesting question!
     */

    public static Node deepCopy(Node headNode) {
        Node finalNode = new Node(-1);
        Node temp = finalNode;
        Node h = headNode;

        while(h != null) {
            Node newNode = new Node(h.data);
            temp.next = newNode;
            temp = temp.next;
            h = h.next;
        }

        return finalNode.next;
    }

    public static void main(String[] args) {
        
        LinkedList l1 = new LinkedList();

        l1.addFirst(1);
        l1.addLast(200);
        l1.addLast(3);
        l1.addLast(40);
        l1.addLast(5);
        l1.addLast(6);
        l1.printLinkedList(head);
        
        Node newNode = deepCopy(head);

        printLinkedListRecursive(newNode);

    }

    
    
}