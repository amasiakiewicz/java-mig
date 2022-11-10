package how.to.javamig.java12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.NumberFormat;
import java.util.Locale;
import org.junit.jupiter.api.Test;

class FormatNumberTest {

    @Test
    public void givenNumber_thenCompactValues() {
        final NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
        assertEquals("2.59K", likesShort.format(2592));

        final NumberFormat likesLong =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        likesLong.setMaximumFractionDigits(2);
        assertEquals("2.59 thousand", likesLong.format(2592));
    }

}
