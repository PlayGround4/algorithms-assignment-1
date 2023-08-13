public class Algo_4 {

  public static void main(String[] args) {
    int[] nums = { 10, 20, 30, 40, 50 };

    for (int i = 0, j = nums.length - 1; i < nums.length / 2; j--, i++) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }

    System.out.print("[");

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + ", ");
    }
    System.out.println("\b\b]");
  }
}
