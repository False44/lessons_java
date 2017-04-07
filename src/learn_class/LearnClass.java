package learn_class;

import learn_enums.Sex;

import java.util.Arrays;

public class LearnClass {
    private int countOfChildren;//0
    private String name;//null
//    private LearnClass learnClass = new LearnClass(1, "56");

    private static int countOfLifes = 20;
    public static final String LASTNAME = "LastName";

    /*{
        System.out.println("I'm not static block initialization");
    }*/

    static {
//        System.out.println("I'm static block initialization");
//        System.out.println("Hello world");
//        LASTNAME = "";
    }


    public LearnClass(int newCountOfChildren, String newName) {
//        System.out.println("Constructor");
        countOfChildren = newCountOfChildren;
        name = newName;
    }

    public void print(Sex sex) {
        System.out.println(sex.getShortName());
    }

    public static int getCountOfLifes() {
        return countOfLifes;
    }

    public static void setCountOfLifes(final int countOfLifes) {
        LearnClass.countOfLifes = countOfLifes;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public void setCountOfChildren(int newCountOfChildren) {
        this.countOfChildren = newCountOfChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void print(int number, int number1, int... a) {
        System.out.println(Arrays.toString(a));
    }

    public void change(int a) {
        a = 10;
    }

    public void change(LearnClass a) {
        int c = 10;
//        System.out.println(c);
        if (1 == 1) {
            int y = 45;
        }
        a.setCountOfChildren(56);
    }


    public static void main(String[] args) {

    }
}

class Man {

}
