package how.to.javamig.java12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class SwitchExpressionTest {

    @Test
    void switchExpression() {
        final DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }

        typeOfDay = switch (dayOfWeek) {  //od razu można zrobić przypisanie
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";  //nie ma potrzeby używania break'ów
            case SATURDAY, SUNDAY -> "Day Off";
        };

        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Working Day");  //nie musi nic zwracać
            case SATURDAY, SUNDAY -> {  //bardziej skomplikowana logika w nawiasach
                System.out.println("Day Off");
            }
        }

    }

}
