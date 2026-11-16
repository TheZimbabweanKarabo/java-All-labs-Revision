package lab6;

public class Question4 {
    static int overload(int a, int b){return a+b;}
    static String overload(String a, String b){return a+b;}
    static double overload(double a, double b){return a+b;}

    public static void main(){
        System.out.println(overload(2, 5));
        System.out.println(overload("take a deep breath", " drink water"));
        System.out.println(overload(2.4, 5.8));
    }
}
