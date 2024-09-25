package cdpo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Cardapio{
	static List<String> listaNomes = new ArrayList<>();
	static List<String> listaCodigo = new ArrayList<>();
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
		
		System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("CÓDIGO PRODUTO                                                                              VALOR");
        System.out.println("-------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < listaNomes.size(); i++) {
			if(listaAtivo.get(i) == false) {
				break;
			}
			System.out.printf("%-7s %-80s %6s\n", listaCodigo.get(i), listaNomes.get(i), listaPreco.get(i));
		}
		
        System.out.println("-------------------------------------------------------------------------------------------------");
		
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
	
		String nome;
		do {
			System.out.println("digite o nome: ");
				nome = sc.nextLine();
		} while(nome.length() < 3 || nome.length() > 60);
		
		String codigoProd;
		do {
			System.out.println("digite o codigo do produto: ");
				codigoProd = sc.nextLine();
		
		} while(codigoProd.length() != 6);
	
		int disponibilidade;
		do {
			System.out.println("O produto esta disponivel? 1 para sim, 2 para nao");
				disponibilidade = sc.nextInt();
			
		} while(disponibilidade != 1 || disponibilidade != 2);
	
		Double price;
		do {
		System.out.println("digite o preco: ");
			price = sc.nextDouble();
		
		} while(price < 0);
		
		System.out.println("Item incluido com sucesso! ");
		
		listaNomes.add(nome);
		listaCodigo.add(codigoProd);
		if(disponibilidade == 1) {
			listaAtivo.add(true);
		}
		else {
			listaAtivo.add(false);
		}
		listaPreco.add(price);
	
	}
	
	public static void editarProduto(Scanner sc) {
		sc.nextLine();
		System.out.println("digite o index para editar o as informacoes");
		int index = sc.nextInt();
		sc.nextLine();
	
		String nome;
		do {
			System.out.println("digite o novo nome: ");
				nome = sc.nextLine();
		} while(nome.length() < 3 || nome.length() > 60);
		
		String codigoProd;
		do {
			System.out.println("digite o novo codigo do produto: ");
				codigoProd = sc.nextLine();
		
		} while(codigoProd.length() != 6);
	
		int disponibilidade;
		do {
			System.out.println("O produto esta disponivel? 1 para sim, 2 para nao");
				disponibilidade = sc.nextInt();
			
		} while(disponibilidade != 1 || disponibilidade != 2);
	
		Double price;
		do {
		System.out.println("digite o novo preco: ");
			price = sc.nextDouble();
		
		} while(price < 0);
		
		System.out.println("Item editado com sucesso! ");
		
		listaNomes.set(index, nome);
		listaCodigo.set(index, codigoProd);
		if(disponibilidade == 1) {
			listaAtivo.set(index, true);
		}
		else {
			listaAtivo.set(index, false);
		}
		listaPreco.set(index, price);
	
	}
	
	public static void removerProduto(Scanner sc) {
		System.out.print("Digite o index do produto a ser excluido: ");
		int index = sc.nextInt();
		listaNomes.remove(index);
		listaCodigo.remove(index);
		listaAtivo.remove(index);
		listaPreco.remove(index);
		System.out.println("removido com sucesso!");
	}
	
	
}
