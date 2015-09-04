package planet.entity;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by oleksii on 13.08.15.
 */
@Entity
@Table(name="hist")
public class Hist{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName="id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName="id", nullable = false)
    private Product product;
    @Column(nullable = false)
    private Timestamp viewDate;

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

    public Timestamp getViewDate() {
        return viewDate;
    }

    public void setViewDate(Timestamp viewDate) {
        Date date = new Date();
        this.viewDate = new Timestamp(date.getTime());
    }
}