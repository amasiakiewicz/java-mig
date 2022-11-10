package how.to.javamig.java14;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

class RecordTest {

    public record ColorRecord(int red, int green, int blue) {

        public String getHexString() {
            return String.format("#%02X%02X%02X", red, green, blue);
        }
    }

    @Value
    @Getter(AccessLevel.NONE) //record tego nie potrafi, choć nie żeby to było jakoś potrzebne 
    public static class ColorValueObject extends AwesomeClass {  //nie potrafi też robić extenda
        int red;
        int green;
        int blue;

        public static ColorValueObject create() {  // record też tego nie potrafi, ma tylko konstruktor, więc jest mało elastyczny
            //dodatkowa logika ...
            return new ColorValueObject(3, 4, 5);
        }

        public String getHexString() {
            return String.format("#%02X%02X%02X", red, green, blue);
        }
    }

}
