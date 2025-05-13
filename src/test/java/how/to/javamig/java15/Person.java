package how.to.javamig.java15;

public abstract sealed class Person
        permits Person.Employee, Person.Manager { //classes here must be sealed, non-sealed, final

    //...

    public final class Employee extends Person {
    }

    public non-sealed class Manager extends Person {
    }

}
