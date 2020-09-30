import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class spellCheckerTest {
    private SpellChecker spellCheckerApp = new SpellChecker();
    @Test
    public void testCorrectSingleWord() {
        assertEquals("Hello", spellCheckerApp.assess("Hello"));
    }
}
