public class CountZeros {
    public static void main(String[] args) {
        int ans = Recursiion(34020);
        System.out.println(ans);
    }

    static int Count(int n){
        int count = 0;
        while (n >0) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
            }
            n = n/10;
        }
        return count;
    }

    static int Recursiion(int n){
           return helper(n,0);
    }

    static int helper(int n,int count){
        if (n == 0){
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n/10,count);
    }
}
