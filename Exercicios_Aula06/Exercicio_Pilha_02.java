import java.util.Scanner;
import java.util.Stack;
		
public class Exercicio_Pilha_02 {

	public static void main(String[] args) {



		        Stack<String> pilhaLivros = new Stack<>();
		        Scanner scanner = new Scanner(System.in);

		        int opcao;

		        do {
		            System.out.println("Menu:");
		            System.out.println("1: Adicionar um novo livro na pilha");
		            System.out.println("2: Listar todos os livros da Pilha");
		            System.out.println("3: Retirar um livro da pilha");
		            System.out.println("0: Sair");
		            System.out.print("Escolha a opção: ");
		            opcao = scanner.nextInt();
		            scanner.nextLine();  // Limpar o buffer do scanner

		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o nome do livro: ");
		                    String nomeLivro = scanner.nextLine();
		                    pilhaLivros.push(nomeLivro);
		                    System.out.println(nomeLivro + " foi adicionado à pilha.");
		                    break;

		                case 2:
		                    listarLivrosNaPilha(pilhaLivros);
		                    break;

		                case 3:
		                    retirarLivroDaPilha(pilhaLivros);
		                    break;

		                case 0:
		                    System.out.println("Programa finalizado.");
		                    break;

		                default:
		                    System.out.println("Opção inválida. Tente novamente.");
		                    break;
		            }

		        } while (opcao != 0);

		        scanner.close();
		    }

		    private static void listarLivrosNaPilha(Stack<String> pilhaLivros) {
		        if (pilhaLivros.isEmpty()) {
		            System.out.println("A pilha está vazia.");
		        } else {
		            System.out.println("Livros na pilha:");
		            for (String livro : pilhaLivros) {
		                System.out.println(livro);
		            }
		        }
		    }

		    private static void retirarLivroDaPilha(Stack<String> pilhaLivros) {
		        if (pilhaLivros.isEmpty()) {
		            System.out.println("A pilha está vazia. Não é possível retirar um livro.");
		        } else {
		            String livroRetirado = pilhaLivros.pop();
		            System.out.println("Livro retirado: " + livroRetirado);
		        }
		    }
	}
