package ua.edu.cbs.lms.hometask_oop_7.task3;

public class Price {
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


}
