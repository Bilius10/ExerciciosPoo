
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> objects1 = new ArrayList<>();
        List<String> objects2 = new ArrayList<>();


        Impressora impressora1 = new Impressora("Impressora Sala", objects1);
        Impressora impressora2 = new Impressora("Impressora geral", objects2);

        Thread thread1 = new Thread(impressora1, "Impressora Sala");
        Thread thread2 = new Thread(impressora2, "Impressora Geral");

        thread1.start();
        thread2.start();

        while (true){
            objects1.add(sortear());
            objects2.add(sortear());
            Thread.sleep(1000);
        }



    }

    public static  String sortear(){
        List<String> listaDocumentos = List.of("Relatório_Anual.pdf", "Fatura_Cliente.docx", "Contrato_Aluguel.pdf", "Proposta_Comercial.docx", "Planejamento_Financeiro.xlsx", "Manual_Usuario.pdf", "TCC_Final.docx", "Recibo_Pagamento.pdf", "Certificado_Curso.docx", "Resumo_Reunião.pdf", "Folha_Ponto.xlsx", "Declaração_Imposto.pdf", "Orçamento_Projeto.docx", "Apresentação_Produto.pptx", "Guia_Instalação.pdf"
        );
        Random random = new Random();
        int posicao = random.nextInt(listaDocumentos.size());

        String retorno = listaDocumentos.get(posicao);

        return retorno;
    }
}
