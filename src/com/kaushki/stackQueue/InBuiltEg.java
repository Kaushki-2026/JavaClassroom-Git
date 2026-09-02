package com.kaushki.stackQueue;
import java.util.*;

public class InBuiltEg {

        static void main() {
            /*
            Stack<Integer> stack = new Stack<>();
            stack.push(34);
            stack.push(14);
            stack.push(67);
            stack.push(89);
            stack.push(86);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());


             */

            /*
            Queue<Integer> queue = new LinkedList<>();
            queue.add(3);
            queue.add(6);
            queue.add(5);
            queue.add(19);
            queue.add(1);

            System.out.println(queue.peek());
            System.out.println(queue.remove());

             */

            Deque<Integer> deque = new ArrayDeque<>();
            /*
            It has no capacity restricted
            Null pointer are not allowed in this
            It is faster than linked list  and stack
             */

            deque.add(89);
            deque.addLast(78);
            deque.removeLast();
        }


}
