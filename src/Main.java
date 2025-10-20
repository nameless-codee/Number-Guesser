import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chances = 0;
        int attempts;

        main:
        while (true) {
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

            while (true) {
                System.out.print("Enter your choice: ");
                int choice = scan.nextInt();

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
                    System.out.println("Enter the specified numbers only (1, 2, 3)\n");
                }
            }

            int randomNum = (int) (Math.random() * 101);

            for (attempts = 0; attempts < chances; attempts++) {
                System.out.println();
                System.out.print("Enter your guess: ");
                int guess = scan.nextInt();

                if (guess < randomNum) {
                    System.out.printf("Incorrect! The number is greater than %d%n", guess);
                } else if (guess > randomNum) {
                    System.out.printf("Incorrect! The number is less than %d%n", guess);
                } else {
                    System.out.printf("Congratulations! You guessed the correct number in %d attempts.%n%n", attempts + 1);
                    break;
                }
            }

            if (attempts == chances) {
                System.out.println();
                System.out.printf("The number was %d%n", randomNum);
                System.out.println("You've run out of chances! Try again.\n");
            }

            while (true) {
                System.out.println("Press 'Q' to quit or 'R' to restart");

                char quit = scan.next().charAt(0);
                System.out.println();

                if (quit == 'Q' || quit == 'q') {
                    break main;
                } else if (quit == 'R' || quit == 'r') {
                    continue main;
                } else {
                    System.out.println("Invalid input! Please try again.");
                }
            }
        }

        scan.close();
    }
}
