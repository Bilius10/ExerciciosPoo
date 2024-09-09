package Tigrinho;

import java.util.Random;

public class Apostar {

    private Usuario usuario;
    private double valor;
    private FormaPagamento forma;
    private int num;

    public Apostar(FormaPagamento forma, int num, Usuario usuario, double valor) {

        if(usuario.getSaldo() >= valor) {
            this.forma = forma;
            this.num = num;
            this.usuario = usuario;
            this.valor = valor;
            aposta();
        }
    }

    public void aposta(){

        Random gerador = new Random();

        int sorteio = gerador.nextInt(10);

        if (sorteio == this.num){
            usuario.setSaldo(usuario.getSaldo()+valor);
            System.out.println("Ganhou, seu novo saldo é "+usuario.getSaldo());
        }else{
            System.out.println("Perdeu o numero foi: "+sorteio);
            usuario.setSaldo(usuario.getSaldo()-valor);
        }
    }

    public FormaPagamento getForma() {
        return forma;
    }

    public void setForma(FormaPagamento forma) {
        this.forma = forma;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Apostar{" +
                "forma=" + forma +
                ", usuario=" + usuario +
                ", valor=" + valor +
                ", num=" + num +
                '}';
    }
}
