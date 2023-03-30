public class Kth_Positive_Integer {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findKthPositive(arr,2));
    }

    public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if (i <= k){
                k++;
            }else {
                break;
            }
        }
        return k;
    }
}
