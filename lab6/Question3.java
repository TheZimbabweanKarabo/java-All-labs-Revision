package lab6;

public class Question3 {
    static String banner = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";

    public static  void printBanner(){System.out.println(banner);}
    public static  String getBanner(){return banner;}

    public static void main() {
        printBanner();
        System.out.println(getBanner());
    }
    
}
