package CadastroVenda;

public class Comprador extends Users{

    private double dinheiro;

    public Comprador(int idade, String nome) {
        super(idade, nome);

        System.out.println("Comprador cadastrado");
    }

    public void adicionar(double dinheiro){
        setDinheiro(getDinheiro()+dinheiro);

        System.out.println("Dinheiro inserido");
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "dinheiro=" + dinheiro +
                ", ativo=" + ativo +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
