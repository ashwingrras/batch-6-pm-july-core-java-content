package org.example.jdbc.examples;

import java.sql.*;

public class TransactionExample2 {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        Savepoint s1 = null;
        String url = DataBaseConstant.URL_Core_Batch_5_30;
        String user = DataBaseConstant.USER;
        String password = DataBaseConstant.PASSWORD;
        try
        {
            connection = DriverManager.getConnection(url, user, password);;
            statement = connection.createStatement();
            connection.setAutoCommit(false);

            String insertQuery = "insert into t1(name,city) values(\"vakul\",\"d4\")";
            statement.execute(insertQuery);

            //s1 = connection.setSavepoint("savepoint s1");
            insertQuery = "insert into t1(name,city) values(\"vakul\",\"e4\")";
            statement.execute(insertQuery);

            insertQuery = "insert into t1(name,city) values(\"vakul\",\"c4\")";
            statement.execute(insertQuery);
            // connection.rollback();
            connection.commit();
            //--------------------------------------------------------------
            String selectQuery = "select * from t1";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while(resultSet.next())
            {
                System.out.println(resultSet.getInt("id") +" " + resultSet.getString("name") + " " + resultSet.getString("city"));
            }
        }
        catch( SQLException e)
        {
            try
            {
                //connection.rollback(s1);
                //connection.rollback();
                //connection.commit();
            }
            catch(Exception ex)
            {
                System.out.println("for rollabck exception");
                ex.printStackTrace();
            }

            e.printStackTrace();
        }
    }
}
