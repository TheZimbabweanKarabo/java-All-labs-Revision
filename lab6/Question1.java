package lab6;

public class Question1 {
    public static boolean isEven(int num){return num%2==0;}

    public static  void main(){
        int[] numbers = {2,5,7,2,8,10};

        for(int num : numbers){
            if(isEven(num)){
                System.out.println(num + " is an even number");
            }else{
                System.out.println(num + " is not an even number");
            }
        }
    }
    
}
