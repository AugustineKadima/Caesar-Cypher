import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarCypherTest {
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_stringShift0_int(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "a";
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward("a", 0));
    }
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_emptyString_int(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "Please type your word";
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward("", 7));
    }
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_string_int_shiftValueGreaterThan25OrLessThan1(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "Shift value should be a number greater or equal to 1 and less or equal to 25";
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward("bhbj", -6));
    }
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_string_int_shiftedString(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "z";
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward("a", 25));
    }
    @Test
    public void caesar_Cypher_decipherText_string_char(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "x";
        Assertions.assertEquals(expected, caesarCypher.dicipherText());
    }

}
