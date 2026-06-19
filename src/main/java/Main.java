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
        Sample program to check if SimpleDictionary class works
         */

        SimpleDictionary testDictionary = new SimpleDictionary();
        testDictionary.add("one", "uno");
        testDictionary.add("two", "dos");

        System.out.println("one \n- translation: " + testDictionary.translate("one") + "\n");
        System.out.println("two \n - translation: " + testDictionary.translate("two") + "\n");
        System.out.println("three \n - translation: " + testDictionary.translate("three") + "\n");
        System.out.println("dos \n - translation: " + testDictionary.translate("dos") + "\n");

    }

}
