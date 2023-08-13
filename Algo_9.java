import java.util.Arrays;
import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input = "";
loop:
        do{
            System.out.print("Enter a word: ");
            input = scanner.nextLine();

            char[] strArray = input.toCharArray();
            char[] strRevArray = new char[strArray.length];


            if(!input.trim().isEmpty() || input.isBlank()) {System.out.println("Invalid input!");continue loop;}

            

            for (int i = 0, j = strArray.length - 1;i < strArray.length;i++, j--) {
                strRevArray[i] = strArray[j];
            }

            int count = 0;

            for (int i = 0,j=strRevArray.length-1; i < strRevArray.length/2; i++, j--) {
                if(strRevArray[i]==strRevArray[j]){
                    count++;
                }
            }
           
            if(count==strRevArray.length/2) {System.out.println("It's a Palindrome");break;}
            else {System.out.println("It's not a Palindrome");break;}

        }while(true);
    }
    
}
