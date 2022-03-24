package ro.ase.cts.lab02;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public void applyPercentageDiscount(float discountPercent) {
        this.price -= (discountPercent / 100) * this.price;
    }

    public void applyAmountDiscount(double discountAmount) {
        this.price -= discountAmount;
    }

    public void increasePrice(double newPrice) {
        this.price = newPrice;
    }

    public void increasePriceAmount(double increasedPrice) {
        this.price += increasedPrice;
    }

    public boolean equals(Product p) {
        if (p.id != this.id &&
                !p.name.equals(this.name) &&
                p.price != this.price &&
                p.description != this.description)
            return false;

        return true;
    }


}
