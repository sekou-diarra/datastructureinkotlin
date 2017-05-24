package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sekou_diarra on 23/05/17.
 */
public class CustomArrayList {
    /* random access by index very very fast O(1)
    * remove item is O(N), not so efficient
    * equivalent to vector, but arrayList is not synchronized
    */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Joe");
        list.add("Kevin");

        Object[] array = list.toArray();
//        list.remove(0);

        for(String s : list){
            System.out.println(s);
        }
    }
}
