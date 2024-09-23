import java.util.List;

public class Usuario {

    private String nome;
    private int idade;
    private double saldo;
    private double saldoCarrinho;
    private List<Produto> carrinhoProduto;

    public Usuario(int idade, String nome, double saldo, List<Produto> carrinhoProduto) {
        this.idade = idade;
        this.nome = nome;
        this.saldo = saldo;
        this.carrinhoProduto = carrinhoProduto;
    }

    public void adicionarLista(Produto produto){
        this.carrinhoProduto.add(produto);

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "carrinhoProduto=" + carrinhoProduto +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", saldo=" + saldo +
                ", saldoCarrinho=" + saldoCarrinho +
                '}';
    }

    public List<Produto> getCarrinhoProduto() {
        return carrinhoProduto;
    }

    public void setCarrinhoProduto(List<Produto> list) {
        this.carrinhoProduto = list;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoCarrinho() {
        return saldoCarrinho;
    }

    public void setSaldoCarrinho(double saldoCarrinho) {
        this.saldoCarrinho = saldoCarrinho;
    }
}
