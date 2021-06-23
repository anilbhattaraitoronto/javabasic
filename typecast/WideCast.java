package typecast;


public class WideCast {
    
    public static void main(String[]args){
        //wide casting example when 'lower' numerical type is assigned to higher ones
        byte myAge = 51;
        short myShortAge = myAge;
        long myLongAge = myShortAge;
        System.out.println("My age is: " + myAge);
        System.out.println("My short age is: " + myShortAge);
        System.out.println("My long age is: " + myLongAge);
    }
}