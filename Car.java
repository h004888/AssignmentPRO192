public class Car {
    private double price;
    public Car(){

    }
    public Car(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car [price=" + price + "]";
    }
    
}
