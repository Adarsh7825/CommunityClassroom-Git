package sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,0,1,2};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

// if arr start from 0
// correct = arr[i]
//  if arr start from 1
// correct = arr[i] -1
    static void Cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
        int correct = arr[i];
            if (arr[i] != arr[correct]){
                Swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    static void Insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j -1]){
                    Swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void Bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j -1] = temp;
                }
            }
        }
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int max = getMaxIndex(arr,0,last);
            Swap(arr,max,last);
        }
    }

//    static void Selection2(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int first = ;
//            int min = getMinIndex(arr,0, first);
//            Swap(arr,min,first);
//        }
//    }

    static int getMinIndex(int[] arr, int start,int end){
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }

    private static int getMaxIndex(int[] arr,int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
