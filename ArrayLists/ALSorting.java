package ArrayLists;
import java.util.*;


public class ALSorting {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(2);
    list.add(1);
    list.add(4);
    list.add(3);

    System.out.println("Before Sorting, List : "+list);

    //Inbuilt sorting technique <most optimized>
    Collections.sort(list);
    System.out.println("After Sorting (Ascending order), List : "+list);

    //Inbuilt sorting technique (reverese order) <most optimized>
    Collections.sort(list, Collections.reverseOrder());
    System.out.println("After Sorting (Descending order : ), List : "+list);


    
    }
}
