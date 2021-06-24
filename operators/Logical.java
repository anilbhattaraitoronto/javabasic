package operators;

public class Logical{
    public static void main(String[] args){
        // using logical operators

        int firstNumber = 25;
        int secondNumber = 45;
        boolean result1 = firstNumber > secondNumber && firstNumber > 25;
        boolean result2 = firstNumber < secondNumber || secondNumber <40;
        System.out.println("The first result is: " + result1);
        System.out.println("The second result is: " + result2);
    }
}