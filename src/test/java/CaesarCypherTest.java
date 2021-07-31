import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarCypherTest {
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_string_int(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "a";
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward("a", 0));
    }
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_emptyString_int(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "";
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward("", 0));
    }
}
