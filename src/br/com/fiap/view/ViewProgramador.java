package br.com.fiap.view;

import br.com.fiap.model.Endereco;
import br.com.fiap.model.Programador;

import java.util.Scanner;

public class ViewProgramador {

    private static void exibirMenu() {
        System.out.println("Você deve selecionar uma operação:");
        System.out.println("1-Cadastrar/Alterar programador");
        System.out.println("2-Exibir programador");
        System.out.println("3-Sair");
        System.out.println("Digite o número da opção ");
    }

    private static Programador cadastrarProgramador() {
        Programador programador = new Programador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome do programador: ");
        programador.setNome(sc.nextLine());
        System.out.print("Informe o nome da rua, " +
                "o número, " +
                "o complemento, " +
                "o CEP, " +
                "a cidade e o estado, " +
                "teclando enter ao final de cada um : ");
        programador.setEndereco(new Endereco(sc.nextLine(),
                Integer.parseInt(sc.nextLine()),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()));
        System.out.println("Informe o CPF do programador: ");
        programador.setCpf(sc.nextLine());
        System.out.println("Informe o salário fixo do programador: ");
        programador.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o ramal do programador: ");
        programador.setRamal(sc.nextInt());
        return programador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programador programador = null;
        int op;
        do {
            exibirMenu();
            op = sc.nextInt();
            switch (op){
                case 1:
                    programador = cadastrarProgramador();
                    break;
                case 2:
                    if (programador != null)
                        System.out.println(programador.getDetalhamento());
                    else
                        System.out.println("Nenhum programador cadastrado");
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