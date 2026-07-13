package com.kaushki.oop;

public class InheritanceBox {
    static void main() {
        Box box = new Box(4);
        // This will call Box constructor having only argrument

        System.out.println(box.l+ " "+box.w+ " "+box.h );
    }
}
