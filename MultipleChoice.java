import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] answers = {"C ", "C", "B"};
        String[] responses = {"", "", "", ""};

        System.out.println("What is the capital of France?");
        System.out.println("A) Berlin");
        System.out.println("B) Madrid");
        System.out.println("C) Paris");
        System.out.println("D) Rome");
        System.out.print("Enter your answer (A, B, C, or D): ");

        System.out.println("What is 2 + 2?");
        System.out.println("A) 2");
        System.out.println("B) 3");
        System.out.println("C) 4");
        System.out.println("D) 5");
        System.out.print("Enter your answer (A, B, C, or D): ");

        System.out.println("What is the largest planet in our solar system?");
        System.out.println("A) Earth");
        System.out.println("B) Jupiter");
        System.out.println("C) Saturn");
        System.out.println("D) Mars");
        System.out.print("Enter your answer (A, B, C, or D): ");

        responses[0] = scan.next();
        responses[1] = scan.next();
        responses[2] = scan.next();


        /* System.out.println("Your answers are:");
        System.out.println("1. " + responses[0]);
        System.out.println("2. " + responses[1]);
        System.out.println("3. " + responses[2]);
         */
        int score = 0;

        for (int i = 0; i < 3; i++) {
           if(responses[i].equalsIgnoreCase(answers[i])) {
            score++;
           }
        }

        System.out.println("Score: " + score + " out of 3");
        System.out.println("Your total score is: " + score);
        scan.close();
    } 
}


/* for (int i = 0; i < responses.length; i++) {
            if (responses[i].equalsIgnoreCase("C")) {
                System.out.println("Question " + (i + 1) + " is correct.");
            } else {
                System.out.println("Question " + (i + 1) + " is incorrect.");
            } */