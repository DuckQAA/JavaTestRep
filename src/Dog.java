public class Dog extends Animal {
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void makeNoise() {
        System.out.println("Wof-wof");
    }
    @Override
    public void Eat() {
        System.out.println("Dog Eat");
    }
}
