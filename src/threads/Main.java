
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Usuario usuario1 = new Usuario("João", "RH");
        Usuario usuario2 = new Usuario("Pedro", "Diretor");
        Usuario usuario3 = new Usuario("Claudia", "Estagio");
        List<String> documentos = new ArrayList<>();

        Impressora impressora = new Impressora("Impressor Geral", documentos);
        Thread thread = new Thread(impressora);

        thread.start();
        for (int i = 0; i < 5; i++) {

            usuario1.setNomeDocumento(sortear());
            usuario2.setNomeDocumento(sortear());
            usuario3.setNomeDocumento(sortear());

            impressora.addLista(usuario1.getNomeDocumento());
            impressora.addLista(usuario2.getNomeDocumento());
            impressora.addLista(usuario3.getNomeDocumento());

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
