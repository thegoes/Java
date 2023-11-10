import java.util.Scanner;

public class Exercicio_LoopWhileDo {

	 public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);


        int numero;
        int soma = 0;

        System.out.println("Digite números inteiros e pressione 0 para encerrar o cálculo:");

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("A soma dos números positivos digitados é: " + soma);

        leia.close();
    }
}
