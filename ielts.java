import java.util.*;

public class ielts {
    private Map<String, String> wordMap;
    private List<String> words;

    public ielts() {
        wordMap = new HashMap<>();
        words = new ArrayList<>();
        initializeWords();
    }

    private void initializeWords() {
        // Add advanced words and their definitions to the word map
        wordMap.put("meticulous", "showing great attention to detail; very careful and precise");
        wordMap.put("eloquent", "fluent or persuasive in speaking or writing");
        wordMap.put("indigenous", "originating or occurring naturally in a particular place; native");
        wordMap.put("resilient", "able to withstand or recover quickly from difficult conditions");
        wordMap.put("sophisticated", "complex or intricate; advanced and refined");
        // Add more words and definitions here...

        words.addAll(wordMap.keySet());
    }

    public void startPractice() {
        Scanner scanner = new Scanner(System.in);
        int totalQuestions = 10;

        System.out.println("IELTS Word Practice");
        System.out.println("-------------------");

        boolean repeat = true;
        while (repeat) {
            // Shuffle the word list to randomize the questions
            Collections.shuffle(words);

            int score = 0;
            for (int i = 0; i < totalQuestions; i++) {
                String word = words.get(i);
                String definition = wordMap.get(word);

                System.out.println();
                System.out.println("Question " + (i + 1) + ":");
                System.out.println("Definition: " + definition);
                System.out.println("Options:");
                displayWordOptions(i);

                System.out.print("Enter your answer (A, B, C, D, E): ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase(getCorrectAnswer(i))) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                    System.out.println("The correct answer is: " + getCorrectAnswer(i));
                }
            }

            System.out.println();
            System.out.println("Practice complete!");
            System.out.println("Score: " + score + " out of " + totalQuestions);

            System.out.print("Do you want to repeat the practice? (yes/no): ");
            String repeatAnswer = scanner.nextLine();
            repeat = repeatAnswer.equalsIgnoreCase("yes");
        }
    }

    private void displayWordOptions(int currentIndex) {
        List<String> options = new ArrayList<>(words);
        options.remove(words.get(currentIndex));
        Collections.shuffle(options);

        char choice = 'A';
        for (String option : options) {
            System.out.println(choice + ") " + option);
            choice++;
        }
        System.out.println(choice + ") " + words.get(currentIndex));
    }

    private String getCorrectAnswer(int currentIndex) {
        char choice = 'A';
        for (int i = 0; i < currentIndex; i++) {
            choice++;
        }
        return String.valueOf(choice);
    }

    public static void main(String[] args) {
        ielts practice = new ielts();
        practice.startPractice();
    }
}
