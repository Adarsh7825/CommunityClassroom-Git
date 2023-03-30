import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

//    public static int[][] generatrMatrix(int n) {
//                int counter = 0;
//                int left = 0;
//                int right = n-1;
//                int top = 0;
//                int bottom = n -1;
//
//
//            }


    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int counter = 0;
        int left = 0;
        int right = arr.length;
        int top = 0;
        int bottom = arr[0].length;

        while(true){
            for(int i = left; i <= right; i++) arr[i][bottom] = counter++;
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++) arr[left][i] = counter++;
            top++;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) arr[i][top] = counter++;
            top++;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--)  arr[right][i] = counter++;
            right--;
            if(left > right || top > bottom) break;
        }
        return arr;
    }
        }

