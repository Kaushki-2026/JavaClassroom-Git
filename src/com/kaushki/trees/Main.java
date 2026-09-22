package com.kaushki.trees;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees tree = new BinaryTrees();
        tree.populate(scanner);
        tree.display();
        tree.prettyDisplay();
    }
}
