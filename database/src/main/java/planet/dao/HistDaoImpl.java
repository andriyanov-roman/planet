package planet.dao;

import planet.ConnectionFactory;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.Hist;
import planet.entity.SuperEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by oleksii on 13.08.15.
 */
public class HistDaoImpl extends SuperEntity implements CrudGeneralDao<String, Hist> {
    @Override
    public void delete(Hist hist) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "DELETE FROM hist WHERE user_id = ? and product_id = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setInt(1, hist.getUserId());
                statement.setInt(2, hist.getProductId());

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
    public void update(Hist hist) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "UPDATE hist SET product_id = ? WHERE user_id = ? AND view_date = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setInt(1, hist.getProductId());
                statement.setInt(2, hist.getUserId());
                statement.setTimestamp(3, hist.getViewDate());

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
    public void insert(Hist hist) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "INSERT INTO hist(user_id, product_id, view_date) VALUES (?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                Date date = new Date();
                Timestamp ts = new Timestamp(date.getTime());
                hist.setViewDate(ts);

                statement.setInt(1, hist.getUserId());
                statement.setInt(2, hist.getProductId());
                statement.setTimestamp(3, hist.getViewDate());

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
    public Hist select(String key) {
        return null;
    }

    public List<Hist> select(int userId){
        List <Hist> hist = new ArrayList<Hist>();
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                String sqlGood = "SELECT * FROM hist WHERE user_id = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setInt(1, userId);

                ResultSet rs= statement.executeQuery();

                while(rs.next())
                {
                    Hist h = new Hist();
                    h.setId(rs.getInt("id"));
                    h.setUserId(rs.getInt("user_id"));
                    h.setProductId(rs.getInt("product_id"));
                    h.setViewDate(rs.getTimestamp("view_date"));

                    hist.add(h);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hist;
    }
}
