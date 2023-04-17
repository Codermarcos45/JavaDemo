import java.util.*;

public class Anagram {
    
    public static boolean isAnagram(String str, String newStr) {
        //removing white spaces 
        str = str.replace(" ","");
        newStr = newStr.replace(" ","");

        //convert into a character array
        char Array1[] = str.toCharArray();
        char Array2[] = newStr.toCharArray();

        //now sort the arrays
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        //Now check the equality (if equal return true else return false)
        if(Arrays.equals(Array1, Array2)) 
            return true;
        
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string : ");
        String str2 = sc.nextLine();

        System.out.println("Anagram :::>>> "+isAnagram(str1, str2));


    }
}
