package CadastroVenda;

public class Caixa extends Users{


    public Caixa(int idade, String nome) {
        super(idade, nome);

        System.out.println(".Caixa cadastrado");
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "ativo=" + ativo +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
