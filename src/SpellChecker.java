import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;


public class SpellChecker {
    public String assess(String phrase) {

//        String[] dictionary = {"Hello", "Peggy"};

        String[] dictionary = new String[] {"Hello", "Peggy"};
        String words[] = phrase.split(", ");
        Character[] objarrayDictionary = ArrayUtils.toObject(dictionary);
        Character[] objarrayWords = ArrayUtils.toObject(words);
        Set<T> setA = new HashSet(Arrays.asList(objarrayA));
        Set<T> setB = new HashSet(Arrays.asList(objarrayB));

        setA.removeAll(setB);

        Character[] result;
        result = setA.toArray(result);
        char[] cresult = ArrayUtils.toPrimitive(result);

        if (Arrays.asList(dictionary).contains(phrase)) {
            return phrase;
        } else {
            return "~" + phrase + "~";
        }
    }
}