package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("adam");
        queue.add("Joe");
        queue.add("kevin");

        System.out.println(queue.element());
//        System.out.println(queue.element());
//        System.out.println(queue.element());
    }
}
