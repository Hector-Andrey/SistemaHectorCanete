/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Hec_usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcCrud;

/**
 *
 * @author u1845853
 */
public abstract class DaoHecUsuarios extends DaoHecAbstract {

    /**
     *
     * @param object
     */
    @Override
    public void insert(Object object) {
        Hec_usuarios hec_usuarios = (Hec_usuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_hector_canete";
            user = "hector_canete";
            password = "hector_canete";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into Hec_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, hec_usuarios.getHec_idusuarios());
            pst.setString(2, hec_usuarios.getHec_nome());
            pst.setString(3, hec_usuarios.getHec_apelido());
            pst.setString(4, hec_usuarios.getHec_cpf());
            pst.setString(5, null); //Hec_data_nascimento
            pst.setString(6, hec_usuarios.getHec_senha());
            pst.setInt(7, hec_usuarios.getHec_nivel());
            pst.setString(8, hec_usuarios.getHec_ativo());
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static class JdbcCrud {

        public JdbcCrud() {
        }
    }
}