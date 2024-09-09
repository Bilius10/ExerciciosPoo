package Tigrinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Apostar> apostas = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();

        int opcao = 0;

        while (opcao != 6){

            opcoes();
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Nome: ");
                    String nome = teclado.next();
                    System.out.print("Idade: ");
                    int idade = teclado.nextInt();

                    Usuario usuario = new Usuario(nome, idade);
                    usuarios.add(usuario);
                    break;

                case 2:
                    System.out.print("ID: ");
                    int numUsuario = teclado.nextInt();
                    System.out.print("Valor: ");
                    double valor = teclado.nextDouble();

                    usuarios.get(numUsuario).setSaldo(valor);
                    break;

                case 3:
                    System.out.print("ID Usuario: ");
                    numUsuario = teclado.nextInt();

                    System.out.println("Forma de pagameto: ");
                    for (FormaPagamento forma : FormaPagamento.values()){
                        System.out.println(forma);
                    }
                    String forma = teclado.next();

                    System.out.print("Escolha um numero entre 0 e 10: ");
                    int numAposta = teclado.nextInt();

                    System.out.println("Valor apostada: ");
                    double valorAposta = teclado.nextDouble();

                    Apostar apostar = new Apostar(FormaPagamento.valueOf(forma), numAposta, usuarios.get(numUsuario), valorAposta);
                    apostas.add(apostar);

                    break;

                case 4:
                    System.out.println("ID do usuario: ");
                    numUsuario = teclado.nextInt();

                    usuarios.get(numUsuario).desativar();
                    break;

                case 5:
                    System.out.println("ID do usuario: ");
                    numUsuario = teclado.nextInt();

                    System.out.println(usuarios.get(numUsuario).toString());
                    break;

                default:
                    System.out.println("Saindo");
            }

        }

    }

    public static void opcoes(){

        System.out.println("1-Criar Usuario");
        System.out.println("2-Adicionar dinheiro");
        System.out.println("3-Apostar");
        System.out.println("4-Desativar usuario");
        System.out.println("5-Listar informações");
        System.out.println("6-Sair");
    }
}
