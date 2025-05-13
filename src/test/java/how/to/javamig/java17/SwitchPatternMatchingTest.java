package how.to.javamig.java17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.api.Test;

class SwitchPatternMatchingTest {

    static record Human(String name, int age, String profession) {}

    @AllArgsConstructor
    @Getter
    static sealed class Shape permits Circle, Triangle {
        int numberOfSides;
    }

    static final class Circle extends Shape {

        public Circle(final int numberOfSides) {
            super(numberOfSides);
        }
    }

    static non-sealed class Triangle extends Shape {

        public Triangle(final int numberOfSides) {
            super(numberOfSides);
        }
    }

    @Test
    void testShapes() {
        final Human obj = new Human("John", 36, "Teacher");
        final String checkObject = checkObject(obj);
        System.out.println(checkObject);

        final Triangle triangle = new Triangle(5);
        final String checkShape = checkShape(triangle);
        System.out.println(checkShape);
    }

    String checkObject(Object obj) {
        return switch (obj) {
            case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
            case Circle c -> "This is a circle";
            case Shape s -> "It is just a shape";
            case null -> "It is null";
            default -> "It is an object"; //sealed class compilation error if not all cases provided
        };
    }

    String checkShape(Shape shape) {
        return switch (shape) {
            case Triangle t when t.getNumberOfSides() != 3 -> "This is a weird triangle"; //when from JDK 19
            case Circle c when c.getNumberOfSides() != 0 -> "This is a weird circle";
            default -> "Just a normal shape";
        };
    }

}
