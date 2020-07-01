public class Cat extends Animal implements Run {

    @Override
    public void getName() {
        System.out.println("Cat");
    }

    @Override
    public void toRun() {
        System.out.println("cat running");
    }
}
