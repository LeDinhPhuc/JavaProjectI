/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoesmanagementcompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pham Ngoc Minh
 */
public class ConnectionDB {
    public Connection getConnect() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/quanlybangiay?autoReconnect=true&useSSL=false";
        String user = "root";
        String passwd = "1234"; //Lưu ý mật khẩu ở đây nha Mạnh ???
        try {
            connection = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
            // TODO: handle exception
        }
        return connection;
    }
}
