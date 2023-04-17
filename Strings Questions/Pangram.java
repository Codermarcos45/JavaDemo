import java.util.*;

public class Pangram {

    public static boolean isPangram(String str) {
        //remove white spaces
        str =str.replace(" ","");
        //convert to upper/lower case
        str = str.toUpperCase();
        //convert the string into a Character Array
        char strArr[] = str.toCharArray();

        //creating a new boolean array with size of 26
        boolean Array[] = new boolean[26];

        for(int i=0;i<strArr.length;i++) {
            Array[strArr[i]-'A'] = true;
        }

        //now, traverse the boolean Array all the indexes are true or false 
        for(int i=0;i<Array.length;i++) {
            if(Array[i] != true) {
                return false;
            }
        }

        return true;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string :> ");
        String str = sc.nextLine();

        System.out.println("Pangram :::>>> "+isPangram(str));



    }
}
