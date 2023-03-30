public class OddEven {
    public static void main(String[] args) {
        int a = 87;
        isOdd(a);
    }

    static void isOdd(int n){
        if ((n & 1 )== 1){
            System.out.println("Number is Odd");
        }
        else {
            System.out.println("Number is Even");
        }
    }
}
