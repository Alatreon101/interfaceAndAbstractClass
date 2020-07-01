public class Dog extends Animal implements Swim, Run {

    @Override
    public void getName() {
        System.out.println("DoG");
    }

    @Override
    public void toRun() {
        System.out.println("dog running");
    }

    @Override
    public void toSwim() {

        System.out.println("dog swimming");
    }
}
