package org.example.jdbc;

import java.sql.*;

import static org.example.jdbc.MysqlConnectionHandler.getDbConnection;

public class ScrollableResultSetExampleAllType
{
    private static final String URL = "jdbc:mysql://localhost:3306/core_batch_5_30";
    private static final String USER = "root";
    private static final String PASSWORD = "ashwin1234";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");;
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            //statement
            //statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

            // 100, 1, last and mid
            resultSet = statement.executeQuery("SELECT * FROM student_primary");


            // Move to the last row
            if (resultSet.last())
            {
                System.out.println("Last row: ");
                printCurrentRow(resultSet);
            }

            String insertQuery = "insert into student_primary (name, address, mobile_no) values (\"scrollTest105\", \"sriganganagar\",\"5232008876\");";

            // with Statement
            Statement statement2 = connection.createStatement();
            boolean queryResult = statement2.execute(insertQuery);
            System.out.println("queryResult "+queryResult);

            Thread.sleep(2000);

            // Move to the last row
            if (resultSet.last())
            {
                System.out.println("Last row Again : ");
                printCurrentRow(resultSet);
            }

            // Move to the first row
            if (resultSet.first())
            {
                System.out.println("First row: ");
                printCurrentRow(resultSet);
            }

            // Move to the second row
            if (resultSet.absolute(7))
            {
                System.out.println("Second row: ");
                printCurrentRow(resultSet);
            }

            // Move to the previous row
            if (resultSet.relative(+2))
            {
                System.out.println("Previous row from current position: ");
                printCurrentRow(resultSet);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //TODO here we printing current row of cursor
    private static void printCurrentRow(ResultSet resultSet) throws SQLException
    {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String address = resultSet.getString("address");
        String mobileNo = resultSet.getString("mobile_no");

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println();
    }
}
