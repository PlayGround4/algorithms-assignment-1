import java.util.Scanner;

public class Algo_6{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String inputStr = "";
       

        do{
            System.out.print("Enter a sentence: ");
            inputStr = scanner.nextLine();

            if(inputStr.isBlank()) System.out.println("Invalid Input!");

            else{
                
                String[] strArray = inputStr.split(" ");
                

                for (int i = 0, j=strArray.length-1; i < strArray.length/2; i++,j--) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }

                System.out.print("Reversed sentence: ");
                for (int i = 0; i < strArray.length; i++) {
                    System.out.print(strArray[i]+" ");
                }
            }

        }while(inputStr.isBlank());
        
    }
}