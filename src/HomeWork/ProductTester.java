package HomeWork;

public class ProductTester {
    public static void main(String[] args) {
        Product P=new Product("cake",40.99,2);
        P.prinInfo();

        DiscountedPro DP=new DiscountedPro("bread",20.5,2,10.5);
        DP.prinInfo();
        DP.TotalPrice();

    }
}
