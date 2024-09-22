
public class ProductTester {
    public static void main(String[] args) {

        Produto notebook = new Produto("Notebook", 1, 10, 3200);
        Produto celular = new Produto("Celular", 2, 10, 2400);
        Produto fone = new Produto("Fone", 3, 10, 120);
        Produto carregador = new Produto("Carregador", 4, 10, 65.70);
        Produto teclado = new Produto("Teclado", 5, 10, 124.56);
        Produto mouse = new Produto("Mouse", 6, 10, 110.45);

        System.out.println(notebook.toString());
        System.out.println(celular.toString());
        System.out.println(fone.toString());
        System.out.println(carregador.toString());
        System.out.println(teclado.toString());
        System.out.println(mouse.toString());
    }
}
