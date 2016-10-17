
import java.util.Scanner;
public class Name
{
    public static String SubString(String Name) {
        return(Name.substring(Name.indexOf(" ")+1,Name.length()));
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please type in your name.");
        String Name = input.nextLine();
        
        System.out.println("Hello "+SubString(Name));
    }
}
