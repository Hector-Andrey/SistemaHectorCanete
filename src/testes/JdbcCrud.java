/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author u1845853
 */
public class JdbcCrud {

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

            //Statement stm = cnt.createStatement();
            //stm.executeUpdate("insert into "
            //        + "mpv_usuarios(mpv_idusuarios,mpv_nome, mpv_apelido, mpv_cpf) "
            //        + "values(599, 'marcos', 'mpv', '415647')");
            
//            PreparedStatement pst = cnt.prepareStatement("insert into "
//                    + "mpv_usuarios(mpv_idusuarios,mpv_nome, mpv_apelido, mpv_cpf) "
//                    + "values(?,?,?,?)");
//            pst.setInt(1, 599);
//            pst.setString(2, "marcos teste");
//            pst.setString(3, "mpv teste");
//            pst.setString(4, "6534516534");
//            pst.executeUpdate();

//            PreparedStatement pst = cnt.prepareStatement(
//                    "update mpv_usuarios set mpv_nome=?, mpv_apelido=? "
//                            + "where mpv_idusuarios = ?");
//            pst.setInt(3, 599);
//            pst.setString(1, "marcos pinheiro ");
//            pst.setString(2, "mpv 123");
            PreparedStatement pst = cnt.prepareStatement(
                    "delete from mpv_usuarios where mpv_idusuarios = ?");
            pst.setInt(1, 599);
            pst.executeUpdate();
                    
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Executou");
    }
}
