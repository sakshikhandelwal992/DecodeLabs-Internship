import java.util.Random;     // it is used for creating random number by computer own
import java.util.Scanner;    // for taking input
import java.util.InputMismatchException;  // used to handle wrong input safely like "yhs"

public class RandomNumGuees_project1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();        // generate a random number internally

        int roundsPlayed = 0; // count how much round we played 
        int roundsWon = 0;  //count the rounds won
        int totalScore = 0;    //count our score
     
        String playAgain;  // variable which store yes or no that we want play again or not                       

        System.out.println("* * * * * * * * * * * * * * * * * * ");
        System.out.println("EXCITED TO NUMBER GUESS GAME");
        System.out.println("* * * * * * * * * * * * * * * * * * ");

        do {             //use do while loop because it happens compulsory atleast on time

            // Generate random number between 1 and 100
            int randomNumber = random.nextInt(100) + 1;  // +1 because bounds : 100 menas 0 to 99 so for 1 to 100 use +1

            int maxAttempts = 5;   // we have maximum attempt 5
            int attempt = 0;
            boolean guessedCorrectly = false;    // by default take we will take it false then if guessed then update it 

            roundsPlayed++;

            System.out.println("\nRound =  " + roundsPlayed);
            System.out.println("------------------------------------");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have only " + maxAttempts + " attempts.");

            // Live loop until logical condition is satisfied
            while (attempt < maxAttempts && !guessedCorrectly) {

                int userGuess = 0;        // user guessn number variable
                boolean validInput = false;

                // Input Validation
                while (!validInput) {

                    try {
                        System.out.print("Enter your guess: ");
                        userGuess = sc.nextInt();
                        validInput = true;       // means we put number value 

                    } catch (InputMismatchException e) {
                        System.out.println(" Invalid input! Enter numbers only.");
                        sc.next(); // Clear wrong input
                    }
                }

                attempt++;    // after any attemp completion 

                // Feedback Logic to the direction of right number guess 
                if (userGuess > randomNumber) {
                    System.out.println(" Too High! Try again.");
                }

                else if (userGuess < randomNumber) {
                    System.out.println(" Too Low! Try again.");
                }

                else {
                    System.out.println(" Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    roundsWon++;  
                    totalScore += 10;   // after won +10 we scored 
    
                }

                // Remaining attempts
                if (!guessedCorrectly && attempt < maxAttempts) {
                    System.out.println("Attempts Left:==> " + (maxAttempts - attempt));
                    
                }
            }

            // If user loses
            if (!guessedCorrectly) {
                System.out.println("\n Game Over!");
                System.out.println("The correct number was: " + randomNumber);
            }

            // Score display after round
            System.out.println("\nCurrent Score: " + totalScore);

            // Play Again
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("Y"));  // runni g the game untill user say yes
            //equalsIgnoreCase()-->used to compare text without checking uppercase/lowercase.



        // Final Score Board
        System.out.println("\n====================================");
        System.out.println("          FINAL SCOREBOARD  OF SAKSHI");
        System.out.println("====================================");
        System.out.println("Rounds Played by sakshi: " + roundsPlayed);
        System.out.println("Rounds Won  by sakshi    : " + roundsWon);
        System.out.println("Rounds Lost by sakshi   : " + (roundsPlayed - roundsWon));
        System.out.println("Final Score of sakshi   : " + totalScore);
        System.out.println("====================================");
        System.out.println("Thank You for Playing SAKSHI JIS!");

        sc.close(); // close the work of sacnner to take input means scanner object closing
    }
}