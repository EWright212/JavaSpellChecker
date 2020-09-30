import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class spellCheckerTest {

    private SpellChecker spellChecker = new SpellChecker() {

        @Test
        public void testCorrectSingleWord() {
         assertEquals("Hello", spellChecker.assess("Hello"));
        }

//        @Test
//        public void testSingleWords() {
//            assertEquals("Hello", SpellChecker.assess("Hello"));
//        }


    };
}
