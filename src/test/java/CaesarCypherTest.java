import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarCypherTest {
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_char(){
        CaesarCypher caesarCypher = new CaesarCypher();
        String expected = "a";
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward("a", 0));
    }
}
