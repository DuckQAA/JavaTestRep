public abstract class Flower implements PriceCalculation{
    private String color;
    private int price;
    public void setFlower(String color, int price) {
        this.color = color;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
}
