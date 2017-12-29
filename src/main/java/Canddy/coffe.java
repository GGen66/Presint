package Canddy;
// Так вышло что это будет мой главный, наследуемый подарок


public class coffe {

    private String brand;
    private double price;
    private int weight;
    private String parametr;

    public coffe(String brand, double price, int weight, String parametr) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.parametr = parametr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getParametr() {
        return parametr;
    }

    public void setParametr(String parametr) {
        this.parametr = parametr;
    }
}
