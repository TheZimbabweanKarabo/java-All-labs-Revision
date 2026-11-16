package lab6;

public class Question2 {
    public static double calculateArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }

    public static void main(){
        int[] numbers = {2,5,7,2,8,10};

        for (int i: numbers){
            System.out.println("radius " + i + " = " + calculateArea(i));
        }
    }   
}
