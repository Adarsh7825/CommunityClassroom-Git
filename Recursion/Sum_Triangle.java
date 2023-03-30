//Input : A = {1, 2, 3, 4, 5}
//        Output : [48]
//        [20, 28]
//        [8, 12, 16]
//        [3, 5, 7, 9]
//        [1, 2, 3, 4, 5]
//
//        Explanation :
//        Here,   [48]
//        [20, 28] -->(20 + 28 = 48)
//        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
//        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
//        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)


import java.util.Arrays;

public class Sum_Triangle {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        //Recursive function that will print answer
        sum(x);
        System.out.println(Arrays.toString(x));
    }

    public static void sum(int[] nums){
        int[] temp = new int[nums.length - 1];

        if(nums.length == 1){
            return;
        }

        helper(temp,nums,0);
        sum(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static int[] helper(int[] temp , int[] nums, int index ){
        if (index == nums.length -1){
            return temp;
        }
        temp[index] = nums[index] + nums[index +1];
        return helper(temp,nums,index +1);
    }
}
