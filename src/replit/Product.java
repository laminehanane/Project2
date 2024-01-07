package replit;

public class Product {
    /*E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes.*/
    private int price;
    private String name;
    private int SKU;
    private String PrClass;

    public Product(int price, String name, int SKU, String prClass) {
        this.price = price;
        this.name = name;
        this.SKU = SKU;
        PrClass = prClass;
    }
  public void printInfo(){
      System.out.println(name+" "+PrClass+" "+price+" "+SKU);
  }
    void calculateTax(){
        System.out.println("tax payment due ");
    }
    void applyWarranty(){
        System.out.println("warranty is active");
    }
}
class Electronics extends Product{
    public Electronics(int price, String name, int SKU, String prClass) {
        super(price, name, SKU, prClass);
    }

    @Override
    void calculateTax() {
        System.out.println("TAX");
    }
}
class Clothing extends Product{
    public Clothing(int price, String name, int SKU, String prClass) {
        super(price, name, SKU, prClass);
    }

    @Override
    void applyWarranty() {
        System.out.println("WARRENTY");
    }
}
class Furniture extends Product{
    public Furniture(int price, String name, int SKU, String prClass) {
        super(price, name, SKU, prClass);
    }

    @Override
    void calculateTax() {
        System.out.println("NOTHING");
    }

    @Override
    void applyWarranty() {
        super.applyWarranty();
    }
}
class Books extends Product{

    public Books(int price, String name, int SKU, String prClass) {
        super(price, name, SKU, prClass);
    }
}
class ProductTester{
    public static void main(String[] args) {
        Product[] Arr={new Electronics(100,"hanane",0000,"A"),
                new Clothing(200,"yannis",1111,"B"),
                new Furniture(300,"souf",2222,"C"),
                new Books(400,"janna",333,"D")};
        for (Product product : Arr) {
            product.calculateTax();
            product.applyWarranty();
            product.printInfo();

        }
    }
}