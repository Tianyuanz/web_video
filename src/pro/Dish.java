package pro;

public class Dish {
    private String name;

    private String isMeat;

    private double price;



    public Dish(String name, String isMeat, double price) {
        super();
        this.name = name;
        this.isMeat = isMeat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsMeat() {
        return isMeat;
    }

    public void setIsMeat(String isMeat) {
        this.isMeat = isMeat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish [name=" + name + ", isMeat=" + isMeat + ", price=" + price + "]";
    }

}
