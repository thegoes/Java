import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_Pilha_Fila {

	    public static void main(String[] args) {
	        Queue<String> filaClientes = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);

	        int opcao;

	        do {
	            System.out.println("Menu - Simulação Agência Bancária:");
	            System.out.println("1: Adicionar um novo cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar (retirar) uma pessoa da fila");
	            System.out.println("0: Sair");
	            System.out.print("Escolha a opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine();  

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do Cliente: ");
	                    String nomeCliente = scanner.nextLine();
	                    filaClientes.add(nomeCliente);
	                    System.out.println(nomeCliente + " foi adicionado à fila.");
	                    break;

	                case 2:
	                    listarClientesNaFila(filaClientes);
	                    break;

	                case 3:
	                    chamarClienteDaFila(filaClientes);
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

	    private static void listarClientesNaFila(Queue<String> filaClientes) {
	        if (filaClientes.isEmpty()) {
	            System.out.println("A fila está vazia.");
	        } else {
	            System.out.println("Clientes na fila:");
	            for (String cliente : filaClientes) {
	                System.out.println(cliente);
	            }
	        }
	    }

	    private static void chamarClienteDaFila(Queue<String> filaClientes) {
	        if (filaClientes.isEmpty()) {
	            System.out.println("A fila está vazia. Não é possível chamar um cliente.");
	        } else {
	            String clienteChamado = filaClientes.poll();
	            System.out.println("Cliente chamado: " + clienteChamado);
	        }
	    }
	}
