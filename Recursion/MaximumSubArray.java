import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static ArrayList<Integer> maxSubArray(int[] nums) {
//        int[] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                list.remove(nums[i]);
            }
        }
        return list;
    }

    public static int maxSubArray2(int[] nums) {
        int max_sum = nums[0];
        int current_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }

}
