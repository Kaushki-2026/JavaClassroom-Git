package com.kaushki.trees;

import java.util.Scanner;

public class Main {
    static void main() {
        /*
        Scanner scanner = new Scanner(System.in);
        BinaryTrees tree = new BinaryTrees();
        tree.populate(scanner);
        tree.display();
        tree.prettyDisplay();

         */
        insertionBST tree = new insertionBST();
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        // If the array is sorted, the tree created will be unbalanced
        tree.populate(nums);
        tree.display();
    }
}
