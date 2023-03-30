public class Unique_No_In_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        int[] arr2 = {2,3,3,3,4,2,6,4,4,2};
        System.out.println(singleNumber2(arr2));
    }

    static int ans(int[] arr){
        int unique = 0;

        for(int i : arr){
            unique ^= i;
            unique %= i;
        }
        return unique;
    }

    public static int singleNumber(int[] nums) {
        int ones = 0, twos = 0, threes = 0;
        for (int num : nums) {
            twos |= ones & num;
            ones ^= num;
            threes = ~(ones & twos);
            ones &= threes;
            twos &= threes;
        }
        return ones;
    }


    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num >> i) & 1;
            }
            if (sum % 3 != 0) {
                result |= 1 << i;
            }
        }
        return result;
    }

}
