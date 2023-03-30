public class GCD_LCM {
    public static void main(String[] args) {
//        System.out.println(gcd(4,9));
         lcm(4,10);
    }


    static int gcd(int a , int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    static void lcm(int a , int b){
        int ans =  (a * b)/gcd(a,b);
        System.out.println(ans);
    }
}
