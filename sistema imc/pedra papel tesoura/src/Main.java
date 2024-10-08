import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int modo;
        int escolha;

        System.out.println("Bem-vindo ao jogo de Pedra, Papel e Tesoura");
        System.out.println("Escolha a dificuldade\nDigite: ");
        System.out.println("1 - Modo NORMAL\n2 - Modo IMPOSSÍVEL");
        modo = scanner.nextInt();

        if (modo == 1) {
            System.out.println("Modo normal");

            do {
                System.out.println("Digite: \n1 - Pedra\n2 - Papel\n3 - Tesoura\n99 - para sair");
                escolha = scanner.nextInt();


                if (escolha == 99) {
                    System.out.println("Saindo do jogo...");
                    break; // Sai do loop
                }


                int aleatorio = random.nextInt(3) + 1; // Gera 1, 2 ou 3


                System.out.println("O computador escolheu " + (aleatorio == 1 ? "Pedra" : aleatorio == 2 ? "Papel" : "Tesoura") +
                        " e você escolheu " + (escolha == 1 ? "Pedra" : escolha == 2 ? "Papel" : "Tesoura"));


                if (escolha < 1 || escolha > 3) {
                    System.out.println("Escolha inválida. Tente novamente.");
                } else if (escolha == aleatorio) {
                    System.out.println("Empate, tente novamente.");
                } else if ((escolha == 1 && aleatorio == 2) || (escolha == 2 && aleatorio == 3) || (escolha == 3 && aleatorio == 1)) {
                    System.out.println("||                 |VOCÊ PERDEU|                     ||");
                } else {
                    System.out.println("||                 |VOCÊ GANHOU|                     ||");
                }

            } while (true);
        } else {
            System.out.println("Modo impossível (ainda não implementado).");
        }

        scanner.close();
    }
}