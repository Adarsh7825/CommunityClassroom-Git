import java.util.Arrays;

public class BSin2darray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50}};
        System.out.println(Arrays.toString(find(arr,37)));
    }

    static int[] find(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while( row < arr.length && col >= 0){
            if (target == arr[row][col]){
                return new int[]{row,col};
            }
            if (target < arr[row][col]){
                col--;
            }
            if (target > arr[row][col]){
                row++;
            }
        }
        return new int[]{-1,-1};
    }

    static boolean find2(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while( row < matrix.length && col >= 0){
            if (target == matrix[row][col]){
                return true;
            }
            if (target < matrix[row][col]){
                col--;
            }
            if (target > matrix[row][col]){
                row++;
            }
        }
        return false;
    }
}
