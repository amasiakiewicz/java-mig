package how.to.javamig.java12;

import org.junit.jupiter.api.Test;

class InstanceOfTest {

    @Test
    void instanceOfOld() {
        final Object obj = "Hello World!";
        if (obj instanceof String) {
            String s = (String) obj;
            final int length = s.length();
        }
    }

    @Test
    void instanceOfNew() {
        final Object obj = "Hello World!";
        if (obj instanceof String s) {
            final int length = s.length(); //no type casting
        }

    }

}
