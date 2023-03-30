public class TwoDigitSum {
    public static void main(String[] args) {
       int ans = twodigi(54);
        System.out.println(ans);
    }

//     38 =  3   +  8
//     11 =  1   +   1
//    2
    static int twodigi(int num) {
        if (num % 10 == num) {
            return num;
        }
//        if (num %)
        return twodigi(num % 10 + num/10) ;
    }
}
