public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        String newInt="";

        System.out.print("numA \u2229 numB : ");
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if(numA[i]==numB[j]) {System.out.print(numB[j]+", ");}
            }
        }
        System.out.println("\b\b  ");

        System.out.print("numA \u222A numB : ");
        
        for (int i = 0,j=0; i < numA.length+numB.length; i++) {
            if(i<numA.length) System.out.print(numA[i]+", ");
            else  {System.out.print(numB[j]+", ");j++;}
        }
        System.out.println("\b\b  ");

        System.out.print("numA / numB : ");

        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if(numA[i]==numB[j]) {numA[i]=0;numB[j]=0;}
            }   
        }
        for (int i = 0; i < numA.length; i++) {
            if(numA[i]!=0) System.out.print(numA[i]+", ");
        }
        System.out.println("\b\b  ");

        System.out.print("numB / numA : ");

        for (int i = 0; i < numB.length; i++) {
            if(numB[i]!=0) System.out.print(numB[i]+", ");
        }
        System.out.println("\b\b  ");

        System.out.print("numA \u25B3 numB : ");
        for (int i = 0; i < numB.length; i++) {
            if(numA[i]!= 0) System.out.print(numA[i]+", ");
            if (numB[i]!= 0) System.out.print(numB[i]+ ", ");
        }
        System.out.println("\b\b  ");
        
    }
}
