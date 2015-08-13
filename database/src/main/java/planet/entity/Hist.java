package planet.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by oleksii on 13.08.15.
 */
public class Hist extends SuperEntity{
    private int userId;
    private int productId;
    private Timestamp viewDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Timestamp getViewDate() {
        return viewDate;
    }

    public void setViewDate(Timestamp viewDate) {
        this.viewDate = viewDate;
    }
    /*Date date = new Date();
    Timestamp ts = new Timestamp(date.getTime());*/
}