// Question : Implement Stack Using Linked List

// 1. Problem Statement
// Implement a Stack data structure using a Singly Linked List in Java.
// A Stack follows the LIFO (Last In, First Out) principle, which means the element inserted
// last will be removed first.
// You are required to create a Node class and implement all basic Stack operations without
// using Java&#39;s built-in Stack class or any collection framework.
// 2. Required Operations
// Implement the following methods:
// 1. push(int data): Insert an element at the top of the Stack.
// 2. pop(): Remove and return the top element. If the Stack is empty, display &quot;Stack
// Underflow&quot;.
// 3. peek(): Return the top element without removing it.
// 4. isEmpty(): Check whether the Stack is empty.
// 5. size(): Return the total number of elements in the Stack.
// 6. display(): Display all elements from top to bottom.
// 3. Implementation Requirements
// Create the following classes:
//  Node – Contains data and a reference to the next node.
//  Stack – Contains the top reference and implements all Stack operations.
//  Main – Contains the main method to test the implementation.
// Restrictions:
//  Do not use Java&#39;s built-in Stack class.
//  Do not use ArrayList, LinkedList or any other collection framework.
//  Implement the Stack using a manually created Singly Linked List.
//  All operations should be implemented using appropriate methods.
// 4. Sample Test Case
// Perform the following operations:
// Operation Expected Result
// push(10) 10 inserted

// push(20) 20 inserted
// push(30) 30 inserted
// display() 30 → 20 → 10
// peek() 30
// pop() 30 removed
// display() 20 → 10
// size() 2
// isEmpty() false
// pop() 20 removed
// pop() 10 removed
// isEmpty() true
// pop() Stack Underflow



// Code : Solution



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;
    int count;

    Stack() {
        top = null;
        count = 0;
    }

    
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;

        System.out.println(data + " inserted");
    }

    
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;
        count--;

        System.out.println(value + " removed");
        return value;
    }

    
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

   
    boolean isEmpty() {
        return top == null;
    }

    
    int size() {
        return count;
    }

   
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.print("Stack: ");
        s.display();

        System.out.println("Peek: " + s.peek());

        s.pop();

        System.out.print("Stack: ");
        s.display();

        System.out.println("Size: " + s.size());

        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
        s.pop();

        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
    }
}

