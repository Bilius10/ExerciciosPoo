import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Usuario usuario = null;
        List<Produto> carrinho = new ArrayList<>();

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 1, 100, 2500));
        produtos.add(new Produto("Celular", 2, 100, 1500));
        produtos.add(new Produto("Fone", 3, 100, 340));
        produtos.add(new Produto("Carregador", 4, 100, 78.45));
        produtos.add(new Produto("PC", 5, 100, 5600));
        produtos.add(new Produto("Monitor", 6, 100, 3000));

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n 1-Criar conta \n 2-Carrinho de compra \n 3-Comprar produto \n 4-Conta \n 5-Sair");
            opcao = teclado.nextInt();
            System.out.println(" ");

            switch (opcao) {
                case 1:
                    System.out.print("NOME: ");
                    String nome = teclado.next();

                    System.out.print("IDADE: ");
                    int idade = teclado.nextInt();

                    System.out.print("SALDO: ");
                    double saldo = teclado.nextDouble();

                    usuario = new Usuario(idade, nome, saldo, carrinho);
                    break;
                case 2:

                    double valor = carrinho.stream().mapToDouble(Produto::getValor).sum();

                    carrinho.forEach(System.out::println);
                    System.out.println("TOTAL: " + valor);

                    System.out.println("Pagar carrinho: 1-Sim 2-Não");
                    int pagar = teclado.nextInt();

                    if (pagar == 1 && usuario.getSaldo() > valor) {
                        usuario.setSaldo(usuario.getSaldo()-valor);
                        usuario.getCarrinhoProduto().clear();
                    }
                    break;
                case 3:

                    produtos.forEach(System.out::println);

                    System.out.print("SELECIONE O ID DO PRODUTO: ");
                    pagar = teclado.nextInt();

                    usuario.adicionarLista(produtos.get(pagar-1));
                    break;
                case 4:
                    System.out.println(usuario.toString());
                    break;
            }
        }
    }
}
