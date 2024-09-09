package CadastroVenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Caixa> caixas = new ArrayList<>();
        List<Comprador> compradores = new ArrayList<>();
        List<Compra> compras = new ArrayList<>();

        int opcoes = 0;

        while (opcoes != 7){

            listar();
            opcoes = teclado.nextInt();

            switch (opcoes){

                case 1:
                    System.out.print("Nome: ");
                    String nome = teclado.next();
                    System.out.print("Idade: ");
                    int idade = teclado.nextInt();

                    Caixa caixa = new Caixa(idade, nome);
                    caixas.add(caixa);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    nome = teclado.next();
                    System.out.print("Idade: ");
                    idade = teclado.nextInt();

                    Comprador Comprador = new Comprador(idade, nome);
                    compradores.add(Comprador);
                    break;

                case 3:
                    System.out.print("Caixa: ");
                    int idCaixa = teclado.nextInt();

                    System.out.print("Comprador: ");
                    int idComprador = teclado.nextInt();

                    System.out.println("Forma de pagamento: ");
                    for (FormaPagamento forma : FormaPagamento.values()) {
                        System.out.println(forma);
                    }
                    String forma = teclado.next();

                    System.out.print("Valor: ");
                    double valor = teclado.nextDouble();

                    Compra compra = new Compra(caixas.get(idCaixa), compradores.get(idComprador), FormaPagamento.valueOf(forma), valor);
                    compras.add(compra);
                    break;

                case 4:
                    System.out.print("Comprador: ");
                    idComprador = teclado.nextInt();

                    System.out.print("Valor: ");
                    valor = teclado.nextDouble();

                    compradores.get(idComprador).adicionar(valor);
                    break;

                case 5:
                    System.out.print("Caixa ou Comprador: ");
                    nome = teclado.next();
                    System.out.print("ID: ");
                    idCaixa = teclado.nextInt();

                    if(nome.equals("Caixa: ")){

                        caixas.get(idCaixa).desativar();
                    }else if(nome.equals("Comprador: ")){

                        compradores.get(idCaixa).desativar();
                    }
                    break;

                case 6:
                    System.out.println("Caixa, Comprador ou Compra: ");
                    nome = teclado.next();

                    System.out.print("ID: ");
                    idCaixa = teclado.nextInt();

                    if(nome.equals("Caixa")){

                        for(Caixa c : caixas){
                            System.out.println(c);
                        }

                    } else if(nome.equals("Comprador")) {

                        for(Comprador c : compradores){
                            System.out.println(c);
                        }

                    } else if(nome.equals("Compra")) {

                        for(Compra c : compras){
                            System.out.println(c);
                        }

                    }

                    break;

                default:
                    System.out.println("Saindo");

            }
        }

    }

    public static void listar(){
        System.out.println("1-Cadastrar caixa");
        System.out.println("2-Comprador");
        System.out.println("3-Compra");
        System.out.println("4-Adicionar dinheiro");
        System.out.println("5-Desabilitar");
        System.out.println("6-Listar ");
        System.out.println("7-Sair");

    }


}

