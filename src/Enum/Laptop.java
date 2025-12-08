package Enum;

public enum Laptop {
    Mackbook(2000), xps(2200), Surface(1500), Thinkpad (1800);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
