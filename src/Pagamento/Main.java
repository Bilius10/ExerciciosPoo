
public class Main {

    public static void main(String[] args) {

        CartaoCredito c1 = new CartaoCredito("João", "Pedro", "Debito", 12.4);
        Pix p1 = new Pix("4728378289", "Carlos", "Joeslo", 34.5);

        c1.processarPagamento();
        p1.processarPagamento();

    }
}
