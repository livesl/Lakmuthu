package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author donx
 */
public class db {

    private static Connection con;

    public static Connection getconn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lakmuthu?useUnicode=true&characterEncoding=UTF-8", "root", "123");
//           con = DriverManager.getConnection("jdbc:mysql://192.168.1.2 :3306/exam_section_system_two?useUnicode=true&characterEncoding=UTF-8", "root","123");
//              con = DriverManager.getConnection("jdbc:mysql://mysql16.000webhost.com/a3584661_pay?useUnicode=true&characterEncoding=UTF-8", "a3584661_root","");
//            con = DriverManager.getConnection("jdbc:mysql://192.168.1.50:3306/pos", "root", "123");
//
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void change(String s) throws SQLException {
       // System.out.println(s);
        if (con == null) {
            getconn();

            System.out.println(s);
        }
        con.createStatement().executeUpdate(s);

    }

    public static ResultSet fetch(String s) throws SQLException {
        if (con == null) {
            getconn();

        }

        return con.createStatement().executeQuery(s);

    }
}
