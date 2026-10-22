// Tiger Bao and Vandhith Ande
import java.util.Scanner;

public class Ande_Madlibs {
    public static String askReceive(String ask, Scanner sc){
        // function to ask user for an input, returns said input.
        // string ask is the prompt the user is asked, sc is scanner object used
        System.out.println(ask);
        String result = sc.nextLine(); 
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ask for all required input
        String firstVerb = askReceive("Enter a verb: ", sc);
        String firstAdj= askReceive("Enter a adjective: ", sc);
        String secondVerb = askReceive("Enter a verb: ", sc);

        //print out
        System.out.print("I " + firstVerb + " with the " + firstAdj + " <noun>. The <plural_noun> and the <number> beasts " + secondVerb + " there.");
        sc.close();
    }
    
}

/*
we do verbs and adj
I <verb> with the <adjective> <noun>; the <plural_noun> and the <number> beasts <verb> there.             

*/
