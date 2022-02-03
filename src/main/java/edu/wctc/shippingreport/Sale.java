package edu.wctc.shippingreport;

public class Sale {
    private String name;
    private String country;
    private double price;
    private double tax;
    private double shipping;

    public double getTotal() {
        return price + tax + shipping;
    }


    public Sale() {
        this.name = "";
        this.country = "";
        this.price = 0;
        this.tax = 0;
        this.shipping = 0;
    }

    public Sale(String name, String country, double price, double tax, double shipping) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.tax = tax;
        this.shipping = shipping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}
