package typecast;
public class NarrowCast{
    public static void main(String[] args){
        // narrow casting variables
        long myAge = 51;
        int myIntAge = (int) myAge;
        short myShortAge = (short) myAge;
        double myDoubleAge = (double) myShortAge;
        float myFloatAge = (float) myDoubleAge;
        System.out.println("My long age is: " + myAge);
        System.out.println("My int age is: " + myIntAge);
        System.out.println("My short age is: " + myShortAge);
        System.out.println("My double age is: " + myDoubleAge);
        System.out.println("My float age is: " + myFloatAge);
    }
    
}