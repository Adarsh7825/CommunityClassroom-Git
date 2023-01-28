public class SumOfDigits {
    public static void main(String[] args) {
        int ans = SumOfdigitsByRecursion(1342);
        System.out.println(ans);
    }

    static int SumOfdigits(int n){
        int sum = 0;
        while (n > 0){
        int rem = n % 10;
        sum += rem;
        n = n/10;
        }
        return sum;
    }

    static int SumOfdigitsByRecursion(int n){
        if (n == 0) {
            return 0;
        }
        return (n %10) + SumOfdigits(n /10);
    }

    static int SumOfProductByRecursion(int n){
        if (n%10 == n) {
            return n;
        }
        return (n %10) + SumOfdigits(n /10);
    }



}
