package Chapter16Practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueReverseOrder {

    static class PQsort implements Comparator<Double> {

        public int compare(Double one, Double two) {
            return (int) (two - one);
        }
    }

    public static void main(String[] args) {
        double[] ia = {1.2, 10.5, 5.3, 3.0, 4.9, 7.6, 6.9, 9.5, 8.0};
        PriorityQueue<Double> pq1 = new PriorityQueue<Double>();

        // use offer() method to add elements to the PriorityQueue pq1
        for (double x : ia) {
            pq1.offer(x);
        }

        System.out.println("pq1: " + pq1);

        PQsort pqs = new PQsort();
        PriorityQueue<Double> pq2 = new PriorityQueue<Double>(10, pqs);
        // In this particular case, we can simply use Collections.reverseOrder()
        // instead of self-defined comparator
        for (double x : ia) {
            pq2.offer(x);
        }

        System.out.println("pq2: " + pq2);

        // print size
        System.out.println("size: " + pq2.size());
        // return highest priority element in the queue without removing it
        System.out.println("peek: " + pq2.peek());
        // print size
        System.out.println("size: " + pq2.size());
        // return highest priority element and removes it from the queue
        System.out.println("poll: " + pq2.poll());
        // print size
        System.out.println("size: " + pq2.size());

        System.out.print("pq2: " + pq2);

    }
}
