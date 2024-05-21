public class Cat extends Animal {
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    };

    @Override
    public void makeNoise() {
        System.out.println("Meow-meow");
    }
    @Override
    public void Eat() {
        System.out.println("Wiskas");
    }

}
