/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author roan sampang
 */
public class MsConnectAccess {
    public static Connection conn(){
        try{
            String url = "jdbc:ucanaccess://C://Users//roan sampang//Documents/roan_data.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
