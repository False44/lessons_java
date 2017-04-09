package learn_overloading_overriding;

/**
 * Created by yura on 09.04.17.
 */
public class Child extends Parent {

    @Override
      protected String print(String text) {
        System.out.println("Child");
        return new String();
    }
}
