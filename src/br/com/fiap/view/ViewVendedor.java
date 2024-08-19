package br.com.fiap.view;

import br.com.fiap.model.Endereco;
import br.com.fiap.model.Vendedor;

import java.util.Scanner;

public class ViewVendedor {

    private static void exibirMenu() {
        System.out.println("Você deve selecionar uma operação:");
        System.out.println("1-Cadastrar/Alterar vendedor");
        System.out.println("2-Exibir vendedor");
        System.out.println("3-Sair");
        System.out.println("Digite o número da opção ");
    }

    private static Vendedor cadastrarVendedor() {
        Vendedor vendedor = new Vendedor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome do vendedor: ");
        vendedor.setNome(sc.nextLine());
        System.out.print("Informe o nome da rua," +
                " o número, " +
                "o complemento, " +
                "o CEP, " +
                "a cidade e o estado, " +
                "teclando enter ao final de cada um : ");
        vendedor.setEndereco(new Endereco(sc.nextLine(),
                Integer.parseInt(sc.nextLine()),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()));
        System.out.println("Informe o CPF do vendedor: ");
        vendedor.setCpf(sc.nextLine());
        System.out.println("Informe o salário fixo do vendedor: ");
        vendedor.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o total de vendas semestrais do vendedor: ");
        vendedor.setVendasSemestrais(sc.nextDouble());
        return vendedor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vendedor vendedor = null;
        int op;
        do {
            exibirMenu();
            op = sc.nextInt();
            switch (op){
                case 1:
                    vendedor = cadastrarVendedor();
                    break;
                case 2:
                    if (vendedor != null)
                        System.out.println(vendedor.getDetalhamento());
                    else
                        System.out.println("Nenhum vendedor cadastrado");
                    break;
                case 3:
                    System.out.println("Finalizando o programa!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 3);

        sc.close();
    }
}