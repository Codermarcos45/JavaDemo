package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

// Print all the element reverse of an ArrayList.

public class PrintElementReverse {  
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);System.out.println("Enter a number (-1 to exit) : ");
    int n = sc.nextInt();
    
    while(n!= -1) {
        list.add(n);
        System.out.println("Enter a number (-1 to exit) : ");
        n = sc.nextInt();
    }

    System.out.println("Your elements in reverse form are : ");
    for(int i=list.size()-1;i>=0;i--) {
        System.out.print(list.get(i)+"\t");
    }

    }
}
