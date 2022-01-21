package behaviors.visitor;

public class Product{

    private float price;
    private float stock;
    private float discount;

    public Product(float price, float stock) {
        this.price = price;
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public float getStock() {
        return stock;
    }
    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product { price=" + this.price +", stock=" + this.stock +", discount=" + this.discount +'}';
    }
}
