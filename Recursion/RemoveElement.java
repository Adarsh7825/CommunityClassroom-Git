import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {

    }

        public int removeElement ( int[] nums, int val){
            int i = 0;
            for (int n : nums)
                if (n != val)
                    nums[i++] = n;
            return i;
        }
    }

