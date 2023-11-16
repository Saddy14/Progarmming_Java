package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {

        GamerMan gamerMan = new GamerMan();
        gamerMan.gameLogic();
    }
}

class GamerMan {

    //This the actual startGame Class
    void gameLogic() {
        Scanner scanner = new Scanner(System.in);

        menu();
        String userInput = scanner.nextLine();

        if (userInput.equals("S") || userInput.equals("s")) {

            startGame(scanner);
        } 
        else if (userInput.equals("Q") || userInput.equals("q")) {

            System.out.println("Thx for Playing");
            System.exit(0);
        } 
        else
            System.out.println("Meow");

        scanner.close();
    }

    void menu() {

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("-> Guess The Number From 1-100\n" + "-> Number of Tries = 4");
        System.out.println("-> Press S to Start\n" + "-> Press q to Quit");
        System.out.print("Press S or q -> ");

    }

    //This the actual gameLogic Class
    void startGame(Scanner scanner) {

        Random random = new Random();
        int userNum;
        int secretNum = random.nextInt(100) + 1;

        for (int i = 4; i > 0; i--) {
            System.out.println(secretNum + " = snum\n"); //TODO Comment this line to keep the secret number hidden during run-time..
            System.out.print("\nTrials Left #" + i + "\nEnter your Number -> ");
            userNum = scanner.nextInt();

            if (userNum == secretNum) {
                System.out.println("Congrats!!! Correct Guess");
                break;
            } 
            else if (userNum > (secretNum + 20))
                System.out.println("Too High");
            else if (userNum < (secretNum - 20))
                System.out.println("Too Low");
            else
                System.out.println("Meow Wrong Guess");

        }
    }
}
