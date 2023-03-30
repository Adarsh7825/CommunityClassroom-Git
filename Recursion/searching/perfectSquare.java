package searching;

public class perfectSquare {
    public static void main(String[] args) {
        isPerfectSquare(16);
    }

    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;

        if (num == 0){
            return false;
        }
        if (num == 1){
            return true;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid*mid == num){
                return true;
            } else if (mid * mid < num) {
                end = mid + 1;
            }else {
                start = mid -1;
            }
        }
        return false;
    }
}
