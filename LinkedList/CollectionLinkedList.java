// package LinkedList;
import java.util.LinkedList;

public class CollectionLinkedList {
    
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);

        LinkedList<Integer> aa = new LinkedList<>();
        aa.addFirst(12);
        aa.addFirst(22);
        aa.addFirst(32);
        aa.addFirst(42);
        aa.addFirst(52);
        System.out.println(aa);


        LinkedList<LinkedList<Integer>> ll1 = new LinkedList<>();
        ll1.addFirst(ll);
        ll1.addLast(aa);

        System.out.println(ll1);



        
    }

    
}
