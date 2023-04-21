public class Substring {
    
    public static String getSubstring(String str, int sI, int eI) {
        String newStr = "";
        for(int i=sI;i<eI;i++) {
            newStr += str.charAt(i);
        }

        return newStr;
    }
    public static void main(String[] args) {
        String str = "Biswarup";
        System.out.println((getSubstring(str, 2, 4)));

        //In-built substring
        System.out.println(str.substring(0, 5));
    }
}
