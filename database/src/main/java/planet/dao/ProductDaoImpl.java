package planet.dao;

import planet.ConnectionFactory;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.Product;
import planet.entity.SuperEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImpl extends SuperEntity implements CrudGeneralDao<String, Product> {

    @Override
    public void delete(Product product) {
        try (Connection connection = ConnectionFactory.getConnection()
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "DELETE FROM product WHERE name = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, product.getName());

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
    public void update(Product product) {
        try (Connection connection = ConnectionFactory.getConnection()
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "UPDATE product SET price = ? WHERE name = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setDouble(1, product.getPrice());
                statement.setString(2, product.getName());

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
    public void insert(Product product) {
        try (Connection connection = ConnectionFactory.getConnection()
        ) {
            try {
                connection.setAutoCommit(false);

                String sqlGood = "INSERT INTO product(category_id, name, price) VALUES (?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setInt(1, product.getCategoryId());
                statement.setString(2, product.getName());
                statement.setDouble(2, product.getPrice());
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
    public Product select(String key) {
        Product product = new Product();
        try (Connection connection = ConnectionFactory.getConnection()
        ) {
            try {
                String sqlGood = "SELECT * FROM product WHERE name = ?";
                PreparedStatement statement = connection.prepareStatement(sqlGood);

                statement.setString(1, key);

                ResultSet rs = statement.executeQuery();

                product.setCategory_id(rs.getInt("category_id"));
                product.setPrice(rs.getDouble("price"));
                product.setId(rs.getInt("id"));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public Product select(int productId) {
        Product product = new Product();
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sqlGood = "SELECT * FROM product WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sqlGood);

            statement.setInt(1, productId);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                product.setCategory_id((int) rs.getLong("category_id"));
                product.setPrice(rs.getDouble("price"));
                product.setName(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
