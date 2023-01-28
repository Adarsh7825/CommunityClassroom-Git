import java.util.Arrays;

public class Palindrone {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = palindroneNo(arr);
        System.out.println(Arrays.toString(ans));

    }

    static boolean palindron(int n){
        if (n == reverse2(n)){
            return true;
        }
        return false;
    }

    static int reverse2(int n){
        int digit = (int) Math.log10(n) + 1;
        return helper(n,digit);
    }

    private static int  helper(int n, int digit) {
        if (n %10 == n){
            return n;
        }
        int rem = n %10;
        return rem * (int)(Math.pow(10,digit -1)) + helper(n/10,digit -1);
    }

//    static int sum = 0;
//    static void palin(int n){
//        if (n == 0){
//            return;
//        }
//            int rem = n % 10;
//            sum = (sum * 10) + rem;
//        palin(n /10);
//    }

    static int[] palindroneNo(int[] arr){
        int start = 0;
        int end = arr.length -1;
                while(start < end){
                    swap(arr,start,end);
                    start++;
                    end--;
                }
        return arr;
    }

    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
