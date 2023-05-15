package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

//Find the maximum number of an ArrayList.
//Time complexity : O(n)

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);System.out.println("Enter a number (-1 to exit) : ");
        int n = sc.nextInt();
    
        while(n!= -1) {
            list.add(n);
            System.out.println("Enter a number (-1 to exit) : ");
            n = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++) {
            // if(max < list.get(i)) max = list.get(i);
            max = Math.max(max, list.get(i));
        }

        System.out.println("Maximum element : "+max);
    }
}
