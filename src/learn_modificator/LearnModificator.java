package learn_modificator;

public class LearnModificator {

    public LearnModificator(String name) {
    }

    protected void print() {
        System.out.println("");
    }
}

class Child extends LearnModificator {
    public Child(String name) {
        super(name);
    }

    public void get() {
        print();
    }

    @Override
    protected void print() {
        super.print();
    }
}

/*
private - only inside class
default - only inside package
protected - only inside package + subclasses
public - full visible
*/
