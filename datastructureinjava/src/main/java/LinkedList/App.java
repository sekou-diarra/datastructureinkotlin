package LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sekou_diarra on 24/05/17.
 */
public class App {
    public static void main(String[] args) {
//        ListCustom<Integer> list = new LinkedListCustom<Integer>();
//
//        list.insert(10);
//        list.insert(-2);
//        list.insert(3);
//        list.insert(100);
//
//        System.out.println(list.size());

        ListCustom<Person> list = new LinkedListCustom<Person>();

        Person p = new Person("adam", 10);

        list.insert(new Person("Adam", 10));
        list.insert(new Person("Kevin", 22));
        list.insert(new Person("Joe", 1));
        list.insert(new Person("Michael", 45));

        list.remove(p);

        list.traverselist();
    }
}
