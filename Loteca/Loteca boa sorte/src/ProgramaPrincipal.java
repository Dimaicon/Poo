import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        TabuleiroDaSorte tabuleiro = new TabuleiroDaSorte();
        tabuleiro.imprimir();
        Scanner scanner = new Scanner(System.in);

        int numValores = 2;
        int[] valores = new int[numValores];
        for (int i = 0; i < numValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        int premio = tabuleiro.verificarGanhador(valores);
        if (premio > 0) {
            System.out.println("Parabéns, você ganhou R$ " + premio + "!");
        } else {
            System.out.println("Que pena, você não ganhou nada.");
        }
    }
}
