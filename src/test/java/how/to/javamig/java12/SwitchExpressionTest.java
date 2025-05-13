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

        typeOfDay = switch (dayOfWeek) {  //switch returns value, which we can assign
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";  //no need for 'break'
            case SATURDAY, SUNDAY -> "Day Off";
        };

        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Working Day");  //don't need to return anything
            case SATURDAY, SUNDAY -> {  //more complex logic in brackets
                System.out.println("Day Off");
            }
        }

    }

}
