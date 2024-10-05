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
        if(fila.size()>1){
            System.out.println("Imprimindo "+fila.get(0));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Imprimido "+fila.get(0));
            fila.remove(0);
        }
    }

    public void addLista(String documento){
        fila.add(documento);
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
