package CadastroVenda;

public class Compra {

    private Caixa caixa;
    private Comprador comprador;
    private double valor;
    private FormaPagamento forma;

    public Compra(Caixa caixa, Comprador comprador, FormaPagamento forma, double valor) {
        if(comprador.getDinheiro() > valor && comprador.isAtivo() && caixa.isAtivo()) {

            this.caixa = caixa;
            this.comprador = comprador;
            this.forma = forma;
            this.valor = valor;
            descontar();
            System.out.println("Compra aprovada");
        }else{

            System.out.println("Compra negada");
        }
    }

    @Override
    public String toString() {
        return "Compra{" +
                "caixa=" + caixa +
                ", comprador=" + comprador +
                ", valor=" + valor +
                ", forma=" + forma +
                '}';
    }

    public void descontar(){
        this.comprador.setDinheiro(this.comprador.getDinheiro()-this.valor);
    }
    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public FormaPagamento getForma() {
        return forma;
    }

    public void setForma(FormaPagamento forma) {
        this.forma = forma;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
