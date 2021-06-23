package operators;

public class Arith{
    public static void main(String[] args){
        //arithmatic operators
        /* 
        addition subtraction multiplication, division, modulus
        */
        int totalPrice = 25;
        int unitPrice = 5;
        totalPrice +=5;
        totalPrice -=5;
        totalPrice *=5;
        totalPrice /=25;
        int remainder = unitPrice%2;
        int totalNumber = totalPrice/unitPrice;
        System.out.println("Total number of items is: " + totalNumber);
        System.out.println("The remainder is: " + remainder);
    }
}