package planet.entity;

/**
 * Created by oleksii on 14.08.15.
 */
public class Product extends SuperEntity{
    private int categoryId;
    private String name;
    private double price;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategory_id(int category_id) {
        this.categoryId = category_id;
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
