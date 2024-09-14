public class Carro extends Veiculo{

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

}
