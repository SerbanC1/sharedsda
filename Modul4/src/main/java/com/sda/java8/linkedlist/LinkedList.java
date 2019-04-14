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
    void remove(int value){
//       if ( head.getNextElement().getNextElement()==null){  // conditia de eliminare a ultimului element + next line
//           head.setNextElement(null);                      // daca lista contine 2 elemente
//       }

//        for(Node nodCurent=head; nodCurent.getNextElement().getValue()==value; nodCurent=nodCurent.getNextElement()){
//
//        } // Nu putem sa folosin for  pentru ca

        // if the list is empty, we stop
        if (head==null){
            return;
        }
        // if the first element is the value, move the head to the next element
        if (head.getValue()==value){
            head=head.getNextElement();
            return;
        }
        // walk the list until we pass through all elements or we find the value
        Node nodCurent = head;
        while (nodCurent.getNextElement() != null && (nodCurent.getNextElement().getValue()!=value)){
            nodCurent=nodCurent.getNextElement();
        }

        // if we didn't find the element, end
        if(nodCurent.getNextElement()==null){
            return;
        }
        // remove the element
        nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());
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
