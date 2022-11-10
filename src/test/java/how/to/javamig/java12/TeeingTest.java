package how.to.javamig.java12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class TeeingTest {

    @Test
    public void givenSetOfNumbers_thenCalculateAverage() {
        final double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        assertEquals(3.0, mean);
    }

}
