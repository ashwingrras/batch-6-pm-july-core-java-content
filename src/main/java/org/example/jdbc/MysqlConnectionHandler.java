package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectionHandler
{
    public static Connection getDbConnection()  {
        Connection connection = null;
        try
        {
            ///////// START ///////////
            //Deprecated, if we import latest version of mysql connected
            //Class.forName("com.mysql.jdbc.Driver");
            // with latest mysql connector
            Class.forName("com.mysql.cj.jdbc.Driver"); // dialect

            // it is compulsory with older version of mysql connector
            //String jdbcUrl = "jdbc:mysql://localhost:3306/grras?useUnicode=true&characterEncoding=UTF-8";
            String database = "core_batch_5_30";
            String databaseVakul = "learnjoins";
            String jdbcUrl = "jdbc:mysql://localhost:3306/"+database;

            connection= DriverManager.getConnection(jdbcUrl,"root","ashwin1234");
            ///////// END ///////////
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}
