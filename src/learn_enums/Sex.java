package learn_enums;

import learn_class.LearnClass;

public enum Sex {
    MAN("Man"), WOMAN("Woman");

    private String shortName;

    Sex(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}

class TestEnum {

    public static void main(String[] args) {
        Sex sex = Sex.WOMAN;
        LearnClass learnClass = new LearnClass(1, "5");
//        learnClass.print(Sex.MAN);
       /* for (Sex sex1 : Sex.values()) {
            System.out.println(sex1);
        }*/
        String str = "Woman";
        Sex sex1 = Sex.valueOf(str.toUpperCase());
    }

}
