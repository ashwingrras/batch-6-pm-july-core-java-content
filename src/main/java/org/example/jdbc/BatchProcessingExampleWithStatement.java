package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class BatchProcessingExampleWithStatement
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
            connection.setAutoCommit(false);
            Statement stmt = connection.createStatement();
            stmt.addBatch("INSERT INTO student_primary values (133, \"ram111\", \"jaipur\",\"7398580991\")");
            stmt.addBatch("INSERT INTO student_primary values (134, \"ram221\", \"jaipur\",\"8489610927\")");


            int[] updateCounts1 = stmt.executeBatch();
            System.out.println(" updateCounts1 "+ Arrays.toString(updateCounts1));
            connection.commit();
            connection.rollback();

            /////
            /*
            stmt.addBatch("INSERT INTO student_primary values (132, \"shyam11\", \"jaipur\",\"7780013927\")");
            int[] updateCounts2 = stmt.executeBatch();
            connection.commit();
            System.out.println(" updateCounts2 "+ Arrays.toString(updateCounts2));
            */
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            e.printStackTrace();
        }
    }
}
