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
     * @param scanner Allows to read imputs from the keyboard
     * @param dictionary SimpleDictionary object. Uses a hashmap to pair words with their translations.
     */
    public TextUI (Scanner scanner, SimpleDictionary dictionary){

        this.scanner = scanner;
        this.dictionary = dictionary;

    }

    public void menu(){

        System.out.println("list of commands: ");
        System.out.println();
        System.out.println("add - Add a word to the dictionary");
        System.out.println("search - Search the translation of a word in the dictionary");
        System.out.println("menu - Displays the menu of commands");
        System.out.println("end - Exit the program");


    }

    public void longLine(){
        System.out.println("--------------");
    }

    /**
     * Reads commands from the user and displays different messages accordingly
     * "add" saves two instances of pairs key-value in the dictionary
     * "search" looks for the value pair of the key word given and prints it. If it's null, will show a diff msg
     */
    public void start(){

        String word;
        String translation;

        longLine();
        System.out.println("DICTIONARY APP");
        longLine();
        this.menu();
        longLine();
        System.out.println();

        while (true) {

            System.out.println("Command: ");
            word = scanner.nextLine();
            longLine();

            // finishes the program
            if (word.equalsIgnoreCase("end")) {
                System.out.println("Bye, bye!");
                break;

            // the words get added to the dictionary object twice, for the search in each language
            } else if (word.equalsIgnoreCase("add")) {
                System.out.println("Word: ");
                word = scanner.nextLine();

                System.out.println("Translation: ");
                translation = scanner.nextLine();

                dictionary.add(word, translation);
                dictionary.add(translation, word);

            } else if (word.equalsIgnoreCase("menu")){

                this.menu();

            } else if (word.equalsIgnoreCase("search")){

                if (dictionary.isEmpty()){
                    System.out.println("The dictionary is empty");

                } else {

                    System.out.println("Word to be translated: ");
                    word = scanner.nextLine();
                    translation = dictionary.translate(word);

                    if (translation == null) {
                        System.out.println("The word " + word + " is not yet in the dictionary");

                    } else {
                        System.out.println("Translation: " + translation);
                    }
                }

            } else {
                System.out.println("Command Unknown");

            }

        longLine();

        }

    }

}
