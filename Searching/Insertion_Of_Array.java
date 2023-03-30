import java.util.HashSet;

public class Insertion_Of_Array {
    public static void main(String[] args) {
        int[] ans = intersect(new int[]{1,2,2,1},new int[]{2,2});
        System.out.println(ans);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums1){
            set.add(i);
        }

        HashSet<Integer> intersection = new HashSet<Integer>();
        for(int i: nums2){
            if(set.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer num : intersection) {
            result[i++] = num;
        }
        return result;
    }
}
