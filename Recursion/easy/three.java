package easy;

public class three {
    public static void main(String[] args) {
        int ans = three(12345);
        System.out.println(ans);
    }

    static int three(int n){
        if (n%10 == n){
            return n;
        }
        return three(n%10)+three(n/10);
    }
}
