import java.util.Random;
public class RollDice {
  public static void main(String args[]) {
    Random rand = new Random();
    int r = rand.nextInt(6) + 1;

    System.out.println("The random no. is " + r);
  }
}