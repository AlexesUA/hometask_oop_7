package ua.edu.cbs.lms.hometask_oop_7.task3;

public class Price implements Comparable{
    private Shops shop;
    private String product;
    private double price;

    public Price(Shops shop, String product, double price){
        this.shop = shop;
        this.product = product;
        this.price = price;
    }

    public Shops getShop() {
        return shop;
    }

    public void setShop(Shops shop) {
        this.shop = shop;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return String.format("%1$s in store %2$s cost %3.2f uah.", product,shop,price);
    }

    @Override
    public int compareTo(Object o) {
        try {
            return this.shop.compareTo((Shops)o);
        }
        catch (Exception error){
            System.out.println("ERROR: " + error.getMessage());
            return 0;
        }
    }
}
