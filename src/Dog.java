public class Dog extends Pet{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("гав-гав");
    }


}
