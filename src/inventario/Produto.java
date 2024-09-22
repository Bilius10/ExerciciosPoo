public class Produto {

    //Declarações de campo de instância
    private int numeroItem;
    private String nomeItem;
    private int quantidade;
    private double valor;

    public Produto() {
    }

    public Produto(String nomeItem, int numeroItem, int quantidade, double valor) {
        this.nomeItem = nomeItem;
        this.numeroItem = numeroItem;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeItem='" + nomeItem + '\'' +
                ", numeroItem=" + numeroItem +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
