package entities;

import java.util.Date;

public class Order {
    
    private Date date;
    private Product product;


    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
    }


    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
