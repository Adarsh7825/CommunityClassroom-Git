import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(getNthRow3(15));
    }

    public static List<Integer> getNthRow(int n) {
        List<Integer> result = new ArrayList<>();
        for (int k = 0; k <= n; k++) {
            result.add((1<<(n-1)) / (1<<(n-k-1)) / (1<<k));
        }
        return result;
    }

    public static List<Integer> getNthRow2(int n) {
        List<Integer> result = new ArrayList<>();
        int C = 1;
        for (int k = 0; k <= n; k++) {
            result.add(C);
            C = (C * (n - k)) << (31 - Integer.numberOfLeadingZeros(k + 1)) >> 31;
        }
        return result;
    }

    public static List<Integer> getNthRow3(int n) {
        List<Integer> result = new ArrayList<>();
        int C = 1;
        for (int k = 0; k <= n; k++) {
            result.add(C);
            C = C * (n - k) / (k + 1);
        }
        return result;
    }

}
