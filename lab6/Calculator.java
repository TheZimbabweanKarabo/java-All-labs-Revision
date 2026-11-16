package lab6;
/*Write a class called Calculator with a static method add(int a, int b), and an instance method multiply(int a, int b) that uses a
private instance field called callCount, incremented every time multiply() is called. */
public class Calculator {
    private static  int callCount = 0;

    Calculator(){}

    public int add(int a,int b){return a+b;}
    public int multiply(int a,int b)
    {
        callCount++;
        return a+b;
    }
    public int getCallCount(){return callCount;}

    public static void main(String[] args) {
        Calculator calcus = new Calculator();

        calcus.add(5, 8);
        calcus.multiply(4,5);
        calcus.multiply(4,5);
        calcus.multiply(4,5);
        calcus.multiply(4,5);
        calcus.multiply(4,5);
        System.out.println(calcus.getCallCount());
    }

    
}
