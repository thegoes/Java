import java.util.Scanner;

public class Tabuada_V2 {

    public static void main(String[] args) {
  
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        int contador = 1; 

        while (contador <= 10) { 
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }

        leia.close();
    }
}
