/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 07884569116
 */
public class ContaModel {

    //Chave estrangeira
    private String numeroConta = "";
    private String nomeCliente = "";
    private String rua = "";
    private String bairro = "";
    private String cidade = "";
    private String estado = "";
    private String numeroCasa = "";
    private String cep = "";

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String makeSqlInsert() {
        String values = String.format("VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", this.numeroConta, this.nomeCliente, this.rua, this.bairro, this.cidade, this.estado, this.numeroCasa, this.cep);
        String sql = "INSERT INTO `conta` (`numeroConta`, `nomeCliente`, `rua`, `bairro`, `cidade`, `estado`, `numeroCasa`, `cep`) " + values;
        return sql;
    }

    public String makeSqlUpdate(String numeroConta) {
        String sql = String.format("UPDATE `conta` SET `nomeCliente` = '%s', `rua` = '%s', `bairro` = '%s', `cidade` = '%s', `estado` = '%s', `numeroCasa` = '%s', `cep` = '%s' WHERE `conta`.`numeroConta` = '%s';", this.nomeCliente, this.rua, this.bairro, this.cidade, this.estado, this.numeroCasa, this.cep, numeroConta);
        return sql;
    }

    public String makeSqlDelete() {
        String sql = String.format("DELETE FROM conta WHERE `conta`.`numeroConta` = %s", this.numeroConta);
        return sql;
    }

    public void imprimir() {
        System.out.println(numeroConta);
        System.out.println(nomeCliente);
        System.out.println(rua);
        System.out.println(bairro);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(numeroCasa);
        System.out.println(cep);
    }

}
