package easy;

public class one {
    public static void main(String[] args) {
    reverse(5);
    }

    static int reverse(int n){
        if (n == 0){
            return 0;
        }
        System.out.println(n);
        return reverse(n -1);
    }
}
