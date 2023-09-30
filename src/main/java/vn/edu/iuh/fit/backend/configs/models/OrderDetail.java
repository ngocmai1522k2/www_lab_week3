package vn.edu.iuh.fit.backend.configs.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(OrderDetailPK.class)
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    private double quantity;
    private double price;
    @Column(length = 250, nullable = false)
    private String note;







}
@Embeddable
class OrderDetailPK
implements Serializable {
    private long order;
    private long product;

//    OrderDetailPK();

    public OrderDetailPK() {

    }

    public OrderDetailPK(long order, long product) {
        this.order = order;
        this.product = product;
    }
}

