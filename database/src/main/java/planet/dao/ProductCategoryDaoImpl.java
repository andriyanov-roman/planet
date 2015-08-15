package planet.dao;

import planet.ConnectionFactory;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.ProductCategory;
import planet.entity.SuperEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by oleksii on 14.08.15.
 */
public class ProductCategoryDaoImpl extends SuperEntity implements CrudGeneralDao<String, ProductCategory> {
    @Override
    public void delete(ProductCategory productCategory) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "DELETE FROM product_category WHERE code = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, productCategory.getCode());

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
    public void update(ProductCategory productCategory) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "UPDATE product_category SET code = ? WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, productCategory.getCode());
                statement.setInt(2, productCategory.getId());

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
    public void insert(ProductCategory productCategory) {
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "INSERT INTO product_category(code) VALUES (?)";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, productCategory.getCode());
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
    public ProductCategory select(String key) {
        ProductCategory category = new ProductCategory();
        try (Connection connection = ConnectionFactory.getConnection();
        ) {
            try {
                String sqlGood = "SELECT * FROM product_category WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, key);

                ResultSet rs= statement.executeQuery();

                category.setCode(rs.getString("code"));
                category.setId(rs.getInt("id"));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }
}
