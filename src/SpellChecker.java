//import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;


public class SpellChecker {
    public String assess(String phrase) {

        String[] dictionary = {"Hello", "Peggy"};
        String words[] = phrase.split(" ");
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            if (Arrays.asList(dictionary).contains(words[i])) {
                result.add(words[i]);
            } else {
                result.add("~" + words[i] + "~");

            }
        }
        String res = String.join(" ", result);
        return res;
    }
}