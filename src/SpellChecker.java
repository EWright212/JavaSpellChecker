import java.util.Arrays;

public class SpellChecker {
    public String assess(String phrase) {

        String[] dictionary = {"Hello", "Peggy"};

        if (Arrays.asList(dictionary).contains(phrase)) {
            return phrase;
        } else {
            return "~" + phrase + "~";
        }
    }
}