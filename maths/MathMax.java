package maths;

public class MathMax{
    public static void main(String[] args){
        //Using max function
        System.out.println(Math.max(35, 56));
        System.out.println(Math.min(24, 2));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.67));
        System.out.println(Math.random());
        int randNum = (int)(Math.random()*101);
        System.out.println("The random number is: " +randNum);
    }
}