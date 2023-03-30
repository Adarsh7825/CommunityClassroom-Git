import java.util.ArrayList;

public class ArraylistRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,7,8,9,10};
        System.out.println(findAllIndex3(arr,8,0));
    }

    static ArrayList findAllIndex3(int[] arr, int target,int Index){
        ArrayList<Integer> list = new ArrayList<>();
        if (Index == arr.length){
            return list;
        }
        if (arr[Index] == target){
            list.add(Index);
        }
        ArrayList<Integer> ansFromBelowCall = findAllIndex3(arr,target,Index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }
}
