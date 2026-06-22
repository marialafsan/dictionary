import java.util.*;

/**
 * Starting point of the dictionary project
 *
 * @author Maria Lafuente
 * @version 1.0
 * @since 1.0
 */
public class Main {

    public static void main (String[] args){

        /*
        Sample program to check if TextUI class works
         */

        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();

    }

}
