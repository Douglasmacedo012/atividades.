import java.util.Scanner;
import java.util.Random;

public class jogo{

    public static void main(String[] args) {
        jogarjogo();
    }

    public static void jogarjogo() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                acertou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior. Tente novamente.");
            } else {
                System.out.println("O número é menor. Tente novamente.");
            }
        }

        scanner.close();
    }
}