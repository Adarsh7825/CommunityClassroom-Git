public class SqrtOfNo {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(isSqrtByBinarySearch(n,p));
    }

    static void isSqrt(int n){
        for (int i = 0; i < n - 1; i++) {
            if (i*i == n){
                System.out.println(i);
            }
        }
    }

    static double isSqrtByBinarySearch(int n,int p){
        int start = 0;
        int end = n;
        double root = 0.0;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid*mid == n){
                return mid;
            } else if (mid *mid < n){
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        double incr = 0.1;

        for (int i = 0; i < p ; i++) {
            while (root * root <= incr) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}