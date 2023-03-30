import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {5, 4}};
        System.out.println(Arrays.deepToString(matrixReshape2(arr, 3, 2)));
    }

    public static int[][] matrixReshape2(int[][] nums, int r, int c) {
        int[][] arr = new int[r][c];
        int n = nums.length, m = nums[0].length;
        if (r*c != n*m){
            return nums;
        }
        for (int i = 0; i < r*c; i++) {
            arr[i/c][i%c] = nums[i/m][i%m];
        }
        return arr;
    }
}
