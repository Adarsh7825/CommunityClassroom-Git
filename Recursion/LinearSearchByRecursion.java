import java.util.ArrayList;

public class LinearSearchByRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,7,8,9,10};
//        System.out.println(findArrayIsSortedOrNot(arr,0));
//        System.out.println(findIndexLast(arr,10,arr.length -1));

        System.out.println(findAllIndex2(arr,8,0,new ArrayList<>()));
    }


    static boolean findArrayIsSortedOrNot(int[] arr,int Index){
        if (Index == arr.length -1){
            return true;
        }
        return arr[Index] < arr[Index+1] && findArrayIsSortedOrNot(arr,Index+ 1);
    }
    static boolean findIndex(int[] arr,int target,int Index){
        if (Index == arr.length){
            return false;
        }
        return arr[Index] == target || findIndex(arr,target,Index+1);
    }
    static int findIndex2(int[] arr,int target,int Index){
        if (Index == arr.length){
            return -1;
        }
        if (arr[Index] == target){
            return Index;
        }
        return findIndex2(arr,target,Index+1);
    }
    static int findIndexLast(int[] arr,int target,int Index){
        if (Index == -1){
            return -1;
        }
        if (arr[Index] == target){
            return Index;
        }
        return findIndexLast(arr,target,Index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int Index){
        if (Index == arr.length){
            return;
        }
        if (arr[Index] == target){
            list.add(Index);
        }
       findAllIndex(arr,target,Index+1);
    }
    static ArrayList findAllIndex2(int[] arr,int target,int Index,ArrayList<Integer> list){
        if (Index == arr.length){
            return list;
        }
        if (arr[Index] == target){
            list.add(Index);
        }
       return findAllIndex2(arr,target,Index+1,list);
    }
}
