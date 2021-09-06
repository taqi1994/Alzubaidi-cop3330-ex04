
import java.util.Scanner;

public class MidLib

{

    public static void main(String[] args)
    {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter Noun: "); //ask for an input
        String noun = keyboardInput.nextLine();
        System.out.print("Enter a Verb : "); //ask for an input
        String Verb = keyboardInput.nextLine();
        System.out.print("Enter Adjective: "); //ask for an input
        String Adjective = keyboardInput.nextLine();
        System.out.print("Enter Adverb: "); //ask for an input
        String Adverb = keyboardInput.nextLine();

        //this will print out inputs in front of a string
        System.out.println("Do you " +Verb +" your" + Adjective +" "+ noun +" "+ Adverb+" ? That's hilarious");
    }

}
