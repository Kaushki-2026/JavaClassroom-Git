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

        /*
        insertionBST tree = new insertionBST();
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        // If the array is sorted, the tree created will be unbalanced
        tree.populate(nums);
        tree.display();

         */

        /*
        AVL tree = new AVL();
        for(int i = 0; i< 1000; i++){
            tree.insert(i);
        }
        System.out.println(tree.height());

         */

        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
     //
        //   tree.display();
        System.out.println(tree.query(1,6));
    }
}
