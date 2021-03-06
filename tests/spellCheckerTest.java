import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;


public class spellCheckerTest {
    private SpellChecker spellCheckerApp = new SpellChecker();

    @Test
    public void testCorrectSingleWord() {
        assertEquals("Hello", spellCheckerApp.assess("Hello"));
        assertEquals("Peggy", spellCheckerApp.assess("Peggy"));
    }

    @Test
    public void testIncorrectSingleWord() {
        assertEquals("~Helloooooo~", spellCheckerApp.assess("Helloooooo"));
    }

    @Test
    public void testTwoCorrectWords() {
        assertEquals("Hello Peggy", spellCheckerApp.assess("Hello Peggy"));
    }

    @Test
    public void testOneCorrectOneIncorrectWord() {
        assertEquals("~Hello000~ Peggy", spellCheckerApp.assess("Hello000 Peggy"));
    }
}
