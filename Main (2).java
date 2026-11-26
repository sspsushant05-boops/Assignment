// Some Challenging Questions


//Q1. Reverse a String Using Stack
//Logic: Insert each character into the stack and then remove characters one by one.
//The resulting string will be reversed.

 // Solution


 
import java.util.Scanner;

class CharStack {
    char arr[] = new char[100];
    int top = -1;

    void push(char ch) {
        arr[++top] = ch;
    }

    char pop() {
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CharStack s = new CharStack();

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        System.out.print("Reversed String: ");

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }

        sc.close();
    }
}






//Q2. Check Whether a String Is Palindrome Using Stack
//Logic: Push all characters into the stack and compare the original string with the reversed string.



// solution






import java.util.Scanner;

class CharStack {
    char arr[] = new char[100];
    int top = -1;

    void push(char ch) {
        arr[++top] = ch;
    }

    char pop() {
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CharStack s = new CharStack();

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        String reverse = "";

        while (!s.isEmpty()) {
            reverse = reverse + s.pop();
        }

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}





//Q3. Reverse Elements of a Stack Using Another Stack
//Logic: Pop all elements from the first stack and push them into the second stack.
//This reverses their order.



// solution






class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s1 = new Stack();
        Stack s2 = new Stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        System.out.print("Original Stack: ");
        s1.display();

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        System.out.print("Reversed Stack: ");
        s2.display();
    }
}






//Q4. Find Middle Element of a Stack Using Linked List
//Logic: First calculate the size of the stack.
//Then move to the middle position using a temporary pointer.





// solution 






class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node top;
    int count = 0;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
    }

    int findMiddle() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        Node temp = top;

        int middle = count / 2;

        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
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
        s.push(40);
        s.push(50);

        System.out.print("Stack: ");
        s.display();

        System.out.println("Middle Element: " + s.findMiddle());
    }
}
