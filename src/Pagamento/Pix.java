public class Pix implements Pagamento{

    private String chave;
    private double valor;
    private String nomePagador;
    private String nomeRecebidor;

    public Pix(String chave, String nomePagador, String nomeRecebidor, double valor) {
        this.chave = chave;
        this.nomePagador = nomePagador;
        this.nomeRecebidor = nomeRecebidor;
        this.valor = valor;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento feito no valor de: "+this.valor);
        System.out.println("Chave: "+this.chave);
        System.out.println("De: "+this.nomePagador+" Para: "+this.nomeRecebidor);
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
