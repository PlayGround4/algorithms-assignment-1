import java.util.Scanner;

public class Algo_5 {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String text = "";
loop:
    do {
      System.out.print("Enter a text: ");
      text = scanner.nextLine();

      char[] strArray = text.toCharArray();
      for (int i = 0; i < strArray.length; i++) {
          if (strArray[i] >=128 || strArray[i]<0) {
            System.out.println("Invalid input!");
            continue loop;
        }
        }

      if (text.isBlank()) System.out.println("Invalid Input!"); 
      

      else {
        for (int i = 0, j = strArray.length - 1;i < strArray.length / 2;i++, j--) {
          char temp = strArray[i];
          strArray[i] = strArray[j];
          strArray[j] = temp;
        }
        System.out.print("Reversed text: ");
    
        for (int i = 0; i < strArray.length; i++) {
          if (strArray[i] <128 && strArray[i]>0) System.out.print(strArray[i]);
        }
       
      }

      System.out.println();

    } while (true);
  }
}
