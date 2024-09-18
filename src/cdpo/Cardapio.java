package cdpo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cardapio{
	static List<String> listaNomes = new ArrayList<>();
	static List<String> listaDescricao = new ArrayList<>();
	static List<Boolean> listaAtivo = new ArrayList<>();
	static List<Double> listaPreco = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		
		mainMenu();
		while(true) {
		int op = sc.nextInt();
		mainMenuSelections(op, sc);
		if(op == 5) {
			break;
		}
		}
		sc.close();
		
	}
	
	
	
	public static void cadastroNomeProduto(String produtoNome) {
		listaNomes.add(produtoNome);
	}
	
	public static void cadastroDescProduto(String produtoDesc) {
		listaDescricao.add(produtoDesc);
	}
	
	public static void cadastroAtivoProduto(Boolean produtoAtv) {
		listaAtivo.add(produtoAtv);
	}
	
	public static void cadastroPrecoProduto(Double produtoPreco) {
		listaPreco.add(produtoPreco);
	}
	
	public static void alterarNomeProduto(int i, String produtoNome) {
		listaNomes.set(i, produtoNome);
	}
	
	public static void alterarDescProduto(int i, String produtoDesc) {
		listaNomes.set(i, produtoDesc);
	}
	
	public static void alterarAtivoProduto(int i, Boolean produtoAtv) {
		listaAtivo.set(i, produtoAtv);
	}
	
	public static void alterarPrecoProduto(int i, String produtoPreco) {
		listaNomes.set(i, produtoPreco);
	}
	
	public static void getAllInfo() {
		
		for(int i = 0; i < listaNomes.size(); i++) {
			if(listaAtivo.get(i) == false) {
				break;
			}
			System.out.println(listaNomes.get(i));
			System.out.println(listaDescricao.get(i));
			System.out.println(listaAtivo.get(i));
			System.out.println(listaPreco.get(i));
			System.out.println("o index desse produto é: "+ i);
			System.out.println("\n");
		}
		
		
	}
	
	public static void mainMenu() {
		System.out.println("Digite 1 para cadastrar um novo produto.");
		System.out.println("Digite 2 para ver todos os produtos.");
		System.out.println("Digite 3 para editar um produto.");
		System.out.println("Digite 4 para remover um produto.");
		System.out.println("Digite 5 para finalizar o processo.");
	}
	
	public static void mainMenuSelections(int op, Scanner sc) {
		switch(op) {
		case 1:
			System.out.println("Digite o nome do produto: ");
			String nome = sc.next();
			sc.nextLine();
			listaNomes.add(nome);
			System.out.println("Digite a descricao do produto: ");
			String descricao = sc.next();
			sc.nextLine();
			listaDescricao.add(descricao);
			System.out.println("O produto está disponivel? 1 para sim, 2 para nao");
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
			break;
		case 2:
			getAllInfo();
			break;
		
		case 3:
			System.out.println("digite o index para editar o as informacoes");
			System.out.println("digite o novo nome: ");
			nome = sc.next();
			sc.nextLine();
			
		}

			
	}
	
	
}