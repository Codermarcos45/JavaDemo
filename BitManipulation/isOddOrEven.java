package BitManipulation;

public class isOddOrEven {
    public static void oddEven(int num) {
        if((num & 1) == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }   
    public static void main(String[] args) {
        oddEven(10);
    }
    
}
