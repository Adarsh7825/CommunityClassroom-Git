import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           int max= getMaxIndex(arr,0,arr.length -i -1);
            swap(arr,max, arr.length -i -1);
        }
    }

    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int Max = start;
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }
}
