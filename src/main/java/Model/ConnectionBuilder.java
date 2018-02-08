/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patiz
 */
public class ConnectionBuilder {

    public static Connection getConnection() throws SQLException {
        Connection con = null;

        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/pusher?zeroDateTimeBehavior=convertToNull";
        String dbClass = "com.mysql.jdbc.Driver";

        try {
            Class.forName(dbClass);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionBuilder.getConnection();

        System.out.println(con);
    }
}
