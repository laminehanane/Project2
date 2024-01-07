package HomeWork;

public class Product {
    //Construct a class Product with attributes like product_name, price, and quantity.
    //Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
    //Override a method in DiscountedProduct to calculate the price after applying the discount.
    //Create instances of both classes and show how prices are calculated

private String name;
private double price;
private int quantity;
        public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void prinInfo(){
        System.out.println(name+" "+price+" "+quantity);
        }
         void TotalPrice(double TotalPrice,double discount){
           TotalPrice=quantity*price;
            System.out.println(TotalPrice);
        }
}
class DiscountedPro extends Product {
    public DiscountedPro(String name, double price, int quantity,double discount) {
        super(name, price, quantity);
    }


    void TotalPrice() {
        double discount = 0;
        double  TotalPrice=0;
        TotalPrice=TotalPrice-discount;
        System.out.println("Discounted Price:"+TotalPrice);
    }
}


