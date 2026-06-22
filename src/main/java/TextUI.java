import java.util.*;

/**
 * Handles the user interface
 *
 * @author Maria Lafuente
 * @version 1.0
 * @since 1.0
 */

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    /**
     * Imports the Scanner and the SimpleDictionary objects to interact with the user thu the console
     * @param scanner
     * @param dictionary SimpleDictionary object. Uses a hashmap to pair words with their translations.
     */
    public TextUI (Scanner scanner, SimpleDictionary dictionary){

        this.scanner = scanner;
        this.dictionary = dictionary;

    }

    /**
     * Reads commands from the user and displays different messages accordingly
     */
    public void start(){

        String word;

        System.out.println("DICTIONARY APP");
        System.out.println("--------------");
        System.out.println("");

        System.out.println("Command: ");
        word= scanner.nextLine();

        if(word.equals("end")){
            System.out.println("Bye, bye!");

        }else{
            System.out.println("Command Unknown");
        }

    }

}
