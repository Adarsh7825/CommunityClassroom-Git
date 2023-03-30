class ShuffleString {

    public static void main(String[] args) {
        String a = restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3});
        System.out.println(a);
    }
    public static String restoreString(String s, int[] indices) {
        char t[] = new char[indices.length];
        for(int i =0;i< indices.length;i++){
            t[indices[i]] = s.charAt(i);
        }
        return new String(t);
    }


    public String interpret(String command) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                str.append('G');
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    str.append('o');
                    i++;
                } else {
                    str.append("al");
                    i = i + 3;
                }
            }
        }
        return str.toString();
    }


    public int[] intersection(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];

        for(int i = 0; i< nums1.length;i++){
            for(int j = 0;j< nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    arr[i] = nums1[i];
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0){

            }
        }
        return arr;
    }
}