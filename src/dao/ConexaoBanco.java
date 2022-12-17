package dao;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/agencia1027?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String user = "root";
    private static final String senha = "";

    public static Connection abreConexao() {
        Connection con = null;

        try {
            //Class.forName(driverClass);
            con = DriverManager.getConnection(url, user, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (HeadlessException | SQLException erro) {
            System.out.println("###################Erro ao conectar com o banco de dados##################");
            //JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados: " + erro);
        }

        return con;
    }

}
