/**
 * Creation of a Dictionary with the use of HashMaps
 *
 * Features: Addition of new pairs of words that can be searched later on
 * Features: Translation of words previously added
 * Features: Checks if the dictionary is empty
 *
 *  @since 1.0
 */

import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> dictionary;

    public SimpleDictionary() {
        this.dictionary = new HashMap<>();
    }

    /**
     * Translates a given word if it's in the dictionary
     * @param word The given word
     * @return translation or null
     */
    public String translate(String word) {

        return this.dictionary.get(word);
    }

    /**
     * Answers if the dictionary is empty
     * @return true or false
     */
    public boolean isEmpty(){

        if (dictionary.isEmpty()){
            return true;
        }
        return false;
    }

    /**
     * Adds the word and its translations. Includes two entries to allow for the translation on either language
     * @param word The given word
     * @param translation The translation given
     */
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
        this.dictionary.put(translation, word);
    }
}
