/*
 Create a muliti-dimensional list & add these elements.
 list1 = 1,2,3,4,5;
 list2 = 2,4,6,8,10;
 list3 = 3,6,9,12,15;
 */
package ArrayLists;
import java.util.ArrayList;

public class BasicQs1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        //adding elements
        for(int i=1;i<=5;i++) {
            list1.add(i*1);     //1 2 3 4 5
            list2.add(i*2);     //2 4 6 8 10
            list3.add(i*3);     //3 6 9 12 15
        }

        //adding lists to mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        //print
        System.out.println(mainList);
    }
}
