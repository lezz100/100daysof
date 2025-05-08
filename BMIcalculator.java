import java.util.Scanner;

public class BMIcalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: height and weight
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);
        System.out.printf("\nYour BMI is: %.2f\n", bmi);

        // Determine BMI category
        if (bmi < 20) {
            System.out.println("Category: Lower than normal");
        } else if (bmi <= 40) {
            System.out.println("Category: Normal");
        } else if (bmi <= 50) {
            System.out.println("Category: Overweight");
        } else if (bmi <= 60) {
            System.out.println("Category: Obese");
        } else {
            System.out.println("Category: Extremely obese");
        }

        // Calculate normal weight range (BMI between 20 and 40)
        double minNormalWeight = 20 * height * height;
        double maxNormalWeight = 40 * height * height;

        System.out.printf("\nThe normal weight range for your height (%.2f m) is:\n", height);
        System.out.printf("Minimum normal weight: %.2f kg\n", minNormalWeight);
        System.out.printf("Maximum normal weight: %.2f kg\n", maxNormalWeight);

        scanner.close();
    }
}