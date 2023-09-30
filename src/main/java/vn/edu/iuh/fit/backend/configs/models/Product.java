package vn.edu.iuh.fit.backend.configs.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.backend.configs.enumClass.ProductStatus;

import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productID;
    @Column(length = 150, nullable = false)
    private String name;
    @Column(length = 250, nullable = false)
    private String description;
    @Column(length = 25, nullable = false)
    private String unit;
    @Column(length = 150, nullable = false)
    private String manufacturer_name;
    @Column(columnDefinition = "int", nullable = false)
    private ProductStatus status;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> imageList;

    @OneToMany(mappedBy = "product")
    private List<ProductPrice> productPriceList;

    @OneToMany(mappedBy = "product",  cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetailList;

}
