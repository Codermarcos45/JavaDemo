

/*
 Example : "aaaabbbbcccddd" >>> Output : "a4b4c3d3"
 but "abc" >>> output : "abc"
 */
public class StringCompression {
    public static String compressString(String str) {
        StringBuilder newStr = new StringBuilder("");
        

        for(int i=0;i<str.length();i++)  {
            Integer count = 1;
            
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));

            if(count > 1) {
                count.toString();
                newStr.append(count);
            }
        }

        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "aabbccdddddd";

        System.out.println(compressString(str));
    }

    
}
