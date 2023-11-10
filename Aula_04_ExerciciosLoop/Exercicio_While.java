import java.util.Scanner;

public class Exercicio_While {

	 public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int idade;
	        int pessoasMenorQue21 = 0;
	        int pessoasMaiorQue50 = 0;
	        int totalIdadesLidas = 0;

	        // Loop principal
	        do {
	            // Leitura de até 10 idades
	            for (int i = 0; i < 10; i++) {
	                System.out.print("Digite a idade: ");
	                idade = leia.nextInt();

	                // Verifica se a idade é negativa para encerrar o loop
	                if (idade < 0) {
	                    break;
	                }

	                // Analisa a idade e incrementa os contadores apropriados
	                if (idade < 21) {
	                    pessoasMenorQue21++;
	                } else if (idade > 50) {
	                    pessoasMaiorQue50++;
	                }

	                totalIdadesLidas++;
	            }

	            // Exibe os resultados parciais
	            System.out.println("Total de pessoas com menos de 21 anos: " + pessoasMenorQue21);
	            System.out.println("Total de pessoas com mais de 50 anos: " + pessoasMaiorQue50);

	            // Pergunta se deseja continuar
	            System.out.print("Deseja continuar (S/N)? ");
	            leia.nextLine(); // Consumir a quebra de linha pendente
	        } while (leia.nextLine().equalsIgnoreCase("S"));

	        // Exibe o total geral de idades lidas
	        System.out.println("Total geral de idades lidas: " + totalIdadesLidas);

	        leia.close();
	    }
	}