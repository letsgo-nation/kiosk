package kiosk;

public class Item extends Menu{
    protected double price;
    public Item(String name, double price, String description) {
        super(name, description);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
