import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade, esporte, futebol = 0, voleibolM18 = 0, basqueteM18 = 0, outros = 0;
        String continua = "S";

        do {
            System.out.print("Digite a sua idade: ");
            idade = leia.nextInt();

            do {
                System.out.print("Digite o seu Esporte favorito (1- Futebol / 2 - Voleibol / 3 - Basquete / 4 - Outros): ");
                esporte = leia.nextInt();
            } while (esporte < 1 || esporte > 4);

            // Quantas pessoas gostam de futebol?
            if (esporte == 1) {
                futebol++;
            }

            // Quantas pessoas gostam de basquete e são menores de 18 anos?
            if (esporte == 3 && idade < 18) {
                basqueteM18++;
            }

            // Quantas pessoas gostam de voleibol e são maiores de 18 anos?
            if (esporte == 2 && idade > 18) {
                voleibolM18++;
            }

            // Quantas pessoas gostam de outros esportes?
            if (esporte == 4) {
                outros++;
            }

            System.out.print("Deseja continuar (S/N)? ");
            leia.nextLine(); // Consumir a quebra de linha pendente
            continua = leia.nextLine().toUpperCase();
        } while (continua.equals("S"));

        System.out.println("Total de pessoas que gostam de futebol: " + futebol);
        System.out.println("Total de pessoas que gostam de voleibol e são maiores de 18 anos: " + voleibolM18);
        System.out.println("Total de pessoas que gostam de basquete e são menores de 18 anos: " + basqueteM18);
        System.out.println("Total de pessoas que gostam de outros esportes: " + outros);

        leia.close();
    }
}
