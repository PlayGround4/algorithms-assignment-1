import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String inputStr = "";
        
        do{
            System.out.print("Enter a sentence: ");
            inputStr = scanner.nextLine();

            String[] strArray = inputStr.split(" ");

            int max = 0;
            int min = 100;

            for (int i = 0; i < strArray.length; i++) {
                if(strArray[i].length()>max) {
                    max = strArray[i].length();
                }
                if(strArray[i].length()<min){
                    min = strArray[i].length();
                }

            }

            System.out.print("\nLongest words: ");
            for (int i = 0; i < strArray.length; i++) {
                if(strArray[i].length()==max) System.out.print(strArray[i]+", ");
                
            }

            System.out.println("\b\b  ");
            System.out.println("Length of the longest word: "+max);

            System.out.print("\nShortest words: ");

            for (int i = 0; i < strArray.length; i++) {
                 if (strArray[i].length()==min) System.out.print(strArray[i]+", ");
            }
           
            System.out.println("\b\b  ");
           
            System.out.println("Length of the shortest word: "+min);


        }while(inputStr.isBlank());
    }
    
}
