package planet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static ConnectionFactory instance;
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://planet.cdh4bmh2efrx.us-west-2.rds.amazonaws.com:3306/planet";
    private static String USER = "planet";
    private static String PASS = "Planet@999";

    public void registerDriver() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection createConnection(){
        registerDriver();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    public static Connection getConnection(){

        return getInstance().createConnection();
    }

    private ConnectionFactory(){}

    public static ConnectionFactory getInstance(){
        if (instance == null){
            return new ConnectionFactory();
        }
        return instance;
    }
}
