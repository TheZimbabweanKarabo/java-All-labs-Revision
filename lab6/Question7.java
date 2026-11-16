package lab6;

import java.util.*;
public class Question7 {
    public static void tryDouble(int num){
        num = num*2;
        System.out.println("\nFrom inside the function : " + num);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = console.nextInt();

        tryDouble(num);

        System.out.println("\nFrom outside the function : " + num);

        console.close();
    }
}
