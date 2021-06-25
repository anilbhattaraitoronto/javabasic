package ifelse;

public class IfCond{
    public static void main(String[] args){
        char firstLetter = 'a';
        char secondLetter = 'b';
        if (firstLetter == secondLetter){
            System.out.println("First letter is equal to second letter");
        }else if (firstLetter !=secondLetter){
            System.out.println("They are not equal");
        }else{
            System.out.println("Something else");
        }
    }
}