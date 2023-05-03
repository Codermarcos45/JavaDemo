package Recursion;

public class RemoveDuplicatesRecursion {
    
    public static void remDup(String str, int idx, StringBuilder sb, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar-'a'] != true) {
            map[currChar-'a'] = true;
            remDup(str, idx+1, sb.append(currChar), map);
        } else {
            remDup(str, idx+1, sb, map);
        }
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        remDup(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
