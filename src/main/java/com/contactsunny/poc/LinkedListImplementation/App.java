package com.contactsunny.poc.LinkedListImplementation;

import com.contactsunny.poc.LinkedListImplementation.linkedList.LinkedList;

public class App {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        linkedList.addToTail(4);

        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        System.out.println("Traversing linked list");
        linkedList.traverse();

        System.out.println("Deleting first node with value 2");
        linkedList.delete(2);

        System.out.println("Traversing linked list after deletion");
        linkedList.traverse();

        System.out.println("Adding value 5 after the node with index 1");
        linkedList.addAfterIndex(5, 1);

        System.out.println("Traversing linked list after adding new node after index 1.");
        linkedList.traverse();

        System.out.println("Deleting node at index 2");
        linkedList.deleteNodeAtIndex(2);

        System.out.println("Traversing linked list after deleting node at index 2.");
        linkedList.traverse();

        System.out.println("Deleting node after index 3");
        linkedList.deleteNodeAfterIndex(3);

        System.out.println("Traversing linked list after deleting node after index 3.");
        linkedList.traverse();
    }
}
