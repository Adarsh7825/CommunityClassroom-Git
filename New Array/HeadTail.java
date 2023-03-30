import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class HeadTail {
    public static void main(String[] args) {
        System.out.println("Choose the one side Of the Coin Head or tail");
        System.out.println("1. Head");
        System.out.println("2. Tail");
        Scanner in = new Scanner(System.in);
//        System.out.println(in.nextInt());
        int a = in.nextInt();
        if (Math.random() < 0.5){
            System.out.println("Recursion");
        }else{
            System.out.println("Oop");
        }

    }

}
