import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TabuleiroDaSorte {
    private int[][] matriz;
    private int totalNumerosGerados;
    private List<Integer> numerosDigitados;

    public TabuleiroDaSorte() {
        matriz = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(101); // Gera um número aleatório entre 0 e 100.
                totalNumerosGerados++;
            }
        }
        numerosDigitados = new ArrayList<Integer>();
    }

    public void adicionarNumeroDigitado(int numero) {
        numerosDigitados.add(numero);
    }

    public int verificarGanhador(int[] valores) {
        int[] contagem = new int[valores.length];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int num = this.matriz[i][j];
                for (int k = 0; k < valores.length; k++) {
                    if (num == valores[k]) {
                        contagem[k]++;
                        if (contagem[k] >= 3) {
                            return contagem[k] * 1000;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public int calcularPremio(int numeroApareceu) {
        return numeroApareceu * 1000;
    }

    public int getTotalNumerosGerados() {
        return totalNumerosGerados;
    }


    public void imprimir() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(this.matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
