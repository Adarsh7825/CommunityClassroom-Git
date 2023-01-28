import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNo {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},
                         {9,11,13},
                         {15,16,17}};

//        matrix = [[1,10,  4, 2]
            //     ,[9, 3  ,8, 7],
            //      [15,16, 17,12]]
//                    luckyNumbers(matrix);

        int ans = max(matrix);
        System.out.println(ans);
    }
//
//    public static List<Integer> luckyNumbers (int[][] matrix) {
//        //row ---> Minimum
//        // col ----> Maximum
//
////        1st ----> find Maximum No
////        2nd ----> check is it Minimum in its row
////        if yes ---> ans
////        if No ----> -1
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                int ans = max(matrix);
//                list.add(ans);
//            }
//        }
//    }

    static int max(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                    if (arr[i][j] < maxVal){
                        return arr[i][j];
                    }
                }
            }
        }
        return maxVal;
    }
}
