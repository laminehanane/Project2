package replit;

public class ProductEncapsulation {
    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public ProductEncapsulation(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    void restock(int amount){
        int restock=stockQuantity+amount;
        System.out.println("New stock "+restock);

    }
    void sell(int amount){
     int sell=stockQuantity-amount;
        System.out.println(sell);
        double totalsellprice=sell*price;
        System.out.println("totale :"+totalsellprice);;
    }
    void printProductDetails(){
        System.out.println("productID: "+productID+ "productName: "+productName+" price: "+price+" stock: "+stockQuantity);
    }
}
class ProductEncapsulationTester{
    public static void main(String[] args) {
        ProductEncapsulation P=new ProductEncapsulation("XXX"," JUICE",2,10);
        P.restock(5);
        P.sell(3);
        P.printProductDetails();
        System.out.println(P.getStockQuantity());
        P.setStockQuantity(20);
        System.out.println(P.getStockQuantity());
        P.setProductName("computer ");
        P.setPrice(100.99);
        P.printProductDetails();
        System.out.println(P);
        P.sell(5);





    }
}
