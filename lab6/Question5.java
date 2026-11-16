package lab6;

public class Question5 {
    static void displayInfo(String name){
        System.out.println("Hi " + name + "! Great to meet you");
    }

    static void displayInfo(String name, int age){
        System.out.println("Hi " + name + "! Congrats on being " + age + " years old.");
    }

    public static void main(String[] args) {
        displayInfo("Karabo");
        displayInfo("You're Hired", 312);
    }
}
