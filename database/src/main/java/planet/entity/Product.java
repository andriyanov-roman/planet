package planet.entity;

import javax.persistence.*;

/**
 * Created by oleksii on 14.08.15.
 */
@Entity
@Table(name="product", uniqueConstraints = @UniqueConstraint(columnNames = {"category_id", "name"}))
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName="id", nullable = false)
    private ProductCategory category;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
