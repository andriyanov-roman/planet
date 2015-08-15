package planet.dao;

import planet.ConnectionFactory;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.Order;
import planet.entity.SuperEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by oleksii on 13.08.15.
 */
public class OrderDaoImpl extends SuperEntity implements CrudGeneralDao<String, Order> {
    @Override
    public void delete(Order order) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "DELETE FROM order WHERE user_id = ? and product_id = ? and order_date = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setInt(1, order.getUserId());
                statement.setInt(2, order.getProductId());
                statement.setTimestamp(3, order.getOrderDate());

                statement.addBatch();

                statement.executeBatch();

                connection.commit();

            } catch (SQLException e) {
                connection.rollback();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Order order) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "UPDATE order SET product_id = ? AND product_qty = ? WHERE user_id = ? AND order_date = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setInt(1, order.getProductId());
                statement.setInt(2, order.getProductQty());
                statement.setInt(3, order.getUserId());
                statement.setTimestamp(4, order.getOrderDate());

                statement.addBatch();

                statement.executeBatch();

                connection.commit();

            } catch (SQLException e) {
                connection.rollback();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Order order) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "INSERT INTO order(user_id, product_id, product_qty, amount, order_date) VALUES (?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                Date date = new Date();
                Timestamp ts = new Timestamp(date.getTime());
                order.setOrderDate(ts);

                statement.setInt(1, order.getUserId());
                statement.setInt(2, order.getProductId());
                statement.setInt(3, order.getProductQty());
                statement.setDouble(4, order.getAmount());
                statement.setTimestamp(5, order.getOrderDate());

                statement.addBatch();

                statement.executeBatch();

                connection.commit();

            } catch (SQLException e) {
                connection.rollback();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Order select(String key) {
        return null;
    }

    public List<Order> select(int userId){
        List <Order> order = new ArrayList<Order>();
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                String sqlGood = "SELECT * FROM order WHERE user_id = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setInt(1, userId);

                ResultSet rs= statement.executeQuery();

                while(rs.next())
                {
                    Order o = new Order();
                    o.setId(rs.getInt("id"));
                    o.setUserId(rs.getInt("user_id"));
                    o.setProductId(rs.getInt("product_id"));
                    o.setProductQty(rs.getInt("product_qty"));
                    o.setOrderDate(rs.getTimestamp("order_date"));

                    order.add(o);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }
}