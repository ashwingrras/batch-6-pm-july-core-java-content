package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.concurrent.Callable;

//import static org.example.jdbc.MysqlConnectionHandler.getDbConnection;
public class PreparedStatementExample
{
    public static void main(String[] args)
    {
        Connection connection = MysqlConnectionHandler.getDbConnection();
        if(null != connection)
        {
            try
            {
                String query = "insert into t1 (id, name, city) values (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1,"101");
                preparedStatement.setString(2,"sunny");
                preparedStatement.setString(3,"ajmer");
                int count = preparedStatement.executeUpdate();
                System.out.println(" count "+count);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
