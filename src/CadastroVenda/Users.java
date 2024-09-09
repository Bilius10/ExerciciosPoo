package CadastroVenda;

public abstract class Users {

    protected String nome;
    protected int idade;
    protected boolean ativo;

    public Users(int idade, String nome) {
        this.ativo = true;
        this.idade = idade;
        this.nome = nome;
    }

    public void desativar(){

        this.ativo = false;

        System.out.println("Desativado");
    }

    public  void aniversario(){

        this.idade++;

    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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
}
