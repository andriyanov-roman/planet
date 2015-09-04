package planet.entity;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by oleksii on 13.08.15.
 */
@Entity
@Table(name="orders")
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName="id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName="id", nullable = false)
    private Product product;
    @Column(name = "product_qty", nullable = false)
    private int productQty;
    @Column(nullable = false)
    private double amount;
    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate() {
        Date date = new Date();
        this.orderDate = new Timestamp(date.getTime());
    }
}