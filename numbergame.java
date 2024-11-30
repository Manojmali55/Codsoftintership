
import java.util.Random;
import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalRounds = 0;
        int totalAttempts = 0;

        // Loop for multiple rounds
        while (true) { //strt the while loop number1
            totalRounds++;

            //1: Generate a number within the specified range (1 to 100)
            Random rand = new Random();//rand is variable it is hold to Random() 
            int lowerBound = 1;
            int upperBound = 100;
            int generatedNumber = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;

            //2: Prompt the user to guess the number
            int attempts = 0;
            int maxAttempts = 8; //Thise line set to the attempts of play the game.
            boolean guessedCorrectly = false;

            System.out.println("!! Welcome player to the Number Guessing Game  !!");
            System.out.println("Guess the number between " + lowerBound + " to " + upperBound + ".");

            //3: Compare the user's guess with the generated number
            while (attempts < maxAttempts && !guessedCorrectly) {//Start the while loope number2
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + " :-\n Enter your guess number: ");
                int userGuess = scan.nextInt();
                attempts++;
                          
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + generatedNumber + " in " + attempts + " attempts.");
                    guessedCorrectly = true;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Your guess number is too low.");
                } else {
                    System.out.println("Your guess number is too high.");
                }
            }//end the while loop number2.

            // If the player runs out of attempts
            if (!guessedCorrectly) {
                System.out.println("Sorry, you have complete the  " + maxAttempts + " attempts. The correct number was " + generatedNumber + ".");
            }

            // 4: Score and feedback
            totalAttempts += attempts;

            // Display the user's score (average attempts per round)
            double avgAttempts = (double) totalAttempts / totalRounds;
            System.out.println("Your average attempts per round: " + String.format("%.2f", avgAttempts));

            // Step 5: Option to play another round
            System.out.print("Do you want to play another round? (yes/no): ");//if you enter yes then execute the if case.
            String playAgain = scan.next();
            if (playAgain.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing! Your final score is: ");
                System.out.println("Rounds played: " + totalRounds);
                System.out.println("Total attempts made: " + totalAttempts);
                System.out.println("Thanks for playing game !!");
                break;
            
            }
        }//end the while loop number1.

        scan.close();
    }
}
