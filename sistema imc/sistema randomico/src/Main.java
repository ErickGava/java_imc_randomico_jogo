import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        int contador = 0;

        int numeroAleatorio = random.nextInt(100);
        System.out.println(numeroAleatorio);

        System.out.println("Digite um numero entre 1 e 100 e tente acertar o numero");
        number = scanner.nextInt();

        do {

            if (number > numeroAleatorio) {
                System.out.println("Seu numero é maior do que o escolhido, tente novamente");
                contador++;
                number = scanner.nextInt();
            } // se o numero e maior, fala que o numero e maior do que o escolhido, tentar novamente // repete
            else if (number < numeroAleatorio){
                System.out.println("seu numero é menor que o escolhido, tente novamente");
                contador++;
                number = scanner.nextInt();
            } // se o numero e maior, fala isso e fala pra escolher outro

        }while (number != numeroAleatorio);
 // escreve se acertou
        System.out.println("Parabens, voce acertou o numero em "+contador+" tentativas!");
    }
}