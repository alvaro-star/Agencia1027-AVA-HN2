/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteEstrutural;

import controller.ContaControle;
import java.sql.*;
import java.util.Scanner;
import models.ContaModel;

/**
 *
 * @author alvaro
 */
public class MainTeste {

    public static void main(String[] args) throws SQLException {

        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        ContaControle controller = new ContaControle();

        System.out.println("///////////////////////////////////////////////////");
        while (opcao != 6) {
            System.out.println("1 - Pegar todos");
            System.out.println("2 - Pegar 1");
            System.out.println("3 - Update");
            System.out.println("4 - Inserir");
            System.out.println("5 - Deletar");
            System.out.println("6 - Sair");
            System.out.print("Sua opcao: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Todas as Contas");
                    for (ContaModel contaModel : controller.getAll()) {
                        contaModel.imprimir();
                    }
                    break;
                case 2:
                    System.out.print("Digite o numero da conta: ");
                    scan = new Scanner(System.in);
                    String numeroConta = scan.nextLine();
                    controller.getOne(numeroConta).imprimir();
                    break;

                case 3:
                    ContaModel modelo = new ContaModel();
                    modelo.setBairro("Sao Carlos");
                    modelo.setCep("11111111");
                    modelo.setCidade("Campo SUL");
                    modelo.setEstado("MS");
                    modelo.setNomeCliente("Julia");
                    modelo.setNumeroCasa("1739");
                    modelo.setRua("Rua Cristobal");

                    System.out.print("Digite o numero da conta onde qeur inserir estes dados: ");
                    scan = new Scanner(System.in);
                    String numeroConta1 = scan.nextLine();
                    controller.update(numeroConta1, modelo);

                    break;

                case 4:

                    ContaModel modelo1 = new ContaModel();
                    modelo1.setBairro("Dom Bosco");
                    modelo1.setCep("71033558");
                    modelo1.setCidade("Campo Grande");
                    modelo1.setEstado("MS");
                    modelo1.setNomeCliente("Jaum");
                    modelo1.setNumeroCasa("1739");
                    modelo1.setRua("Rua Colombo");

                    
                    System.out.print("Digite um numero de conta novo: ");
                    scan = new Scanner(System.in);
                    modelo1.setNumeroConta(scan.nextLine());
                    controller.insert(modelo1);

                    break;
                case 5:
                    System.out.print("Digite um numero de conta que vc quer eliminar: ");
                    scan = new Scanner(System.in);
                    String numeroConta2 = scan.nextLine();
                    controller.deletar(numeroConta2);
                    break;

                default:
                    System.out.println("Hi");
                    break;
            }
        }
    }
}
