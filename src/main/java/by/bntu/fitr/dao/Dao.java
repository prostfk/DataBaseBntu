package by.bntu.fitr.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public abstract class Dao<Entity> {

    private Connection connection;

    Dao() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/db.properties"));
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void execute(String sql){
        try {
            connection.createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ResultSet executeWithResult(String sql){
        try {
            return connection.createStatement().executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract void save(Entity entity);

    public abstract List<Entity> findAll();

}
