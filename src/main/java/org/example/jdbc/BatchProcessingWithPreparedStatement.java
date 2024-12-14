package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;

public class BatchProcessingWithPreparedStatement
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/core_batch_5_30";
        String username = "root";
        String password = "ashwin1234";

        Connection connection = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO student_primary values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"117");
            preparedStatement.setString(2,"amar");
            preparedStatement.setString(3,"mumbai");
            preparedStatement.setString(4,"9898001221");
            preparedStatement.addBatch();
            preparedStatement.setString(1,"118");
            preparedStatement.setString(2,"akbar");
            preparedStatement.setString(3,"mumbai");
            preparedStatement.setString(4,"9898003223");
            preparedStatement.addBatch();

            int[] updateCounts = preparedStatement.executeBatch();
            System.out.println(" updateCounts "+ Arrays.toString(updateCounts));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
