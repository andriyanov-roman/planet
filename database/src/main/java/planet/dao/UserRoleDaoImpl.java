package planet.dao;
import planet.ConnectionFactory;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.UserRole;
import planet.entity.SuperEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by okova on 8/15/2015.
 */
public class UserRoleDaoImpl extends SuperEntity implements CrudGeneralDao<String, UserRole> {
    @Override
    public void delete(UserRole userRole) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "DELETE FROM user_role WHERE code = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, userRole.getCode());

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
    public void update(UserRole userRole) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "UPDATE user_role SET name = ? WHERE code = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1,userRole.getName());
                statement.setString(2, userRole.getCode());

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
    public void insert(UserRole userRole) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "INSERT INTO user_role(code, name) VALUES (?,?)";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, userRole.getCode());
                statement.setString(2, userRole.getName());
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
    public UserRole select(String code) {
        UserRole userRole = new UserRole();
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                String sqlGood = "SELECT * FROM user_role WHERE code = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, code);

                ResultSet rs= statement.executeQuery();

                userRole.setCode(rs.getString("code"));
                userRole.setName(rs.getString("name"));
                userRole.setId(rs.getInt("id"));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userRole;
    }

}
