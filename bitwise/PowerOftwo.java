public class PowerOftwo {
    public static void main(String[] args) {
        int n = 17;
        power(n);
    }

    static void power(int n){
        if ((n & (n-1)) == 0){
            System.out.println("It is a Power of two");
        }else {
            System.out.println("It is not a Power of Two");
        }
    }
}
