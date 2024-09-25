import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Loja {

    private String nome;
    private List<Produto> produtos;
    private  Categoria categoria;

    public Loja(Categoria categoria, String nome, List<Produto> produtos) {
        this.categoria = categoria;
        this.nome = nome;
        this.produtos = produtos;
    }

    public void addItemList(Produto produto){
        if(produto.getCategoria() == this.categoria){
            this.produtos.add(produto);
        }
    }

    public void removeItemList(int posicao){
        produtos.remove(posicao);
    }

    public void totalEstoque(){
        System.out.println(this.nome);
        double sum = produtos.stream().mapToDouble(Produto::getPreco).sum();
        System.out.println(sum);
    }

    public void encontrarProdutosMaisCaros(){
        System.out.println(this.nome);
        produtos.stream().max(Comparator.comparing(Produto::getPreco)).ifPresent(System.out::println);
    }

    public void gerarRelatorio(){
        System.out.println(this.nome);
        DoubleSummaryStatistics precos = produtos.stream().collect(Collectors.summarizingDouble(Produto::getPreco));
        DoubleSummaryStatistics quantidade = produtos.stream().collect(Collectors.summarizingDouble(Produto::getQuantidadeEstoque));
        System.out.println("Precos: "+precos+"\n Quantidade:"+quantidade);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "categoria=" + categoria +
                ", nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
