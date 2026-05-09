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
public class hec_categoria {

    private int hec_id;
    private String hec_nome;
    private String hec_tipo;
    private String hec_status;
    private String hec_descricao;
    private Date hec_data_cadastro;
    private int hec_usuario_criacao;

    public int getHec_id() {
        return hec_id;
    }

    public void setHec_id(int hec_id) {
        this.hec_id = hec_id;
    }

    public String getHec_nome() {
        return hec_nome;
    }

    public void setHec_nome(String hec_nome) {
        this.hec_nome = hec_nome;
    }

    public String getHec_tipo() {
        return hec_tipo;
    }

    public void setHec_tipo(String hec_tipo) {
        this.hec_tipo = hec_tipo;
    }

    public String getHec_status() {
        return hec_status;
    }

    public void setHec_status(String hec_status) {
        this.hec_status = hec_status;
    }

    public String getHec_descricao() {
        return hec_descricao;
    }

    public void setHec_descricao(String hec_descricao) {
        this.hec_descricao = hec_descricao;
    }

    public String getHec_data_cadastro() {
        return hec_data_cadastro;
    }

    public void setHec_data_cadastro(String hec_data_cadastro) {
        this.hec_data_cadastro = hec_data_cadastro;
    }

    public int getHec_usuario_criacao() {
        return hec_usuario_criacao;
    }

    public void setHec_usuario_criacao(int hec_usuario_criacao) {
        this.hec_usuario_criacao = hec_usuario_criacao;
    }
}
