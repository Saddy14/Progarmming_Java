package Labs.Lab12;

import java.util.LinkedList;
import java.util.Random;
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

            System.out.println("\nMyLinkedList: " + myLinkedList);
            System.out.println("Size: " + myLinkedList.size());

            printCommands();
            int userInput = input();

            if( userInput == 0) {
                break;
            }
            operation(userInput);
        }
    }

    void printCommands() {
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
            return input;
    }

    void operation(int userInput) {

        Random random = new Random();
        int x = random.nextInt(99);
        Scanner scanner = new Scanner(System.in);
        int specifiedIndex = 0;

        if(userInput == 3 || userInput == 6 || userInput == 9) {

            System.out.print("Enter Index: ");
            specifiedIndex = scanner.nextInt();
        }

        switch (userInput) {
            case 1:
                myLinkedList.addFirst(x);
                break;
            case 2:
                myLinkedList.addLast(x);
                break;
            case 3:
                myLinkedList.add(specifiedIndex, x);
                break;
            case 4:
                System.out.println("First Integer: "+myLinkedList.getFirst() + "\n");
                break;
            case 5:
                System.out.println("Last Integer: "+myLinkedList.getLast() + "\n");
                break;
            case 6:
                System.out.println(myLinkedList.get(specifiedIndex) + "\n");
                break;
            case 7:
                myLinkedList.removeFirst();
                break;
            case 8: 
                myLinkedList.removeLast();
                break;
            case 9:
                myLinkedList.remove(specifiedIndex);
                break;
            case 10:
                myLinkedList.clear();
                break;
            default:
                System.out.println("Invalid Command");
                break;
        }
    }
}
