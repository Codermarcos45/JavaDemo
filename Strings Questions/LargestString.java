//For a givcen set of Strings, print the largest string.
// >>> "apple", "banana", "mango"

public class LargestString {
    public static String largest(String fruits[]) {
        String large  = fruits[0];
        for(int i=1;i<fruits.length;i++) {
            if(large.compareTo(fruits[i]) < 0) {
                large = fruits[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        String fruits[] = {"Mango","Banana","Apple"};
        System.out.println("Largest string : "+largest(fruits));
    }
    
}
