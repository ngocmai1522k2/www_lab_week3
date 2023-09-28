package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice {

    @ManyToOne
    @JoinColumn(name = "pro_id", referencedColumnName = "pro_id")
    private Product product;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String price_id;
    private LocalDateTime price_date;
    private double price;
    private String note;

    public ProductPrice() {
    }

    public ProductPrice(Product pro_id, String price_id, LocalDateTime price_date, double price, String note) {
        this.product = pro_id;
        this.price_id = price_id;
        this.price_date = price_date;
        this.price = price;
        this.note = note;
    }

    public Product getPro_id() {
        return product;
    }

    public void setPro_id(Product pro_id) {
        this.product = pro_id;
    }

    public String getPrice_id() {
        return price_id;
    }

    public void setPrice_id(String price_id) {
        this.price_id = price_id;
    }

    public LocalDateTime getPrice_date() {
        return price_date;
    }

    public void setPrice_date(LocalDateTime price_date) {
        this.price_date = price_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
