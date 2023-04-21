package BitManipulation;



public class Operations {
    public static int getIthBit(int num,int i) {
        int bitMask = 1<<i;

        if((num&bitMask) == 0) {
            return 0;
        }
        return 1;

    }

    public static int setIthBit(int num,int i) {
        int bitMask = 1<<i;

        return num | bitMask;
    }

    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1<<i);

        return num & bitMask;
    }

    public static int updateIthBit(int num,int i, int bit) {
        //simple process
        
        /* 
         if(bit == 0) {
            return clearIthBit(num,i);
         } else {
            return setIthBit(num,i);
         } */


         // another process
         num = clearIthBit(num, i);

         int bitMask = bit << i;

         return num | bitMask;
         
    }

    public static int clearLastIthBits(int num, int i) {
        //example : 1111 (clear last 2 bits) >>> output : 1100
        int bitMask = (-1)<<i;          //(~0) & (-1) are same

        return num & bitMask;
    }
    public static void main(String[] args) {

        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(15, 3));
        // System.out.println(updateIthBit(15, 1, 0));
        System.out.println(clearLastIthBits(15, 3));
        
        
    }
    
}
