package how.to.javamig.java13;

import org.junit.jupiter.api.Test;

class TextBlockTest {

    @Test
    void textBlock() {
        String json = """
                {
                    "type" : "CUSTOM_FORM",
                    "name" : "Welcome %s"
                }
                """;

        final String formattedJson = json.formatted("Arek"); //podobnie jak format dla zwykłych stringów, tyle że dla text block
        System.out.println(formattedJson);

    }

}
