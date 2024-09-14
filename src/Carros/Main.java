
public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Audi", "Audi-A6");
        Moto m1 = new Moto("Bmw", "Bmw moto");
        CarroEletrico ce1 = new CarroEletrico("Tesla", "Tesla model s");

        c1.acelerar();
        m1.acelerar();
        ce1.acelerar();
    }
}
