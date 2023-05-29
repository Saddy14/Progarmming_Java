package DataStrut;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        
        // LIFO DataStructure
        Stack<String> stack = new Stack<String>();

        stack.push("Chicken");
        stack.push("Beef");

        stack.pop(); // Remove the top element + Returns the element as well
        System.out.println(stack.peek()); // Look at the Top element
        System.out.println(stack.search("Chicken")); // Search for a element in the stack Index Starts from 1 from Top
    }
}
