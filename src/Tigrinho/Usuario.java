package Tigrinho;

public class Usuario {

    private String nome;
    private int idade;
    private double saldo;
    private boolean ativo;

    public Usuario(String nome, int idade) {

        if(getIdade() >= 18) {
            this.ativo = true;
            this.idade = idade;
            this.nome = nome;
        }
    }

    public void desativar(){

        setAtivo(false);
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
