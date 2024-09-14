public class CartaoCredito implements Pagamento{

    private String tipo;
    private double valor;
    private String nomePagador;
    private String nomeRecebidor;

    public CartaoCredito(String nomePagador, String nomeRecebidor, String tipo, double valor) {
        this.nomePagador = nomePagador;
        this.nomeRecebidor = nomeRecebidor;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento feito no valor de: "+this.valor);
        System.out.println(this.tipo);
        System.out.println("De: "+this.nomePagador+" Para: "+this.nomeRecebidor);
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public String getNomeRecebidor() {
        return nomeRecebidor;
    }

    public void setNomeRecebidor(String nomeRecebidor) {
        this.nomeRecebidor = nomeRecebidor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
