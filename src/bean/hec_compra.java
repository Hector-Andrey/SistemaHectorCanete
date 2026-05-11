/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author hecto
 */
public class Hec_compra {
    
  private int Hec_id_compra;
  private Date Hec_data;
  private double Hec_valor_total;
  private String Hec_status;
  private int Hec_id_fornecedor;

    public int getHec_id_compra() {
        return Hec_id_compra;
    }

    public void setHec_id_compra(int Hec_id_compra) {
        this.Hec_id_compra = Hec_id_compra;
    }

    public Date getHec_data() {
        return Hec_data;
    }

    public void setHec_data(Date Hec_data) {
        this.Hec_data = Hec_data;
    }

    public double getHec_valor_total() {
        return Hec_valor_total;
    }

    public void setHec_valor_total(double Hec_valor_total) {
        this.Hec_valor_total = Hec_valor_total;
    }

    public String getHec_status() {
        return Hec_status;
    }

    public void setHec_status(String Hec_status) {
        this.Hec_status = Hec_status;
    }

    public int getHec_id_fornecedor() {
        return Hec_id_fornecedor;
    }

    public void setHec_id_fornecedor(int Hec_id_fornecedor) {
        this.Hec_id_fornecedor = Hec_id_fornecedor;
    }

}
