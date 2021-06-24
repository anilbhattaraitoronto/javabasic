package strings;

public class Strlen{
    public static void main(String[] args){
        // use length function to find out the number of characters in a string

        String myFullName = "Anil Bhattarai";
        int lenChar = myFullName.length();
        System.out.println("The number of characters in my name: " + lenChar);
        System.out.println(myFullName.toLowerCase());
        System.out.println(myFullName.toUpperCase());
        System.out.println("the location is: " + myFullName.indexOf("Anil"));
        System.out.println("My home town is \"laurighol\"");
        System.out.println("Can I call you \'weirdo\'");
        System.out.println("It\'s called \\ backslash.");
        System.out.println(myFullName.contains("anil"));
        System.out.println(myFullName.contains("Anil"));
        System.out.println(myFullName.replace("a", "b"));
    }
}