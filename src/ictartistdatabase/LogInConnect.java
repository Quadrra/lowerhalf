/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ictartistdatabase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renren
 */
public class LogInConnect 
{
    public static Connection connectdb()
    {
        Connection con=null;
        try 
        {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/artistdb", "ARTISTDATABASE", "password");
            return con;
        } catch (SQLException ex) 
        {
            Logger.getLogger(LogInConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}