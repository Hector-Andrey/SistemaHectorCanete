/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Hec_compra;
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
public abstract class DaoHecCompra extends DaoHecAbstract {

    /**
     *
     * @param object
     */
    @Override
    public void insert(Object object) {
        Hec_compra hec_compra = (Hec_compra) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_hector_canete";
            user = "hector_canete";
            password = "hector_canete";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into Hec_usuarios values (?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, hec_compra.getHec_id_compra());
            pst.setString(2, null); //Hec_data
            pst.setDouble(3, hec_compra.getHec_valor_total());
            pst.setString(4, hec_compra.getHec_status());
            pst.setInt(5, hec_compra.getHec_id_fornecedor());
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