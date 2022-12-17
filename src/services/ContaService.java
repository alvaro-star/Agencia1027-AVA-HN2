/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.ConexaoBanco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.ContaModel;

/**
 *
 * @author alvaro
 */
public class ContaService {

    public ArrayList<ContaModel> getAll() throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        String sql = "SELECT * FROM `conta`";
        ResultSet resultado = statement.executeQuery(sql);

        ArrayList<ContaModel> contas = new ArrayList<>();

        while (resultado.next()) {
            ContaModel modelo = new ContaModel();
            modelo.setNumeroConta(resultado.getString("numeroConta"));
            modelo.setBairro(resultado.getString("bairro"));
            modelo.setCep(resultado.getString("cep"));
            modelo.setCidade(resultado.getString("cidade"));
            modelo.setEstado(resultado.getString("estado"));
            modelo.setNomeCliente(resultado.getString("nomeCliente"));
            modelo.setNumeroCasa(resultado.getString("numeroCasa"));
            modelo.setRua(resultado.getString("rua"));

            contas.add(modelo);
        }
        return contas;
    }

    public void insert(ContaModel dto) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        statement.execute(dto.makeSqlInsert());
    }

    public ContaModel getOne(String numeroConta) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        String sql = String.format("SELECT * FROM `conta` WHERE `numeroConta` = '%s'", numeroConta);
        ResultSet resultado = statement.executeQuery(sql);

        ContaModel modelo = new ContaModel();
        while (resultado.next()) {
            modelo.setNumeroConta(resultado.getString("numeroConta"));
            modelo.setBairro(resultado.getString("bairro"));
            modelo.setCep(resultado.getString("cep"));
            modelo.setCidade(resultado.getString("cidade"));
            modelo.setEstado(resultado.getString("estado"));
            modelo.setNomeCliente(resultado.getString("nomeCliente"));
            modelo.setNumeroCasa(resultado.getString("numeroCasa"));
            modelo.setRua(resultado.getString("rua"));
        }

        return modelo;
    }

    public void update(String numeroConta, ContaModel contaNova) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        statement.execute(contaNova.makeSqlUpdate(numeroConta));
    }

    public void deletar(String numeroConta) throws SQLException {
        Statement statement = ConexaoBanco.abreConexao().createStatement();
        String sql = String.format("DELETE FROM conta WHERE `conta`.`numeroConta` = '%s'", numeroConta);
        statement.execute(sql);
    }
}
