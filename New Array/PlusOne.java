import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1 ,2, 3, 6, 9};
        int[] arr2 = {9};
        System.out.println(Arrays.toString(plusOne(arr2)));
    }

    public static int[] plusOne3(int[] digits) {
        int start = 0;
        int end = digits.length -1;
        int end2 = digits.length -2;

        if(start == 0 && end == 0 ){
            digits[end] += 1;
        }
        else if (start == end ) {
            return new int[]{1,0};
        }else if (digits[end] == 9){
            digits[end]= 0;
            digits[end2] += 1;
        }else {
            digits[end] += 1;
        }
        return digits;
    }

    public static int[] plusOne(int[] digits) {
            int end = digits.length;
            for(int i=end-1; i>=0; i--) {
                if(digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                digits[i] = 0;
            }

            int[] arr = new int [end+1];
            arr[0] = 1;

            return arr;
    }

    public static void plusOne2(int[] digits) {
        int end = digits.length + 1;
        int end2 = digits.length -2;
        digits[end2] += 1;
        System.out.println(digits[end2]);
    }

}
