public class CarroEletrico  extends Carro implements Eletromocel{

    public CarroEletrico(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void carregarBateria() {

    }

    @Override
    public void acelerar(){
        System.out.println("Carro eletrico acelerando");
    }
}
