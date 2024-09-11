package generic;

import java.util.List;

public class alugar <a> {

    private List<a> imovel;

    public alugar(List<a> imovel) {
        this.imovel = imovel;
    }

    public void aluguel(a imov){

        if(imovel.contains(imov)) {
            System.out.println("Showmet");
            System.out.println(imov.toString());
            System.out.println("Imovel alugado");

            for (int x = imovel.size() - 1; x >= 0; x--) {
                if (imovel.get(x).equals(imov)) {
                    imovel.remove(x);
                    break;
                }

            }
        }
    }

    public void encerrar(a imov){
        if(imovel.contains(imov)) {
            System.out.println("Contrato encerrado");

            imovel.add(imov);
        }
    }

    public void listar(){

        for(a passe :imovel){
            System.out.println(passe);
        }
    }

    public List<a> getImovel() {
        return imovel;
    }

    public void setImovel(List<a> imovel) {
        this.imovel = imovel;
    }
}
