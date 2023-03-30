public class fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibo(50));
        for (int i = 0; i < 50  ; i++) {
            System.out.println(fibo(i));
        }
    }

    static long fibo(int n){
        if (n < 2){
            return n;
        }
        return (long)((Math.pow(((1+Math.sqrt(5))/2),n)));
    }
}
