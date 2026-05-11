/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Hec_produto;
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
public abstract class DaoHecProduto extends DaoHecAbstract {

    /**
     *
     * @param object
     */
    @Override
    public void insert(Object object) {
        Hec_produto hec_produto = (Hec_produto) object;
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
            pst.setInt(1, hec_produto.getHec_id_produto());
            pst.setString(2, hec_produto.getHec_nome());
            pst.setString(3, hec_produto.getHec_descricao());
            pst.setDouble(4, hec_produto.getHec_preco());
            pst.setInt(5, hec_produto.getHec_id_categoria());
            pst.setString(6, hec_produto.getHec_tipo());
            pst.setString(7, hec_produto.getHec_status());
            pst.setInt(8, hec_produto.getHec_estoque());
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