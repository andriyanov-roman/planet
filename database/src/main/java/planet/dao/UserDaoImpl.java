package planet.dao;

import planet.ConnectionFactory;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.User;
import planet.entity.SuperEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by oleksii on 09.08.2015.
 */
public class UserDaoImpl extends SuperEntity implements CrudGeneralDao<String, User> {
    @Override
    public void delete(User user) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "DELETE FROM user WHERE login = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, user.getLogin());

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
    public void update(User user) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "UPDATE user SET password = ? WHERE login = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, user.getPassword());
                statement.setString(2,user.getLogin());

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
    public void insert(User user) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "INSERT INTO user(login, password, role_id) VALUES (?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, user.getLogin());
                statement.setString(2, user.getPassword());
                statement.setInt(3, user.getRoleId());
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
    public User select(String login) {
        User user = new User();

        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                String sqlGood = "SELECT * FROM user WHERE login = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, login);

                ResultSet rs= statement.executeQuery();

                user.setLogin(rs.getString("user"));
                user.setPassword(rs.getString("password"));
                user.setId(rs.getInt("id"));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
