/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import models.ContaModel;
import services.ContaService;

public class ContaControle {

    private static final ContaService servico = new ContaService();

    public static ArrayList<ContaModel> getAll() throws SQLException {
        return servico.getAll();
    }

    public static void insert(ContaModel dto) throws SQLException {
        servico.insert(dto);
    }

    public static ContaModel getOne(String numeroConta) throws SQLException {
        return servico.getOne(numeroConta);
    }

    public static void update(String numeroConta, ContaModel atualizacao) throws SQLException {
        servico.update(numeroConta, atualizacao);
    }

    public static void deletar(String numeroConta) throws SQLException {
        servico.deletar(numeroConta);
    }

}
