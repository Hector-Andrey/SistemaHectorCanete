/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Hec_fornecedor;
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
public abstract class DaoHecFornecedor extends DaoHecAbstract {

    /**
     *
     * @param object
     */
    @Override
    public void insert(Object object) {
        Hec_fornecedor hec_fornecedor = (Hec_fornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_hector_canete";
            user = "hector_canete";
            password = "hector_canete";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into Hec_usuarios values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, hec_fornecedor.getHec_id_fornecedor());
            pst.setString(2, hec_fornecedor.getHec_nome_empresa());
            pst.setString(3, hec_fornecedor.getHec_nome_representante());
            pst.setString(4, hec_fornecedor.getHec_sobrenome_representante());
            pst.setString(5, hec_fornecedor.getHec_email());
            pst.setString(6, hec_fornecedor.getHec_telefone());
            pst.setString(7, hec_fornecedor.getHec_endereco());
            pst.setString(8, hec_fornecedor.getHec_cidade());
            pst.setString(9, hec_fornecedor.getHec_estado());
            pst.setString(10, hec_fornecedor.getHec_cep());
            pst.setString(11, hec_fornecedor.getHec_pais());
            pst.setString(12, hec_fornecedor.getHec_complemento());
            pst.setString(13, hec_fornecedor.getHec_numero());
            pst.setString(14, hec_fornecedor.getHec_cnpj());
            pst.setString(15, hec_fornecedor.getHec_status());
            pst.setString(16, null); //Hec_data_cadastro
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