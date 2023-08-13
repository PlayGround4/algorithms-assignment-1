import java.util.Scanner;

public class Algo_10 {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String input = "";
    loop:do {
      System.out.print("Enter the phone number: ");
      input = scanner.nextLine();
      char[] charArray = input.toCharArray();

      for (int i = 0; i < charArray.length; i++) {
        if (
          !Character.isDigit(charArray[i]) &&
          charArray[i] != '+' &&
          charArray[i] != ' ' &&
          charArray[i] != '-'
        ) {
          System.out.println("Telephone number should be digits.");
          continue loop;
        }
      }
      if (input.isBlank()) {
        System.out.println("Telephone number can't be empty!");
        continue loop;
      }
      String[] numArray = new String[14];

      if (input.startsWith("+94")) {
        numArray = input.split(" ");
        if (
          numArray[1].length() == 2 && !numArray[1].contains("-") && !numArray[1].contains("+") &&
          numArray[2].length() == 3 && !numArray[2].contains("-") && !numArray[2].contains("+") &&
          numArray[3].length() == 4 && !numArray[3].contains("-") && !numArray[3].contains("+")
        ) System.out.println("Number is validated"); else System.out.println(
          "Invalid phone number."
        );
      }
      numArray = new String[10];

      if (input.startsWith("0")) {
        numArray = input.split("-");
        if (
          numArray[0].length() == 3 && numArray[1].length() == 7
        ) System.out.println("Number is validated"); else System.out.println(
          "Invalid phone number."
        );
      }
    } while (true);
  }
}
