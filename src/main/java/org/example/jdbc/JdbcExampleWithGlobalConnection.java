package org.example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.example.jdbc.MysqlConnectionHandler.getDbConnection;

public class JdbcExampleWithGlobalConnection
{
    public static void main(String[] args)
    {
        try
        {
            Connection connection = getDbConnection();
            if(null != connection)
            {

                Statement statement = connection.createStatement();
                //
                String selectQuery = "select * from student_primary"; // mysql,  postgres, oracle
                ResultSet resultSet = statement.executeQuery(selectQuery);
                //
                while(resultSet.next())
                {
                    String name = resultSet.getString("name");
                    //System.out.println("name = "+name);
                    System.out.println(resultSet.getInt(1) +", "+resultSet.getString(2)+", "+resultSet.getString(3));
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
