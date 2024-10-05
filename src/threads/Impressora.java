import java.util.List;

public class Impressora implements Runnable{

    private String nomeImpressora;
    private List<String> fila;

    public Impressora(String nomeImpressora, List<String> fila) {
        this.nomeImpressora = nomeImpressora;
        this.fila = fila;
    }


    @Override
    public void run() {
        while (true){

            try {
                imprimir();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


    public synchronized void imprimir() throws InterruptedException {

        if(!this.fila.isEmpty()){
            System.out.println("Nome: "+this.nomeImpressora+" Documento: "+fila.get(0));
            fila.remove(0);
            Thread.sleep(2000);

        }

    }


    public String getNomeImpressora() {
        return nomeImpressora;
    }

    public void setNomeImpressora(String nomeImpressora) {
        this.nomeImpressora = nomeImpressora;
    }

    public List<String> getFila() {
        return fila;
    }

    public void setFila(List<String> fila) {
        this.fila = fila;
    }


}
