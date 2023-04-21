

//Example : "apnacollege" >>> Output : "apncoleg" 
//remove the duplicate letter 


public class removeDuplicates {
    public static String removeDup(String str) {
        StringBuilder sb = new StringBuilder("");

        boolean alphabet[] = new boolean[26];

        for(int i=0;i<str.length();i++) {
            if(alphabet[str.charAt(i) - 'a'] != true) {
                alphabet[str.charAt(i) - 'a'] = true;
                sb.append(str.charAt(i)); 
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "apnacollege";

        System.out.println("After removing duplicates your string is : "+removeDup(str));
    }
}
