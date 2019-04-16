package com.sda.java8.binarysearchtree;

public class Application {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
//        bst.add(40);
//        bst.add(50);
//        bst.add(30);
//        bst.add(20);
//        bst.add(35);
//        bst.add(32);
        for(int i=0; i< 1000; i++) {
            bst.add(i);
        }

        bst.print();
//        doubleLinkedList();
//        singleLinkedList();
    }
}
