package DSA;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(); // Array List defined.
        list.add(10); // function for adding values.
        list.add(20);
        list.add(30);
        System.out.println(list); // printing list
        System.out.println(list.size()); // printing size of the list

        list.add(0, 5); // function used to add the value in between the list
        System.out.println(list);

        list.set(0, 0); // function used to change the value.
        System.out.println(list);

        list.remove(0); // function used to remove.
        System.out.println(list);

        // printing the content of the Array List.
        for(int i = 0; i < list.size(); i ++){
            int val = list.get(i);
            System.out.print(val + " ");
        }
        System.out.println(); // just a line break after full code.
    }
}
