package Stringss;

public class Up_to_Lo {
//    Input : geeksForgEeks
//    Output : GEEKSfORGeEKS
//
//    Input : hello every one
//    Output : HELLO EVERY ONE
        public static void main(String[] args) {

        }

    public static void find(StringBuffer s){
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(Character.isLowerCase(c)){
                s.replace(i,i+1,Character.toUpperCase(c)+ "");
            }
        }
    }
}
