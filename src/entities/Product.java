package entities;

public class Product {
    String name;
    Double price;
    int quantity;


    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double valueInStock(){
        return quantity * price;
    }

    public int addProduct(int quantity){
        return this.quantity += quantity;
    }

    public int removeQuantity(int quantityToRemove) throws IllegalArgumentException {
        if (this.quantity < quantityToRemove) {
            throw new IllegalArgumentException("Valor excede a quantidade disponivel.");
        } else {
            this.quantity -= quantityToRemove;
            return quantityToRemove;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " name='Name " + name + "'" +
            ", price='$ " + price + "'" +
            ", quantity='Units " + quantity + "'" +
            "}";
    }
    
}
