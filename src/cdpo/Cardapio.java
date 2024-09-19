package cdpo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Cardapio{
	static List<String> listaNomes = new ArrayList<>();
	static List<String> listaDescricao = new ArrayList<>();
	static List<Boolean> listaAtivo = new ArrayList<>();
	static List<Double> listaPreco = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mainMenu();
		while(true) {
		int op = sc.nextInt();
		mainMenuSelections(op, sc);
		if(op == 6) {
			System.out.println("Operacao finalizada!");
			break;
		}
		System.out.print("Digite a proxima operacao: ");
		}
		sc.close();
		
	}
	
	public static void getAllInfo() {
		
		for(int i = 0; i < listaNomes.size(); i++) {
			if(listaAtivo.get(i) == false) {
				break;
			}
			System.out.println("Nome: "+ listaNomes.get(i));
			System.out.println("Descricao do produto:\n"+ listaDescricao.get(i));
			System.out.println("Produto disponivel?\n"+ listaAtivo.get(i));
			System.out.printf("Preco do produto: R$%.2f\n", listaPreco.get(i));
			System.out.println("o index desse produto eh: "+ i);
			System.out.println();
		}
		
		
	}
	
	public static void mainMenu() {
		System.out.println("Digite 1 para cadastrar um novo produto.");
		System.out.println("Digite 2 para ver todos os produtos.");
		System.out.println("Digite 3 para editar um produto.");
		System.out.println("Digite 4 para remover um produto.");
		System.out.println("Digite 5 para rever o menu.");
		System.out.println("Digite 6 para finalizar o processo.");
	}
	
	public static void mainMenuSelections(int op, Scanner sc) {
		switch(op) {
		case 1:
			cadastrarProduto(sc);
			break;
		
		case 2:
			getAllInfo();
			break;
		
		case 3:
			editarProduto(sc);
			break;
		
		case 4:
			removerProduto(sc);
			break;
		
		case 5:
			mainMenu();
			break;
		
		case 6:
			break;
		default:
			System.out.println("digito incorreto...");
			break;
		}

			
	}
	
	public static void cadastrarProduto(Scanner sc) {
		sc.nextLine();
		System.out.println("Digite o nome do produto: ");
		String nome = sc.nextLine();

		listaNomes.add(nome);
		
		System.out.println("Digite a descricao do produto: ");
			String descricao = sc.nextLine();

			listaDescricao.add(descricao);
		System.out.println("O produto esta disponivel? 1 para sim, 2 para nao");
	
			int disponibilidade = sc.nextInt();
			if(disponibilidade == 1) {
				listaAtivo.add(true);
			}
			else {
				listaAtivo.add(false);
			}
		
		System.out.println("Digite o preco do produto: ");
		Double price = sc.nextDouble();
		listaPreco.add(price);
		
		System.out.println("Produto adicionado!");
	}
	
	public static void editarProduto(Scanner sc) {
		sc.nextLine();
		System.out.println("digite o index para editar o as informacoes");
		int index = sc.nextInt();
		sc.nextLine();
	System.out.println("digite o novo nome: ");
		String nome = sc.nextLine();
			listaNomes.set(index, nome);
	
	System.out.println("digite a nova descricao: ");
		String descricao = sc.nextLine();
			listaDescricao.set(index, descricao);
	
	System.out.println("O produto esta disponivel? 1 para sim, 2 para nao");
		int disponibilidade = sc.nextInt();
			if(disponibilidade == 1) {
				listaAtivo.set(index, true);
		}
			else {
				listaAtivo.set(index, false);
			}
	
	System.out.println("digite o novo preco: ");
		Double price = sc.nextDouble();
		listaPreco.set(index, price);
		
	System.out.println("Item editado com sucesso! ");
	}
	
	public static void removerProduto(Scanner sc) {
		System.out.print("Digite o index do produto a ser excluido: ");
		int index = sc.nextInt();
		listaNomes.remove(index);
		listaDescricao.remove(index);
		listaAtivo.remove(index);
		listaPreco.remove(index);
		System.out.println("removido com sucesso!");
	}
	
	
}
