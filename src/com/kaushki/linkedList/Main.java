package com.kaushki.linkedList;

public class Main {
    static void main() {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.insertLast(99);

        list.display();

    }
}
