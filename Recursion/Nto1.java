public class Nto1 {
    public static void main(String[] args) {
       Nto1p(5);
    }


    static void Nto1print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Nto1print(n - 1);
    }

    static void Nto1p(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        Nto1p(--n);
    }

    static void Nto1printRev(int n){
        if(n==0){
            return;
        }
        Nto1printRev(n - 1);
        System.out.println(n);
    }

    static int fact(int n){
        if (n <= 1){
            return 1;
        }
        return n* fact(n-1);
    }

    static int sumOfNo(int n){
        if (n <= 1){
            return 1;
        }
        return n + sumOfNo(n-1);
    }
}
