public class SumandDigitSumofanArray {
    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{1,15,6,3}));
    }

    public static int differenceOfSum(int[] nums) {
            int a = 0;
            int b = 0;
        for(int i=0; i<nums.length; i++){
            a += nums[i];
            while(nums[i] != 0){
                b += nums[i]%10;
                nums[i] /= 10;
            }
        }

        return a -b;
    }
}
