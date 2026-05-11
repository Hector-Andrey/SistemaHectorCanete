/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u1845853
 */
public class JdbcSelect {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user = "marcos_vilhanueva";
            password = "marcos_vilhanueva";
            //url = "jdbc:mysql://localhost/db_marcos_vilhanueva";
            //user = "marcos_vilhanueva";
            //password = "marcos_vilhanueva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

            PreparedStatement pst = cnt.prepareStatement(
                    "select * from mpv_usuarios");
            ResultSet rs = pst.executeQuery();
            while (rs.next() == true) {
                System.out.println("nome:" + rs.getString("mpv_nome"));
                System.out.println("cpf:" + rs.getString("mpv_cpf"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Executou");
        }
    }
