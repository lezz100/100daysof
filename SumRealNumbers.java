import java.util.ArrayList;
import java.util.Scanner;

public class SumRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        double total = 0;
        double input;

        System.out.println("Enter real numbers (enter -1 to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            input = scanner.nextDouble();

            if (input == -1) {
                break;
            }

            numbers.add(input);
            total += input;
        }

        // Display entered numbers
        System.out.println("\nYou entered the following numbers:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }

        // Display the total sum
        System.out.println("\n\nSum of the numbers: " + total);

        scanner.close();
    }
}