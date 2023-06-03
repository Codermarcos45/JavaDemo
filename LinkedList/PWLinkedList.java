

public class PWLinkedList {

    public static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int index, int data) {

        if(index == 0) {    //if index = 0
            addFirst(data);
            return;
        }

        if(index == size) {
            addLast(data);
            return;
        }

        if(index > size) {
            System.out.println("Not possible!");
            return;
        }

        Node prev = null;
        Node curr = head;
        int i = 0;

        while(i < index) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        Node newNode = new Node(data);
        size++;

        prev.next = newNode;
        newNode.next = curr;
    }

    public void printLinkedList(Node head) {
        
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void printLinkedList2(Node head) {
        
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public int removeFirst() {
        if(head == null) {
            return Integer.MIN_VALUE;
        } if(head.next == null) {
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
        if(head == null) {
            return Integer.MIN_VALUE;
        } 
        if(head.next == null) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        
        Node prev = head;
        while(prev.next != tail) {
            prev = prev.next;
        }

        tail = prev;
        tail.next = null;
        return val;
    }

    /*
     Leetcode qs 1 : 
     Can we delete a node given the node itself as a parameter?
     If there any efficient way, provide that the given node is not the last node...
     */


     /*
     Leetcode qs 2 : 
      Find nth node from the end of LinkedList.
      */
        //Approach 1 : 
      public Node findNthNode(Node headNode,int index) {
        if(index > size) {
            return null;
        }
        int size = 0;
        Node temp = headNode;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        temp = headNode;
        int i = 0;
        int iToFind = size - index;

        while(i < iToFind) {
            temp = temp.next;
            i++;
        }

        return temp;
    }
    //Approach 2 : 
    public Node findNthNode2(Node headNode, int index) {
        Node slow = headNode;
        Node fast = headNode;

        for(int i=1;i<=index;i++) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }



    /*
    Leetcode qs 3 : 
    Find & delete Nth node from end.
    */ 
    //Approach 1 : 
    public int deleteNthNodeFromEnd(Node headNode, int index) {
        int sz = 0;
        Node temp = headNode;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        int i = 1;      //starts from 1 because we gonna at previous index of which are to be deleted
        int iToFind = sz - index;
        Node prev = headNode;

        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    //Approach 2 : 
    public void deleteNthNodeFromEnd2(Node headNode, int index) {
        Node slow = headNode;
        Node fast = headNode;

        for(int i=1;i<=index;i++) {
            if(fast == null) {
                return;
            }
            fast = fast.next;
        }

        if(fast == null) {
            head = head.next;
            return;
        }

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node temp = slow;
        slow.next = slow.next.next;
    }

    /*
     Finding Intersection of Two LinkedList : 
        Two pointers to the rescue -> 
     */
    public static Node intrSctionLinkedList(Node head1, Node head2) {
        //Calculatiing size of first linkedlist
        Node slow = head1;
        int sz1 = 0;
        while(slow != null) {
            sz1++;
            slow = slow.next;
        }

        //Calculatiing size of second linkedlist
        Node fast = head2;
        int sz2 = 0;
        while(fast != null) {
            sz2++;
            fast = fast.next;
        }

        //Two pointer 
        slow = head1;
        fast = head2;

        if(sz1 != sz2) {
            if(sz1 < sz2) {
                int sub = sz2-sz1;
                int i = 0;
                while(i < sub) {
                    fast = fast.next;
                    i++;
                }
            } else {
                int sub = sz1-sz2;
                int  i = 0;
                while(i < sub) {
                    slow = slow.next;
                    i++;
                }
            }
        }

        while(slow != null && fast != null) {
            if(slow == fast) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return null;


    }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node mergeLL = new Node(5);
        Node temp = mergeLL;

        Node left = list1, right = list2;

        while(left != null && right != null) {
            if(left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
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

    public void printLinkedListRecursive(Node headNode) {
        if(headNode == null) return;        //base case
        printLinkedListRecursive(headNode.next);    //recursive call
        System.out.println(headNode.data);      //work
    }

    public static Node reverseLinkedListRecursive(Node headNode) {
        //base case
        if(headNode.next == null) return headNode;

        Node newNode = reverseLinkedListRecursive(headNode.next);   
        headNode.next.next = headNode;
        headNode.next = null;
        return newNode;
    }
    public static void main(String[] args) {
        
        PWLinkedList list1 = new PWLinkedList();

        list1.addFirst(1);
        list1.addLast(2);
        list1.addLast(30);
        list1.addLast(40);
        list1.addLast(50);

        list1.printLinkedListRecursive(head);



        Node newNode = reverseLinkedListRecursive(head);

        printLinkedList2(newNode);









        // PWLinkedList ll = new PWLinkedList();

        // ll.addFirst(0);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(5);
        // ll.addLast(7);
        // ll.addLast(8);
        // ll.addLast(9);

        // ll.printLinkedList();

        // // System.out.println((ll.deleteNthNodeFromEnd2(head, 2)));
        // ll.deleteNthNodeFromEnd2(head, 10);


        // ll.printLinkedList();
        

    }
    
}
