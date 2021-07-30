import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarCypherTest {
    @Test
    public void caesar_Cypher_shiftCharacterOneStepForward_char(){
        CaesarCypher caesarCypher = new CaesarCypher();
        char actual = 'a';
        char expected = 'b';
        Assertions.assertEquals(expected, caesarCypher.shiftCharOneStepForward(actual));
    }
}
