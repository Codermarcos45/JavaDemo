package ArrayLists;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

        //declaration
        ArrayList<Integer> list = new ArrayList<>();

        //adding element or insertion by using add() function
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //printing the list without loop
        System.out.println("List : "+list);

        //getting element throug index by using get() function 
        System.out.println("List index 01 : "+list.get(0));
        System.out.println("List index 02 : "+list.get(2));
        System.out.println("List index 03 : "+list.get(3));
        System.out.println("List index 04 : "+list.get(4));
        System.out.println("List index 05 : "+list.get(5));

        //removing element from an index by using remove() function
        list.remove(2);
        System.out.println("After deleting an element, list : "+list);

        //setting element through an index by using set() function
        list.set(2, 3);
        System.out.println("After settig an element, list : "+list);

        //adding element at specified index by using add function
        list.add(3,4);
        System.out.println("After adding an element, list : "+list);
        

        //printing all the elements by using loop
        for(int i=0;i<list.size();i++) {    //size() returns the size or length of the AL
            System.out.println(list.get(i));
        }

        //checking an element is present or not! || checking our AL is containing a specified element or not!
        System.out.println(list.contains(30)); //returns true or false
        

    }
    
}
