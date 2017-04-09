package learn_polimorphysm;

public class TestPolimorphysm {
    public static void main(String[] args) {
        Animal animal = new Lion();
//        animal.say();
        Animal[] animals = new Animal[3];

        Animal animal1 = new Animal();
        Animal lion = new Lion();//Animal + Lion
        Animal mouse = new Mouse();

        animals[0] = animal1;
        animals[1] = lion;
        animals[2] = mouse;

        for (Animal element : animals) {
            element.say();
        }

//        int a = "";

    }
}
