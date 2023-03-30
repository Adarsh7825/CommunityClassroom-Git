public class DefanginganIPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }


//    Input: address = "1.1.1.1"
//    Output: "1[.]1[.]1[.]1"


    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
             String a = ".";
             if (address.charAt(i) == '.'){
                 str.append("[.]");
             }else {
                 str.append(address.charAt(i));
             }
        }
        return str.toString();
    }
}
