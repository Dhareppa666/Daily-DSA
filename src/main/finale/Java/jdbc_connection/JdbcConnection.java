package main.finale.Java.jdbc_connection;

import main.finale.aa.Java.jdbc_connection.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnection {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/prl","root","root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from test");
            while (rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            conn.close();


            String selectSql = "SELECT * FROM employees";
            try (ResultSet resultSet = stmt.executeQuery(selectSql)) {
                List<Employee> employees = new ArrayList<>();
                while (resultSet.next()) {
                    Employee emp = new Employee();
                    emp.setId(resultSet.getInt("emp_id"));
                    emp.setName(resultSet.getString("name"));
                    emp.setPosition(resultSet.getString("position"));
                    emp.setSalary(resultSet.getDouble("salary"));
                    employees.add(emp);
                }
            }
//            handleTransactions(conn);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    //This may be necessary in cases when we want to preserve data consistency, for example when we only want to commit a transaction
    // if a previous one has completed successfully.
    //First, we need to set the autoCommit property of Connection to false, then use the commit() and rollback() methods to control the transaction.
    //Let's add a second update statement for the salary column after the employee position column update and wrap them both in a transaction.
    // This way, the salary will be updated only if the position was successfully updated:
//    private static void handleTransactions(Connection conn) {
//        String updatePositionSql = "UPDATE employees SET position=? WHERE emp_id=?";
//        PreparedStatement pstmt = conn.prepareStatement(updatePositionSql);
//        pstmt.setString(1, "lead developer");
//        pstmt.setInt(2, 1);
//
//        String updateSalarySql = "UPDATE employees SET salary=? WHERE emp_id=?";
//        PreparedStatement pstmt2 = conn.prepareStatement(updateSalarySql);
//        pstmt.setDouble(1, 3000);
//        pstmt.setInt(2, 1);
//
//        boolean autoCommit = conn.getAutoCommit();
//        try {
//            conn.setAutoCommit(false);
//            pstmt.executeUpdate();
//            pstmt2.executeUpdate();
//            conn.commit();
//        } catch (SQLException exc) {
//            conn.rollback();
//        } finally {
//            conn.setAutoCommit(autoCommit);
//        }
//    }

}
