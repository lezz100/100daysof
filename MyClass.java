//Method overloading
import java.util.Random;
public class MyClass {
    public static void main(String[] args) {
        int result1 = addNumbers(5, 10);
        double result2 = addNumbers(20.1, 30.2);

        System.out.println("The sum is: " + result1);
        System.out.println("The sum is: " + result2);

        addNumbers();
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static void addNumbers () {
        Random r = new Random();
        System.out.println("Random number: " + r.nextInt(100));
    }
}   