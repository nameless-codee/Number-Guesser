import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chances = 0;
        boolean running = true;

        String welcomeText = """
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.
                You have 5 chances to guess the correct number.
                
                Please select the difficulty level:
                1. Easy (10 chances)
                2. Medium (5 chances)
                3. Hard (3 chances)
                """;

        System.out.println(welcomeText);

        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        while (running) {
            if (choice == 1) {
                System.out.println("Great! You have selected the Easy difficulty level.\n" +
                        "Let's start the game!");
                chances += 10;
                break;
            } else if (choice == 2) {
                System.out.println("Great! You have selected the Medium difficulty level.\n" +
                        "Let's start the game!");
                chances += 5;
                break;
            } else if (choice == 3) {
                System.out.println("Great! You have selected the Hard difficulty level.\n" +
                        "Let's start the game!");
                chances += 3;
                break;
            } else {
                System.out.println("Enter the specified numbers only (1, 2, 3)");
                running = false;
                continue;
            }
        }

        int randomNum = (int) (Math.random() * 101);

        for (int attempts = 0; attempts < chances; attempts++) {
            System.out.println();
            System.out.print("Enter your guess: ");
            int guess = scan.nextInt();

            if (guess < randomNum) {
                System.out.printf("Incorrect! The number is greater than %d%n", guess);
            } else if (guess > randomNum) {
                System.out.printf("Incorrect! The number is less than %d%n", guess);
            } else {
                System.out.printf("Congratulations! You guessed the correct number in %d attempts.%n", attempts + 1);
                break;
            }
        }

        System.out.println();
        System.out.printf("The number was %d%n", randomNum);
        System.out.println("You've run out of chances! Try again.");

        scan.close();
    }
}
