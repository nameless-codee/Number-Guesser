# Number Guesser (Java Console Game)

A simple, fast, and beginner-friendly console number guessing game written in Java. Choose a difficulty, guess the secret number, and see how many attempts and seconds you take to win. Play multiple rounds without restarting the app.

## Features

- **Three difficulties**
  - Easy: 10 chances
  - Medium: 5 chances
  - Hard: 3 chances
- **Helpful hints** after each guess (higher/lower)
- **Timing**: shows how many seconds you took to guess correctly
- **Replayability**: continue or quit after each round

## Requirements

- **Java 15+** (uses multi-line text blocks). Java 17+ recommended.
- No build tool required (plain `javac`/`java` works). You can also run it from any IDE.

## Project structure

```
number_guesser/
├─ src/
│  └─ Main.java
└─ README.md
```

## How to run (command line)

You can compile and run from the project root. The commands below are for Windows PowerShell/CMD but also work similarly on macOS/Linux.

1. Compile to an output folder (e.g., `out`):

```bash
javac -d out src/Main.java
```

2. Run the program:

```bash
java -cp out Main
```

If `javac`/`java` are not found, ensure your JDK bin directory is on your PATH and that your JDK version is 15 or newer.

## How to run (IDE)

- **IntelliJ IDEA**
  - Open the project folder.
  - Mark `src` as a Source Root if needed.
  - Right-click `Main.java` → Run 'Main.main()'.
- **VS Code** (Java Extension Pack)
  - Open the folder.
  - Open `src/Main.java` and click "Run".

## Gameplay

1. On start, you will be asked to choose a difficulty (1, 2, or 3).
2. The game selects a secret number and gives you a fixed number of chances based on your difficulty.
3. After each guess, you'll be told whether the secret number is greater or less than your guess.
4. If you guess correctly within your chances, you win and see your attempt count and total time.
5. After a round, press `C` to continue or `Q` to quit.

## Example session

```
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2
Great! You have selected the Medium difficulty level.
Let's start the game!

Enter your guess: 50
Incorrect! The number is greater than 50

Enter your guess: 75
Incorrect! The number is less than 75

Enter your guess: 63
Congratulations! You guessed the correct number in 3 attempts within 12 seconds.

Press 'Q' to quit or 'C' to continue
```

## Notes

- The game expects numeric input for choices and guesses, and the letters `Q`/`C` to quit/continue.
- Run time shown is measured in whole seconds.

## Possible improvements

- Input validation for non-numeric entries.
- Configurable number range and chances.
- Track and display best score/time across rounds.
- Add tests and CI workflow.

## License

This project is provided as-is. Choose a license (e.g., MIT) if you plan to distribute or contribute.

Project URL: https://roadmap.sh/projects/number-guessing-game
