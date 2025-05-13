package how.to.javamig.java17;

import java.util.random.RandomGeneratorFactory;
import org.junit.jupiter.api.Test;

class RandomNumberTest {

    @Test
    void getPsuedoRandomInts() {
        RandomGeneratorFactory.of("L128X1024MixRandom") //or getDefault
                .create()
                .ints(12, 0, 100)
                .forEach(System.out::println);

    }

}
