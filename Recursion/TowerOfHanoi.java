/*
 Rules : 1)Only one disk transferred in 1 step
         2)Smaller disks ae always kept on top oflarger disks
 */
//Time complexity : O(2^n)

 import java.util.Scanner;

public class TowerOfHanoi {
    static int i=1;
    public static void tower(int n, char source, char helper, char destination) {
        if(n==0) return;

        tower(n-1, source, destination, helper);
        System.out.println((i++)+" no. step : "+source+" -> "+destination);
        tower(n-1, helper, source, destination);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks : ");
        int disk = sc.nextInt();
        System.out.println("Your steps are : ");
        tower(disk, 'A', 'B', 'C');



    }   
    
}
