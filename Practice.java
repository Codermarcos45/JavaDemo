import java.nio.charset.MalformedInputException;

//remove duplicates : "apnacollege" >>> "apncoleg"

class Practice  {
    public static void removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean alphabet[] = new boolean[26];

        for(int i = 0;i<str.length();i++) {

            if(alphabet[str.charAt(i) - 'a'] != true) {
                alphabet[str.charAt(i) - 'a'] = true;
                sb.append(str.charAt(i));
            } 
        }
        System.out.println(sb);

    }
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbcsfsfewtfsd";
        removeDuplicates(str);


    }
}