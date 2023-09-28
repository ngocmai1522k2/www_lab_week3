package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @Column(name = "image_id")
    private String image_id;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
    private String path;
    private String alternative;

    public ProductImage() {

    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public void setProduct_id(Product product_id) {
        this.product = product_id;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public Product getProduct_id() {
        return product;
    }

    public String getPath() {
        return path;
    }

    public String getAlternative() {
        return alternative;
    }

    public ProductImage(String imageId, Product product, String path, String alternative) {
        image_id = imageId;
        product = product;
        this.path = path;
        this.alternative = alternative;
    }
}
