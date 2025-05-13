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
    @Getter(AccessLevel.NONE) //record can't do that 
    public static class ColorValueObject extends AwesomeClass {  //no extends for record
        int red;
        int green;
        int blue;

        public static ColorValueObject create() {  // no static factory methods in records as well
            //additional logic...
            return new ColorValueObject(3, 4, 5);
        }

        public String getHexString() {
            return String.format("#%02X%02X%02X", red, green, blue);
        }
    }

}
