package Exercise;

import java.util.Scanner;

public class Sg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShiritoriGame game = new ShiritoriGame();

        System.out.println("Welcome to Shiritori!");
        System.out.println("Rules: each new word must start with the last letter of the previous word.");
        System.out.println("Words cannot be repeated.\n");

        while (true) {
            if (game.isGameOver()) {
                System.out.println("Game over! Words so far: " + game.getWords());
                System.out.print("Do you want to restart? (yes/no): ");
                String answer = scanner.nextLine();
                if (answer.equals("yes")) {
                    game.restart();
                    System.out.println("Game restarted! Start with a new word.");
                } else {
                    System.out.println("Thanks for playing!");
                    break;
                }
            }

            System.out.print("Enter a word: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.isEmpty()) {
                System.out.println("Please enter a valid word.");
                continue;
            }

            boolean valid = game.play(input);
            if (valid) {
                System.out.println("Words so far: " + game.getWords());
            } else {
                System.out.println("Invalid word!");
            }
        }

        scanner.close();
    }
}


