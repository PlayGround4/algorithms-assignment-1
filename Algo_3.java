public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int[] numsrev = new int[5];

        for (int i = 0,j=nums.length-1; i < numsrev.length; j--,i++) {
            numsrev[j]=nums[i];
        }

        nums = numsrev;

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\b\b]");

    }
    
}
