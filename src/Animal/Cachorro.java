public class Cachorro extends Animal{

    String raca;
    String tamanho;

    public Cachorro(int idade, String nome, String raca, String temanho) {
        super(idade, nome);
        this.raca = raca;
        this.tamanho = tamanho;
    }

    @Override
    public void emitirSom() {
        System.out.println("UAU");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
