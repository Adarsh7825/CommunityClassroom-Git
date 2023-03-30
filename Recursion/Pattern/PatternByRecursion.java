package Pattern;

import java.util.Arrays;

public class PatternByRecursion {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
//        triangle(4,0);
//        Bubble(arr,arr.length -1,0);
//        System.out.println(Arrays.toString(arr));

        Selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void triangle2(int row,int col){
        if (row == 0){
            return;
        }
        if (col < row){
            triangle2(row,col+1);
            System.out.print("*");
        } else {
            triangle2(row -1,0);
            System.out.println();
        }
    }
    static void triangle(int row,int col){
        if (row == 0){
            return;
        }
        if (col < row){
            System.out.print("*");
            triangle(row,col+1);
        } else {
            System.out.println();
            triangle(row -1,0);
        }
    }

    static void Bubble(int[] arr, int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            if (arr[col] > arr[col+ 1] ){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            Bubble(arr,row,col+1);
        } else {
            Bubble(arr,row -1,0);
        }
    }

    static void Selection(int[] arr, int row, int col,int max){
        if (row == 0){
            return;
        }
        if (col < row){
            if (arr[col] > arr[max]) {
                Selection(arr, row, col+1, col);
            } else {
                Selection(arr, row, col+1, max);
            }
        } else {
                int temp = arr[max];
                arr[max] = arr[row -1];
                arr[row -1] = temp;
            Selection(arr,row -1,0,0);
        }
    }
}
