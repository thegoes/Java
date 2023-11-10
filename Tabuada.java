import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        for (int contador = 1; contador <= 100; contador+=7) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
        }

        leia.close();
    }
}
