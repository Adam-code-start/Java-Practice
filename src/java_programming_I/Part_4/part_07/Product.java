package java_programming_I.Part_4.part_07;

public class Product {
    private double price;
    private int quantity;
    private String name;
    public Product(String initialName, double initialPrice, int initialQuantity)
    {
        price = initialPrice;
        quantity = initialQuantity;
        name = initialName;
    }
    public void printProduct()
    {
        System.out.println(name + ", " + "price " + price + ", " + quantity + " pcs");
    }
    public static void main(String[] args)
    {
        Product Banana = new Product("Banana", 1.1, 13);
        Banana.printProduct();
    }
}
