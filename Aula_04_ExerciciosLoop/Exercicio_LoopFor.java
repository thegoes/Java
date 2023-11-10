import java.util.Scanner;

public class Exercicio_LoopFor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int primeiroNumero = leia.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int ultimoNumero = leia.nextInt();

        System.out.print("Digite o primeiro múltiplo desejado: ");
        int primeiroMultiplo = leia.nextInt();

        System.out.print("Digite o segundo múltiplo desejado: ");
        int segundoMultiplo = leia.nextInt();

        if (primeiroNumero >= ultimoNumero || primeiroMultiplo == segundoMultiplo) {
            System.out.println("Intervalo inválido ou múltiplos iguais");
        } else {
            System.out.println("No intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

            for (int numero = primeiroNumero; numero <= ultimoNumero; numero++) {
                if (numero % primeiroMultiplo == 0 && numero % segundoMultiplo == 0) {
                    System.out.println(numero + " é múltiplo de " + primeiroMultiplo + " e " + segundoMultiplo);
                }
            }
        }

        leia.close();
    }
}