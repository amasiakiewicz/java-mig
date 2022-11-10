package how.to.javamig.java10;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

class VarTest {

    @Test
    void testingVar() {
        final var obj = new Object();
        final var msg = "aaa";
        final var map = new HashMap<String, String>();
        final var map1 = new HashMap<>(); //tak już nie, bo nie wiadomo jaki tu jest typ (tzn wiadomo, ale nie jest jasno określony)

    }

}
