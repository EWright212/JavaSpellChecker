//import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;

public class SpellChecker {
    public String assess(String phrase) {

        String[] dictionary = {"Hello", "Peggy"};
        String words[] = phrase.split(" ");
        ArrayList<String> resultArrayList = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            String singleWord = words[i];
            if (Arrays.asList(dictionary).contains(singleWord)) {
                resultArrayList.add(singleWord);
            } else {
                resultArrayList.add("~" + singleWord + "~");

            }
        }
        String finalResult = String.join(" ", resultArrayList);
        return finalResult;
    }
}