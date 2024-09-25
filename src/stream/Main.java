import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(Categoria.Brinquedo, "Bicicleta", 1000, 250));
        produtos.add(new Produto(Categoria.Brinquedo, "Bola", 50, 100));
        produtos.add(new Produto(Categoria.Eletronico, "Computador", 5000, 250));
        produtos.add(new Produto(Categoria.Eletronico, "Celular", 2400, 210));
        produtos.add(new Produto(Categoria.Roupa, "Camisa", 50, 400));
        produtos.add(new Produto(Categoria.Roupa, "Shorts", 1000, 200));

        Map<Categoria, List<Produto>> collect = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria));

        List<Loja> lojas = new ArrayList<>();
        lojas.add(new Loja(Categoria.Roupa, "Renner", collect.get(Categoria.Roupa)));
        lojas.add(new Loja(Categoria.Brinquedo, "Happy feliz", collect.get(Categoria.Brinquedo)));
        lojas.add(new Loja(Categoria.Eletronico, "Jose da TI", collect.get(Categoria.Eletronico)));

        //Produtor mais caros
        lojas.get(0).encontrarProdutosMaisCaros();
        lojas.get(1).encontrarProdutosMaisCaros();
        lojas.get(2).encontrarProdutosMaisCaros();

        System.out.println(" ");

        //Estatisticas
        lojas.get(0).gerarRelatorio();
        lojas.get(1).gerarRelatorio();
        lojas.get(2).gerarRelatorio();

        System.out.println(" ");

        //Soma
        lojas.get(0).totalEstoque();
        lojas.get(1).totalEstoque();
        lojas.get(2).totalEstoque();

        //Inserir novo produto
        lojas.get(0).addItemList(new Produto(Categoria.Roupa, "Casaco", 4300, 345 ));
        System.out.println(lojas.get(0).getProdutos());
        lojas.get(0).removeItemList(3);



    }
}