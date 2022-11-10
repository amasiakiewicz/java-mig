package how.to.javamig.java15;

public abstract sealed class Person
        permits Person.Employee, Person.Manager { //klasy tu muszą być sealed, non-sealed, final

    //...

    public final class Employee extends Person {
    }

    public non-sealed class Manager extends Person {
    }

}
