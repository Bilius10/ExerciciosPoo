import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(2000, 5400, "Joelso");
        Cassino cassino = new Cassino(usuario);
        Scanner teclado = new Scanner(System.in);


        System.out.println("Tigrinho 777");

        boolean permitir = cassino.permitirAcesso();
        if(permitir){
            while (usuario.getDinheitoConta() > 0){
                System.out.print("Digite o numero que de deseja apostas entre 1 e 10: ");
                cassino.setNumeroApostado(teclado.nextInt());
                System.out.print("Digite o saldo que deseja apostar: ");
                cassino.setAposta(teclado.nextDouble());
                System.out.println(" ");
                cassino.sortearNumero();

                for(int x = 1; x <= 8; x++){
                    int y = x+1;
                    int z = x-1;


                    System.out.println("-------");
                    System.out.println("-"+x+"-"+y+"-"+z+"-");
                    System.out.println("-------");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(" ");

                usuario.diferenciar();
                cassino.alterarMultiplicador();
                cassino.compararAposta();

            }
        }else{
            System.out.println("Acesso negado, menor de 18");
        }
    }
}
