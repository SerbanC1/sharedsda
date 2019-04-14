package com.sda.java8.linkedlist;

public class DoubleLinkedList {
    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    void add(DoubleLinkedNode node) {
        if (head == null) {
            head = node;
            tail = head;
            return;
        }

        tail.setNextElement(node);
        node.setPreviousElement(tail);
        tail = node;

    }


        String print () {
            StringBuilder builder = new StringBuilder();
            for (DoubleLinkedNode nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()) {
                builder.append(nodCurent.getValue());
                builder.append(" ");
            }
            return builder.toString();
        }

    String printReverse () {
        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = tail; nodCurent != null; nodCurent = nodCurent.getPreviousElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }


}