public class Chicken extends Animal implements Fly, Run {

    @Override
    public void getName() {
        System.out.println("Koko");
    }

    @Override
    public void toFly() {

        System.out.println("i can fly");
    }

    @Override
    public void toRun() {

        System.out.println("i running");
    }
}
