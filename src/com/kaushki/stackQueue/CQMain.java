package com.kaushki.stackQueue;
import java.util.Queue;

public class CQMain {
    static void main() throws Exception {
        CircularQueue queue= new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
