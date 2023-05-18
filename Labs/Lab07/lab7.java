package Labs.Lab07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        list = newList();
        System.out.println("Random list: "+list);
        menu();
        int choice = scanner.nextInt();

        while(choice != 0) {

            if (choice == 1) {

                list = newList();
                System.out.println("Random list: "+list);
                menu();
                choice = scanner.nextInt();
            }
            else if (choice == 2) {

                Collections.sort(list);
                System.out.println("Sorted list: "+list);
                menu();
                choice = scanner.nextInt();
            }
            else if (choice == 3) {
                Collections.reverse(list);
                System.out.println("Reversed list: "+list);
                menu();
                choice = scanner.nextInt();

            }
            else if (choice == 4) {
                Collections.shuffle(list);
                System.out.println("Shuffled list: "+list);
                menu();
                choice = scanner.nextInt();
            }
            else if (choice == 0) {
                break;
            }
        }
        scanner.close();
    }

    static ArrayList<Integer> newList () {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomNum = random.nextInt(99);
            list.add(randomNum);
        }
        return list;
    }

    static void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1: New random list");
        System.out.println("2: Sort list");
        System.out.println("3: Reverse list");
        System.out.println("4: Shuffle list");
        System.out.println("0: Quit");
        System.out.print(">");
    }
}
