package patterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private Connection conn;

   // private static DbSingleton instance = new DbSingleton();

    private static class LazyHolder{//lazy loaded singleton
        static final DbSingleton INSTANCE = new DbSingleton();
    }
    /*
    creating the LazyHolder class makes this singleton thread safe
    and lazy loaded
     */
    private DbSingleton(){
        conn = null;
        try {
            String x = "jdbc:h2:mem:test";
            conn = DriverManager.getConnection(x);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection(){
        return conn;
    }
}
