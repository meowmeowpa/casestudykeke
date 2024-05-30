package BaiTapThayNhat;

public class Product {
    private String productName;
    private double prise;
    private int number;

    public Product(String productName, double prise, int number) {
        this.productName = productName;
        this.prise = prise;
        this.number = number;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", prise=" + prise +
                ", number=" + number +
                '}';
    }

}
