import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        Esfera esfera = new Esfera(raio);

        System.out.println("O volume da esfera é: " + esfera.getVolume());
    }
}
