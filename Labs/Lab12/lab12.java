package Labs.Lab12;

import java.util.LinkedList;
import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        
        MyLinkedList list = new MyLinkedList();

        list.start();
    }
}

class MyLinkedList {

    LinkedList<Integer> myLinkedList = new LinkedList<>();

    void start() {


        while (true) {

            System.out.println("MyLinkedList: " + myLinkedList);
            System.out.println("Size: " + myLinkedList.size());

            print();
            int userInput = input();
            operation(userInput);
            
           

        }
    }

    void print() {
        System.out.println("1 - Add random integer as first");
        System.out.println("2 - Add random integer as last");
        System.out.println("3 - Add random integer at specified index");
        System.out.println("4 - Get first integer");
        System.out.println("5 - Get last integer");
        System.out.println("6 - Get integer at specified index");
        System.out.println("7 - Remove first integer");
        System.out.println("8 - Remove last integer");
        System.out.println("9 - Remove integer at specified index");
        System.out.println("10 - Clear list");
        System.out.println("0 - Exit");
        System.out.print("Command > ");
    }

    int input() {
        
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        // scanner.close();

        return input;
    }

    void operation(int userInput) {

        switch (userInput) {
            case 1:
                myLinkedList.addFirst(5);
                break;
            case 2:
                myLinkedList.addLast(5);
                break;
            case 3:
                myLinkedList.add(5, 5);
            default:
                break;
        }

    }
}
