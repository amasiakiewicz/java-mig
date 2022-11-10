package how.to.javamig.java13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class YieldTest {

    @Test
    public void whenSwitchingOnOperationSquareMe_thenWillReturnSquare() {
        final var me = 4;
        final var operation = "squareMe";
        final int result = switch (operation) {
            case "doubleMe" -> {
                //....
                yield me * 2; //to taki return z case'a z nawiasem
            }
            case "squareMe" -> {
                yield me * me;
            }
            default -> me;
        };

        assertEquals(16, result);
    }

}
