package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.example.jdbc.MysqlConnectionHandler.getDbConnection;

public class JdbcInsertQueryExample
{
    public static void main(String[] args)
    {
        try
        {
            Connection connection = getDbConnection();
            if(null != connection)
            {


                //
                //System.out.println(" \"  vakul\"");
                //insert into student_primary (name, address, mobile_no) values ("vikash", "jaipur","9797979797");
                String insertQuery = "insert into student_primary (name, address, mobile_no) values (\"rajat goyal\", \"sriganganagar\",\"9892008876\");";
                // using for select query
                //ResultSet resultSet = statement.executeQuery(selectQuery);
                // using for insert, update and delete query
                //int insertCount = statement.executeUpdate(insertQuery);
                //System.out.println(" insertCount "+insertCount);
                // using for all sql query
                String id = "1 or 1 = 1";
                //String selectQuery = "select * from student_primary where id = "+id;
                String selectQuery = "select * from student_primary where name = ?";

                // with Statement
                //Statement statement = connection.createStatement();
                //boolean queryResult = statement.execute(selectQuery);
                // with PreparedStatement
                PreparedStatement preparedStatementSelect = connection.prepareStatement(selectQuery);
                preparedStatementSelect.setString(1,"vikash");
                boolean queryResult = preparedStatementSelect.execute();

                System.out.println(" queryResult "+queryResult);
                if(queryResult)
                {
                    ResultSet resultSet = preparedStatementSelect.getResultSet();
                    while(resultSet.next())
                    {
                        System.out.println(resultSet.getInt(1) +", "+resultSet.getString(2)+", "+resultSet.getString(3));
                    }
                }
                else
                {
                    int count = preparedStatementSelect.getUpdateCount();
                    System.out.println("count "+count);
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
