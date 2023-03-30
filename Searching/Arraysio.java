import java.util.Locale;

class Arraysio {
     public static void main(String[] args) {
        String s = "leetcode";
         System.out.println(firstUniqChar(s));
     }

     public static int firstUniqChar(String s) {
         for(int i = 0; i < s.length(); i++){
             for(int j = i +1; j < s.length(); j++){
                 if(s.charAt(i) == s.charAt(j)){
                     return j;
                 }else{
                     j++;
                 }
             }
         }
         return -1;
     }

    public int firstUniqChar(String s) {
        //  int count = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(s.length()) == s.charAt(j)){
                return s.charAt(j);
            }
        }
        return -1;
    }

 }
