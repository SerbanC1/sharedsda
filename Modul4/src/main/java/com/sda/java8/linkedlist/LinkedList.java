package com.sda.java8.linkedlist;

public class LinkedList {

    private Node head;
    //Adds new node to the list
    void add(Node node){
        // Test if is null then...
        // Else : set next element of head
        // parcurge = head
       // while parcurge has a next
        //   parcurge becomes parcurge.next
        // parcurge.next = node
       if (head == null){
           head = node;
           return;
       }
       Node parcurge = head;
       while (parcurge.getNextElement()!=null) {
           parcurge = parcurge.getNextElement();
           //  parcurge = 20 | null
           // node
       }
           parcurge.setNextElement(node);

    }
    // Display all element values of the list separated
    String print(){
        StringBuilder builder = new StringBuilder();
        for (Node nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()){
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }
}
