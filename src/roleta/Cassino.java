
import java.util.Random;

public class Cassino {

    private double aposta;
    private int numeroApostado;
    private int numeroSorteado;
    private Usuario usuario;
    private double multiplicador;

    public Cassino(Usuario usuario) {
        this.usuario = usuario;
    }

    public void sortearNumero(){

        Random random = new Random();
        this.numeroSorteado = random.nextInt(1, 11);
    }

    public void alterarMultiplicador(){

        if(usuario.getVitorias() > usuario.getDerrotas() || usuario.getVitorias() > usuario.getDiferenca()){
            this.multiplicador = 0.1;
        }else if(usuario.getVitorias() < usuario.getDerrotas()){
            this.multiplicador = 0.5;
        }
    }

    public void compararAposta(){

        if(usuario.getDinheitoConta() > this.aposta){
            if(numeroSorteado == numeroApostado ){
                System.out.println("Voce ganhou ");
                usuario.addSaldo(this.aposta*this.multiplicador);
            }else{
                System.out.println("Voce perdeu");
                usuario.diminuirSaldo(this.aposta);
            }
            System.out.println("-------");
            System.out.println("-"+this.numeroSorteado+"-"+this.numeroSorteado+"-"+this.numeroSorteado+"-");
            System.out.println("-------");
        }
    }

    public boolean permitirAcesso(){

        int idade = 2024 - usuario.getDataNascimento();
        if(idade > 18){
            return true;
        }else{
            return false;
        }
    }

    public double getAposta() {
        return aposta;
    }

    public void setAposta(double aposta) {
        this.aposta = aposta;
    }

    public int getNumeroApostado() {
        return numeroApostado;
    }

    public void setNumeroApostado(int numeroApostado) {
        this.numeroApostado = numeroApostado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    @Override
    public String toString() {
        return "Cassino{" +
                "aposta=" + aposta +
                ", numeroApostado=" + numeroApostado +
                ", usuario=" + usuario +
                '}';
    }
}
