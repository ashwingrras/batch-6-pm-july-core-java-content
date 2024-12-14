package org.example.jdbc;

import org.example.jdbc.examples.DbHelper;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementExample
{
    //static String procedureQuery = "{call GetStudentByCity(?)}";
    static String procedureQuery = "{call AddNewStudent(?,?,?,?)}";
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String database = "core_batch_5_30";
            String jdbcUrl = "jdbc:mysql://localhost:3306/"+database;
            Connection connection= DriverManager.getConnection(jdbcUrl,"root","ashwin1234");
            if(connection != null)
            {
                CallableStatement callableStatement = connection.prepareCall(procedureQuery);
                callableStatement.setString(1,"111");
                callableStatement.setString(2,"kapil");
                callableStatement.setString(3,"gurugram");
                callableStatement.setString(4,"9808090976");
                boolean result = callableStatement.execute();
                System.out.println("result "+result);
                if(result)
                {
                    ResultSet resultSet = callableStatement.getResultSet();
                    while(resultSet.next())
                    {
                        System.out.println(resultSet.getString("name") +", "+resultSet.getString("address"));
                    }
                }
                else
                {
                    int count = callableStatement.getUpdateCount();
                    System.out.println(" count "+count);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
