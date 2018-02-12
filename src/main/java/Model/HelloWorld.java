/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nuswee43
 */
public class HelloWorld {

    private int dataID;
    private String data;
    HelloWorld hello = null;

    public String getData() throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuilder.getConnection();
        java.sql.PreparedStatement pstm = con.prepareStatement("select data from hellodb where dataID = 3");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            hello = new HelloWorld();
            hello.data = rs.getString("data");

        }
        pstm.close();
        con.close();

        return hello.data;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        HelloWorld h = new HelloWorld();
        String data = h.getData();

        System.out.println(data);
    }
}
