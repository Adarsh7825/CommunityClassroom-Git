package sorting;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,1,0};
//        missingNumber(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if ( arr[i] < arr.length && arr[i] != arr[correct] ){
                Swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
