package learn_overloading_overriding;

/**
 * Created by yura on 09.04.17.
 */
public class Parent {

    Object print(String text) {
        System.out.println("Parent");
        return new Object();
    }
}

/*
private - only inside class
default - only inside package
protected - only inside package + subclasses
public - full visible
*/