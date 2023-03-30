public class Roman_Integer {
    public int romanToInt(String s) {
        // char 'I' = 1;
        // char 'V' = 5;
        // char 'X' = 10;
        // char 'L' = 50;
        // char 'C' = 100;
        // char 'D' = 500;
        // char 'M' = 1000;

        int sum = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == 'I'){
                sum += 1;
            }
            if(s.charAt(j) == 'V'){
                sum += 5;
            }if(s.charAt(j) == 'X'){
                sum += 10;
            }if(s.charAt(j) == 'L'){
                sum += 50;
            }if(s.charAt(j) == 'C'){
                sum += 100;
            }if(s.charAt(j) == 'D'){
                sum += 500;
            }if(s.charAt(j) == 'M'){
                sum += 1000;
            }
        }
        return sum;
    }
}
