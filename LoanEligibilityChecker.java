import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Age and Bank Balance
        System.out.print("Enter the applicant's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the applicant's bank balance (in KES): ");
        double bankBalance = scanner.nextDouble();

        // Check eligibility
        if (age > 21 || bankBalance >= 90000) {
            double loanAmount = bankBalance / 2;
            System.out.println("\nCongratulations! You are eligible for a loan.");
            System.out.printf("The maximum loan amount available is: KES %.2f\n", loanAmount);
        } else {
            System.out.println("\nSorry, you are not eligible for a loan.");
        }

        scanner.close();
    }
}