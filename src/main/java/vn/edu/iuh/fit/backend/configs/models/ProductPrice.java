package vn.edu.iuh.fit.backend.configs.models;

import jakarta.persistence.*;
import lombok.*;
import org.joda.time.DateTime;

@Entity
@Table(name = "product_price")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductPrice {

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
    @Id
    private DateTime price_date_time;
    private double price;
    @Column(length = 250, nullable = false)
    private String note;

}
