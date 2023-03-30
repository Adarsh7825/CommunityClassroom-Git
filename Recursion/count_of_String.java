public class count_of_String {
    public static void main(String[] args) {

        String str ="GeeksforGeeks";
        System.out.println(str(str));
    }

    public static int str(String strs){
        if (strs.equals("")){
            return 0;
        }

            return str(strs.substring(1)) + 1;
    }
}
