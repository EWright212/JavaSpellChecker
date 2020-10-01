public class SpellChecker {
    public String assess(String phrase) {
        if (phrase == "Hello") {
            return phrase;
        } else {
            return "~" + phrase + "~";
        }
    }
}