package com.kaushki.linkedList;

public class MainCLL {
    static void main() {
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);

        list.delete(19);

        list.display();

    }
}
