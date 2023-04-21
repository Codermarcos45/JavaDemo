/*
 Example : "hi, i am shradha"
 Output : "Hi, I Am Shradha"
 Time complexity : O(n)
 */
public class ConvertFirstLetterUpperCase {
    public static String toUpeprCase(String str) {
        StringBuilder sb = new StringBuilder();

        //converting & appending first character of the string 
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1;i<str.length();i++) {
            //if __ (space) is occured then convert the next character to uppercase
            if(str.charAt(i) == ' ' && i <str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am shradha";
        System.out.println(toUpeprCase(str));

    }
}
