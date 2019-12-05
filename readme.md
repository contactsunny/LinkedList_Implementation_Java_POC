# Singly Linked List Implementation POC in Java

This is a simple example of a singly linked list implementation in Java. We create a custom ```Node``` class which can take values of
generic type ```T```, so that we can create linked lists of different types using the same implementation class. We also create a 
```LinkedList``` class which will hold the actual linked list of nodes.

We provide various functions for our linked list such as:
- add a node to the head of the linked list
- add a node to the tail of the linked list (append)
- add a node after the given index
- delete a node with a given value (first occurrence of the value)
- delete a node at a given index
- delete a node after a given index
- traverse a linked list (print all values from head to tail)

# Use of the generic class ```T```

If you check the ```Node``` class, I'm taking the generic class ```T``` as the type of the value field. This is so that during
runtime, we can have a string linked list or integer linked list, or a linked list of a custom class as well. ```T``` is a generic class in Java,
the type of which can be decided in runtime.

# Running the project

Once you clone this repo, ```cd``` into the project root directory and run the following command to compile and build this maven project:

```shell script
mvn clean install
```

Once you run this command, Maven will build the project and keep it in the ```/target``` directory in the project root directory.
You can run the program using the command below:

```shell script
java -jar target/LinkedListImplementation-1.0-SNAPSHOT.jar
```