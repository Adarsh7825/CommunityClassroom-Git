public class PowerOf2 {
    public static void main(String[] args){

    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0){
            return true;
        }
        double ans = Math.pow(2,n);
        if (ans % 2 == 0){
            return true;
        }
        return false;
    }
}
