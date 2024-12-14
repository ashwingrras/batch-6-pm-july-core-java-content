package org.example.jdbc;

import java.sql.*;

public class CallableStatementWithInOut
{
    static String procedureQuery = "{call GetStudentCountByCity(?,?)}";
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
                callableStatement.setString(1,"jaipur");
                callableStatement.registerOutParameter(2, Types.INTEGER);
                boolean result = callableStatement.execute();
                System.out.println("result "+result);
                int count = callableStatement.getInt(2);
                System.out.println(" count "+count);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
