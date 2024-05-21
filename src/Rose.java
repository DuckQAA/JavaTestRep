public class Rose extends Flower {

    @Override
    public void calculatePrice(int numberOfFlowers) {
        int sum = numberOfFlowers * getPrice();
    }
}
