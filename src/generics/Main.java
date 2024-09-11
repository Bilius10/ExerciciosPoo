package generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<comerciais> comercial = new ArrayList<>();
        List<ocupacionais> ocupacional = new ArrayList<>();
        alugar a = new alugar(ocupacional);


        comercial.add(new comerciais("Rua das Flores", "São Paulo", 3, 2, 1));
        comercial.add(new comerciais("Avenida Paulista", "São Paulo", 4, 3, 2));
        comercial.add(new comerciais("Rua 15 de Novembro", "Curitiba", 2, 1, 1));
        comercial.add(new comerciais("Avenida Atlântica", "Rio de Janeiro", 5, 4, 3));
        comercial.add(new comerciais("Rua dos Pinheiros", "Belo Horizonte", 3, 2, 1));
        comercial.add(new comerciais("Rua Augusta", "São Paulo", 1, 1, 0));
        ocupacional.add(new ocupacionais("Rua dos Andradas", "Porto Alegre", 4, 2, 2));
        ocupacional.add(new ocupacionais("Rua das Palmeiras", "Florianópolis", 3, 3, 1));
        ocupacional.add(new ocupacionais("Avenida Brasil", "Fortaleza", 2, 1, 1));
        ocupacional.add(new ocupacionais("Rua Amazonas", "Manaus", 3, 2, 2));
        ocupacional.add(new ocupacionais("Rua Boa Vista", "Recife", 5, 3, 3));
        ocupacional.add(new ocupacionais("Rua das Laranjeiras", "Salvador", 4, 4, 2));

        a.aluguel(ocupacional.get(2));
        a.encerrar(ocupacional.get(2));
        a.listar();


    }
}