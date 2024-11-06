package patterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String[] args) throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();

        //DbSingleton test = new DbSingleton();// this wont work because the constructor is private
        System.out.println(instance);

//        DbSingleton anotherInstance = DbSingleton.getInstance();
//
//        System.out.println(anotherInstance);

        Connection connection = instance.getConnection();

        Statement statement = connection.createStatement();

        statement.execute("Create table students (ID int primary key, name varchar(65))");


        System.out.println("Created our table of students.");

        int rows = statement.executeUpdate("Insert into students (ID, name) values (1, 'Ethan')");

        if (rows > 0){
            System.out.println("Inserted a new row.");
        }
            connection.close();
    }
}
