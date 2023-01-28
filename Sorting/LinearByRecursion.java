import java.util.ArrayList;

public class LinearByRecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
//       boolean ans = findANumber(arr, 0,9);
//       int ans2 = findfromLast(arr, arr.length -1,4);
//       findAllIndex(arr, 0,5);
//       ArrayList<Integer> ans3 = findAllIndex2(arr,0,4,new ArrayList<>());
//        System.out.println(ans3);

        System.out.println(findAllIndex3(arr,0,4));
    }

    static int findfromFirst(int[] arr, int index, int target){
        if(arr[index] == target){
            return index;
        }
        if (arr[index] == arr.length -1){
            return -1;
        }
        return findfromFirst(arr,index +1,target);
    }

    static int findfromLast(int[] arr, int index, int target){
        if(index == target){
            return index;
        }
        if (index == -1){
            return -1;
        }
        return findfromLast(arr,index  -1 ,target);
    }

    static boolean findANumber(int[] arr, int index, int target){
        if(index == target){
            return true;
        }
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || findANumber(arr,index +1,target);
    }


    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int index,int target){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,index + 1,target);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int index,int target,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr,index + 1,target,list);
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int index,int target){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr,index + 1,target);
         list.addAll(ansFromBelowCalls);
        return list;
    }

}
