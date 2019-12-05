package com.contactsunny.poc.LinkedListImplementation.linkedList;

public class LinkedList<T> {

    private Node<T> head;

    public void push(T value) {

        if (this.head == null) {
            this.head = new Node<T>();
            this.head.setData(value);
        } else {
            Node<T> newNode = new Node<T>();
            newNode.setData(value);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public void traverse() {

        if (this.head != null) {
            Node<T> currentNode = this.head;

            while (currentNode != null) {
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }

            System.out.println("END");

        } else {
            System.out.println("Linked list is empty.");
        }
    }

    public void addToTail(T value) {

        if (this.head == null) {
            this.head = new Node<T>();
            this.head.setData(value);
        } else {

            Node<T> lastNode = this.head;

            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }

            Node<T> newNode = new Node<T>();
            newNode.setData(value);

            lastNode.setNext(newNode);
        }
    }

    public void delete(T value) {

        if (this.head != null) {
            Node<T> currentNode = this.head;
            Node<T> previousNode = this.head;

            while (currentNode != null) {
                if (currentNode.getData() == value) {
                    previousNode.setNext(currentNode.getNext());

                    System.out.println("Deleted first node with value " + value);
                    break;
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    public void addAfterIndex(T value, int index) {

        if (this.head == null) {
            this.head = new Node<T>();
            this.head.setData(value);
        } else {

            int nodeIndex = 0;

            Node<T> currentNode = this.head;

            while (index > nodeIndex) {
                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }

                nodeIndex++;
            }

            if (nodeIndex == index) {
                Node<T> newNode = new Node<T>();
                newNode.setData(value);
                newNode.setNext(currentNode.getNext());

                currentNode.setNext(newNode);
            }
        }
    }

    public void deleteNodeAtIndex(int index) {

        if (this.head != null) {

            int nodeIndex = 0;

            Node<T> currentNode = this.head;
            Node<T> previousNode = this.head;

            while (nodeIndex != index) {

                previousNode = currentNode;

                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }

                nodeIndex++;
            }

            previousNode.setNext(currentNode.getNext());
        }
    }

    public void deleteNodeAfterIndex(int index) {

        if (this.head != null) {

            int nodeIndex = 0;

            Node<T> currentNode = this.head;

            while (nodeIndex != index) {

                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }

                nodeIndex++;
            }

            if (currentNode.getNext() != null) {
                currentNode.setNext(currentNode.getNext().getNext());
            } else {
                currentNode.setNext(null);
            }
        }
    }
}
