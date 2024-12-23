package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*

        1. class.forName
        2. Connection
        3. Statement ( for execute query)
        4. executeQuery()
        5. executeUpdate()
        6. execute()
        7. ResultSet
           SQL INJECTION
        8. PreparedStatement
        9. CallableStatement
        10. Transaction
        11. BatchProcessing
        12. RowSet
        13. Result Set
            1. with Scrollable: sensitive, insensitive, forward only
            2. readonly
            3. updatable




 */

public class JdbcExample1
{
    public static void main(String[] args)
    {
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
            String jdbcUrl = "jdbc:mysql://localhost:3306/"+database;

            Connection connection= DriverManager.getConnection(jdbcUrl,"root","ashwin1234");
            ///////// END ///////////
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
