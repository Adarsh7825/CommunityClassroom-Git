import java.util.ArrayList;
import java.util.Arrays;

public class factorOfAnNumber {
    public static void main(String[] args) {
        isfactorInSortedOrder(20);
    }

//    O(n)
    static void isfactor(int n){
        for (int i = 1; i <=n; i++) {
            if (n%i == 0){
                System.out.println(i + " ");
            }
        }
    }

//  O(Sqrt(n))
    static void isfactor2(int n){
        for (int i = 1; i <=n; i++) {
            if (n%i == 0){
                System.out.println(i + " " + n/i);
            }
        }
    }

        static void isfactor3(int n){
            for (int i = 1; i <=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        System.out.println(i);
                    } else {
                        System.out.print(i + " " + n / i + " ");
                    }
                }
            }
        }

        static void isfactorInSortedOrder(int n){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        System.out.println(i);
                    } else {
                        System.out.println(i + " ");
                        list.add(n/i);
                    }
                }
            }

            for (int i = list.size() -1; i>= 0; i--) {
                System.out.println(list.get(i) + " ");
            }
        }
    }
