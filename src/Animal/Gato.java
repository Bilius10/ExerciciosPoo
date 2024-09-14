public class Gato extends Animal{

    private String cor;
    private float peso;


    public Gato(int idade, String nome, String cor, float peso) {
        super(idade, nome);
        this.cor = cor;
        this.peso = peso;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
