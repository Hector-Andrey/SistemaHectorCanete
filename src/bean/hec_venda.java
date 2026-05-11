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
public class Hec_venda {
    
  private int Hec_id_venda;
  private Date Hec_data;
  private double Hec_valor_total;
  private String Hec_status;
  private String Hec_pagamento;
  private int Hec_id_cliente;
  private int Hec_id_usuario;

    public int getHec_id_venda() {
        return Hec_id_venda;
    }

    public void setHec_id_venda(int Hec_id_venda) {
        this.Hec_id_venda = Hec_id_venda;
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

    public String getHec_pagamento() {
        return Hec_pagamento;
    }

    public void setHec_pagamento(String Hec_pagamento) {
        this.Hec_pagamento = Hec_pagamento;
    }

    public int getHec_id_cliente() {
        return Hec_id_cliente;
    }

    public void setHec_id_cliente(int Hec_id_cliente) {
        this.Hec_id_cliente = Hec_id_cliente;
    }

    public int getHec_id_usuario() {
        return Hec_id_usuario;
    }

    public void setHec_id_usuario(int Hec_id_usuario) {
        this.Hec_id_usuario = Hec_id_usuario;
    }

}
