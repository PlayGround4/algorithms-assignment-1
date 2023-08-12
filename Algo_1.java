import java.util.Scanner;

public class Algo_1 {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int x1 = 0;
    int x2 = 1;

    int num;
    do {
      int[] nums = new int[0];

      System.out.print("Enter a positive number: ");
      num = scanner.nextInt();
      scanner.nextLine();

      int x3 = 0;

      if (num < 0) System.out.println("Invalid number! "); else {
        System.out.print("Fibonnaci sequence upto " + num + " :  ");
        do {
          System.out.print(+x1 + " ");
          x3 = x1 + x2;
          x1 = x2;
          x2 = x3;
        } while (x1 <= num);

        System.out.print('\b');
      }

      System.out.println();
    } while (num < 0);
  }
}
