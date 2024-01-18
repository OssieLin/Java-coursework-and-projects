import java.util.Scanner;
import java.util.Random;

public class phrase_2{
    private static final String[] phrases = {
        "hit the sack",
        "better late than never",
        "call it a day",
        "under the weather",
        "break a leg"
    };

    private static final String[] definitions = {
        "To go to bed or go to sleep. Hint: Starts with 'h' and ends with 'k'",
        "It's better to do something late than not at all. Hint: Starts with 'b' and ends with 'r'",
        "To decide to stop working for the day. Hint: Starts with 'c' and ends with 'y'",
        "Feeling unwell or sick. Hint: Starts with 'u' and ends with 'r'",
        "Good luck. Hint: Starts with 'b' and ends with 'g'"
    };

    public static void main(String[] args) {
        
//the random number generator with no duplicated 

Random random=new Random();
int[]a=new int[5];
int number;

	for (int i=0; i<a.length; i++){

	a[i]=random.nextInt(5);

 for(int j=0; j<i;j++){
 if(a[i]==a[j]){

i--;
break;

}//if
}//for2
}//for1

Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("This is a game where you can learn some English phrases.");
        System.out.println("You will get 10 points for each correct answer.");

        while (playAgain) {
            int score = 0;

            for (int i = 0; i < phrases.length; i++) {
                String phrase = phrases[i];
                String definition = definitions[i];
                String hint = definition.substring(definition.indexOf("Hint: ") + 6);
                definition = definition.substring(0, definition.indexOf(". Hint:"));

                System.out.println("Definition: " + definition);
                System.out.println("Hint: " + hint);
                System.out.print("Enter the phrase: ");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase(phrase)) {
                    System.out.println("Correct!");
                    score += 10;
                } else {
                    System.out.println("Incorrect!");
                }

                System.out.println();
            }

            System.out.println("Game over! Your final score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();

            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing the English Phrases Game!");
    }
}
