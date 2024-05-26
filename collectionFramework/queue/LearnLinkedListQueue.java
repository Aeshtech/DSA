package collectionFramework.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue typically stores elements in FIFO (First in first out) order. LinkedList is the class which implements the Queue interface.
*/
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);

        System.out.println(queue);
        System.out.println("removed = " + queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
