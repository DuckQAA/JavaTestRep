//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Animal barsik = new Animal();
    System.out.println(barsik.age + " " + barsik.name);
    barsik.makeNoise();
    barsik.Eat();

    Animal sharik = new Animal();
    System.out.println(sharik.age + " " + sharik.name);
    sharik.makeNoise();
    sharik.Eat();

    Cat catBarsik = new Cat("Barsik", 5);
    System.out.println(catBarsik.age + " " + catBarsik.name);
    catBarsik.makeNoise();
    catBarsik.Eat();

    Dog dogSharik = new Dog("Sharik",4);
    System.out.println(dogSharik.age + " " + dogSharik.name);
    dogSharik.makeNoise();
    dogSharik.Eat();
//overload
    Cat boss = new Cat("Boss", 5);
    boss.makeNoise();
    boss.makeNoise("Awwwww");

    Rose rose = new Rose();
    rose.calculatePrice(5);
    rose.getPrice();

    }
}