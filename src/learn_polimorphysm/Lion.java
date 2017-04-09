package learn_polimorphysm;

/**
 * Created by yura on 09.04.17.
 */
public class Lion extends Animal {

    @Override
    public void say() {
        System.out.println("R-r-r");
    }

    public int getNumber() {
        return 5;
    }
}
