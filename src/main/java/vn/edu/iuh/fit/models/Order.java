package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private String order_id;
    private LocalDateTime order_date;
    @ManyToOne
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "cus_id", referencedColumnName = "cus_id")
    private Customer customer;
    @OneToMany(mappedBy = "order_detail")
    private List<OrderDetail> orderDetailList;

    public Order() {
        super();
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", order_date=" + order_date +
                ", emp_id='" + employee + '\'' +
                ", cus_id='" + customer + '\'' +
                '}';
    }

    public Order(String order_id, LocalDateTime order_date, Employee emp_id, Customer cus_id) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.employee = emp_id;
        this.customer = cus_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public LocalDateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }

    public Employee getEmp_id() {
        return employee;
    }

    public void setEmp_id(Employee emp_id) {
        this.employee = emp_id;
    }

    public Customer getCus_id() {
        return customer;
    }

    public void setCus_id(Customer cus_id) {
        this.customer = cus_id;
    }
}
