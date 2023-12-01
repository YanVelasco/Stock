import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product tv = new Product("TV", 1200.23, 26);
        System.out.println(tv);
        System.out.println(tv.valueInStock());
        tv.removeQuantity(15);
        System.out.println(tv);
        System.out.println(tv.valueInStock());
        System.out.println(tv.addProduct(20));
        System.out.println(tv);
        System.out.println(tv.valueInStock());
        tv.removeQuantity(32);
       

    }
}
