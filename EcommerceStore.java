import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }
}

public class EcommerceStore {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("iPhone", 999.99, 2);
        Product product2 = new Product("Samsung Galaxy", 799.99, 3);
        Product product3 = new Product("Google Pixel", 899.99, 1);

        // Create a shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add products to the shopping cart
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);

        // Calculate and display the total price
        double totalPrice = shoppingCart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
