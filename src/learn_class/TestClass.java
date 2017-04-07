package learn_class;

public class TestClass {
    public static void main(String[] args) {

        LearnClass learnClass = new LearnClass(1, "Name1");
//        LearnClass learnClass = null;
        learnClass = new LearnClass(1, "Name1");

        int count = 15;

//        LearnClass learnClass = new LearnClass();
        LearnClass.setCountOfLifes(25);
        learnClass.setCountOfChildren(23);//(this, 23)this = learnClass

        LearnClass learnClass1 = new LearnClass(2, "Name2");
//        LearnClass learnClass1 = learnClass;

        learnClass1.setCountOfChildren(8);//(this, 8)this = learnClass1

        System.out.println(LearnClass.getCountOfLifes());

        learnClass.print(1, 2, 3);
        learnClass.print(1, 2, 3, 4, 5);

        int a = 15;
        learnClass.change(a);

        learnClass.change(learnClass1);
        System.out.println(learnClass.getCountOfChildren());

        System.out.println(a);
    }
}
