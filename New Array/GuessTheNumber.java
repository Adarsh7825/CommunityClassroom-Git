import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int target = (int)Math.random();
        Scanner in = new Scanner(System.in);
//        System.out.println(in.nextInt());

        while (true) {
            System.out.println("Enter the any Number from (0 to 100) You want ");
            int ans = in.nextInt();

            if (ans > target) {
                System.out.println("Number is too Big");

            }if ( target <= 10){
                System.out.println("Target is lie Between 10 you are too close");
            }
            if (target >= 11){
                System.out.println("Target is lie Between 11 you are too close");

            }
            if (ans < target) {
                System.out.println("Number is too Small");
                if ( target <= 10){
                    System.out.println("Target is lie Between 10 you are too close");
                }
            }
            if (ans == target) {
                System.out.println("You are Correct !!!");
            }
        }
//        System.out.println("You Win");
    }

    static void Guess(int ans, int target){
        if (ans > target){
            System.out.println("Number is too Big");
        }
        if (ans < target){
            System.out.println("Number is too Small");
        }
        if (ans == target){
            System.out.println("You are Correct !!!");
        }
    }
}
