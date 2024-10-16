package cdpo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Cardapio{
	static List<String> listaNomesProdutos = new ArrayList<>();
	static List<String> listaCodigoProdutos = new ArrayList<>();
	static List<Boolean> listaAtivoProdutos = new ArrayList<>();
	static List<Double> listaPrecoProdutos = new ArrayList<>();
	
	static List<String> listaNomeClientes = new ArrayList<>();
	static List<String> listaSexoClientes = new ArrayList<>();
	static List<String> listaEmailClientes = new ArrayList<>();
	static List<String> listaNascimentoClientes = new ArrayList<>();
	static List<String> listaTelefoneClientes = new ArrayList<>();
	static List<String> listaEnderecoClientes = new ArrayList<>();
	static List<Boolean> listaAutorizacaoClientes = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*mainMenu();
		while(true) {
		int op = sc.nextInt();
		mainMenuSelections(op, sc);
		if(op == 6) {
			System.out.println("Operacao finalizada!");
			break;
		}
		System.out.print("Digite a proxima operacao: ");
		}*/
		cadastrarCliente(sc);
		
		
		sc.close();
		
	}
	
	public static void getAllProductInfo() {
		
		System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("CÓDIGO PRODUTO                                                                              VALOR");
        System.out.println("-------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < listaNomesProdutos.size(); i++) {
			if(listaAtivoProdutos.get(i) == false) {
				break;
			}
			System.out.printf("%-7s %-80s %6s\n", listaCodigoProdutos.get(i), listaNomesProdutos.get(i), listaPrecoProdutos.get(i));
		}
		
        System.out.println("-------------------------------------------------------------------------------------------------");
		
	}
	
	public static void mainMenu() {
		System.out.println("Digite 1 para cadastrar um novo produto.");
		System.out.println("Digite 2 para ver todos os produtos.");
		System.out.println("Digite 3 para editar um produto.");
		System.out.println("Digite 4 para remover um produto.");
		System.out.println("Digite 5 para rever o menu.");
		System.out.println("Digite 6 para ver o menu de serviços de cliente.");
		System.out.println("Digite 7 para finalizar o processo");
	}
	
	public static void mainMenuSelections(int op, Scanner sc) {
		switch(op) {
		case 1:
			cadastrarProduto(sc);
			break;
		
		case 2:
			getAllProductInfo();
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
			System.out.println("Digite 1 para cadastrar um novo cliente.");
			System.out.println("Digite 2 para ver todos os clientes.");
			System.out.println("Digite 3 para editar um cliente.");
			System.out.println("Digite 4 para remover um cliente.");
			System.out.println("Digite 5 para voltar ao menu.");
			int operator = sc.nextInt();
				menuClientes(operator, sc);
			break;
		default:
			System.out.println("digito incorreto...");
			break;
		}

			
	}
	
	public static void menuClientes(int op, Scanner sc) {
		switch(op) {
		case 1:
			cadastrarCliente(sc);
			break;
		
		case 2:
			getAllClientInfo();
			break;
		
		case 3:
			//TODO editarCliente(sc);
			break;
		
		case 4:
			removerCliente(sc);
			break;
		
		case 5:
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
		
		listaNomesProdutos.add(nome);
		listaCodigoProdutos.add(codigoProd);
		if(disponibilidade == 1) {
			listaAtivoProdutos.add(true);
		}
		else {
			listaAtivoProdutos.add(false);
		}
		listaPrecoProdutos.add(price);
	
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
		
		listaNomesProdutos.set(index, nome);
		listaCodigoProdutos.set(index, codigoProd);
		if(disponibilidade == 1) {
			listaAtivoProdutos.set(index, true);
		}
		else {
			listaAtivoProdutos.set(index, false);
		}
		listaPrecoProdutos.set(index, price);
	
	}
	
	public static void removerProduto(Scanner sc) {
		System.out.print("Digite o index do produto a ser excluido: ");
			int index = sc.nextInt();
		
		listaNomesProdutos.remove(index);
		listaCodigoProdutos.remove(index);
		listaAtivoProdutos.remove(index);
		listaPrecoProdutos.remove(index);
		
		System.out.println("removido com sucesso!");
	}
	
	
	public static void cadastrarCliente(Scanner sc) {
		sc.nextLine();
		
		String nome, sexo, telefone, email, dataNasc;
		String endereco, enderecoA = null, enderecoB = null;
		byte tamanhoDasVariaveis;
		
		do {
			System.out.println("Nome do cliente: ");
			nome = sc.nextLine();
			
		} while(nome.length() < 6 || nome.length() > 60); 
		
		listaNomeClientes.add(nome);
		
		do {
			System.out.println("Sexo (F para feminino | M para masculino): ");
				sexo = sc.nextLine();
					sexo.toUpperCase();
					
		} while(sexo != "F" || sexo != "M");
		
		listaSexoClientes.add(sexo);
		
		do {
			System.out.println("Logradouro: ");
			endereco = sc.nextLine();
		
		} while(endereco.length() > 60);
		
		do {
			System.out.println("Numero: ");
				String numero = sc.nextLine();
			tamanhoDasVariaveis = (byte) numero.length();
			
			if(numero != null) {
				enderecoA = endereco.concat(", " + numero + ", ");
				
			}
			
			
		} while(tamanhoDasVariaveis > 4);
		
		do {
			System.out.println("Complemento: ");
				String complemento = sc.nextLine();
			tamanhoDasVariaveis = (byte) complemento.length();
			
			if(complemento != null) {
				enderecoB = enderecoA.concat(complemento + ", ");

			}
		
		} while(tamanhoDasVariaveis > 60);
		
		enderecoA = null;
		
		do {
			System.out.println("Bairro: ");
				String bairro = sc.nextLine();
			tamanhoDasVariaveis = (byte) bairro.length();
			enderecoA = enderecoB.concat(bairro + ", ");
		
		} while(tamanhoDasVariaveis > 60 || tamanhoDasVariaveis <= 0);
		
		enderecoB = null;
		
		do {
			System.out.println("Cidade: ");
				String cidade = sc.nextLine();
			tamanhoDasVariaveis = (byte) cidade.length();
			enderecoB = enderecoA.concat(cidade + ", ");
		
		} while(tamanhoDasVariaveis > 60 || tamanhoDasVariaveis <= 0);
		
		enderecoA = null;
		
		do {
			System.out.println("CEP: ");
				String cep = sc.nextLine();
			tamanhoDasVariaveis = (byte) cep.length();
			enderecoA = enderecoB.concat(cep + ", ");
		
		} while(tamanhoDasVariaveis != 8);
		
		enderecoB = null;
		
		do {
			System.out.println("Estado: ");
				String estado = sc.nextLine();
			tamanhoDasVariaveis = (byte) estado.length();
			enderecoB = enderecoA.concat(estado);
		
		} while(tamanhoDasVariaveis != 2);
		
		
		listaEnderecoClientes.add(enderecoB);
		
		do {
			System.out.println("telefone: ");
				telefone = sc.nextLine();
			tamanhoDasVariaveis = (byte) telefone.length();
		
		} while(tamanhoDasVariaveis != 11);
		
		listaTelefoneClientes.add(telefone);
		
		do {
			System.out.println("Email: ");
				email = sc.nextLine();
			tamanhoDasVariaveis = (byte) email.length();
		if(email.length() == 0) {
			listaEmailClientes.add(null);
		}
		} while(tamanhoDasVariaveis > 80);
		
		do {
			System.out.println("Data de nascimento (dd/MM/yyyy): ");
			dataNasc = sc.nextLine();
		}while(dataNasc.length() != 10);
		
		listaNascimentoClientes.add(dataNasc);
		
		int autorizacao;
		do {
			System.out.println("O cliente deseja estar na lista de mensagens? 1 para sim, 2 para nao");
				autorizacao = sc.nextInt();
				if(autorizacao == 1) {
					listaAutorizacaoClientes.add(true);
				}
				else if(autorizacao == 2) {
					listaAutorizacaoClientes.add(false);
				}
				else {
					
				}
			
		} while(autorizacao != 1 || autorizacao != 2);
		
	}
	
	
	public static void removerCliente(Scanner sc) {
		System.out.print("Digite o index do produto a ser excluido: ");
			int index = sc.nextInt();
		
		listaNomeClientes.remove(index);
		listaEnderecoClientes.remove(index);
		listaTelefoneClientes.remove(index);
		listaSexoClientes.remove(index);
		listaAutorizacaoClientes.remove(index);
		listaEmailClientes.remove(index);
		listaSexoClientes.remove(index);
		
		System.out.println("removido com sucesso!");
	}
	
	
	public static void getAllClientInfo() {
		for(int i = 0; i < listaNomeClientes.size(); i++) {
			System.out.println("index do cliente: " + i + "," + listaNomeClientes.get(i) + ", " + listaEnderecoClientes.get(i)+ ", " + listaTelefoneClientes.get(i)
			+ ", " + listaSexoClientes.get(i) + ", " + listaEmailClientes.get(i) + ", " + listaAutorizacaoClientes.get(i));
		}
	}
	
	
	public static void editarCliente(int index, Scanner sc) {
		sc.nextLine();
		
		String nome, sexo, telefone, email, dataNasc;
		String endereco, enderecoA = null, enderecoB = null;
		byte tamanhoDasVariaveis;
		
		do {
			System.out.println("Nome do cliente: ");
			nome = sc.nextLine();
			
		} while(nome.length() < 6 || nome.length() > 60); 
		
		
		do {
			System.out.println("Sexo (F para feminino | M para masculino): ");
				sexo = sc.nextLine();
					sexo.toUpperCase();
					
		} while(sexo != "F" || sexo != "M");
		
		listaSexoClientes.add(index, sexo);
		
		do {
			System.out.println("Logradouro: ");
			endereco = sc.nextLine();
		
		} while(endereco.length() > 60);
		
		do {
			System.out.println("Numero: ");
				String numero = sc.nextLine();
			tamanhoDasVariaveis = (byte) numero.length();
			
			if(numero != null) {
				enderecoA = endereco.concat(", " + numero + ", ");
				
			}
			
			
		} while(tamanhoDasVariaveis > 4);
		
		do {
			System.out.println("Complemento: ");
				String complemento = sc.nextLine();
			tamanhoDasVariaveis = (byte) complemento.length();
			
			if(complemento != null) {
				enderecoB = enderecoA.concat(complemento + ", ");

			}
		
		} while(tamanhoDasVariaveis > 60);
		
		enderecoA = null;
		
		do {
			System.out.println("Bairro: ");
				String bairro = sc.nextLine();
			tamanhoDasVariaveis = (byte) bairro.length();
			enderecoA = enderecoB.concat(bairro + ", ");
		
		} while(tamanhoDasVariaveis > 60 || tamanhoDasVariaveis <= 0);
		
		enderecoB = null;
		
		do {
			System.out.println("Cidade: ");
				String cidade = sc.nextLine();
			tamanhoDasVariaveis = (byte) cidade.length();
			enderecoB = enderecoA.concat(cidade + ", ");
		
		} while(tamanhoDasVariaveis > 60 || tamanhoDasVariaveis <= 0);
		
		enderecoA = null;
		
		do {
			System.out.println("CEP: ");
				String cep = sc.nextLine();
			tamanhoDasVariaveis = (byte) cep.length();
			enderecoA = enderecoB.concat(cep + ", ");
		
		} while(tamanhoDasVariaveis != 8);
		
		enderecoB = null;
		
		do {
			System.out.println("Estado: ");
				String estado = sc.nextLine();
			tamanhoDasVariaveis = (byte) estado.length();
			enderecoB = enderecoA.concat(estado);
		
		} while(tamanhoDasVariaveis != 2);
		
				
		do {
			System.out.println("telefone: ");
				telefone = sc.nextLine();
			tamanhoDasVariaveis = (byte) telefone.length();
		
		} while(tamanhoDasVariaveis != 11);
				
		do {
			System.out.println("Email: ");
				email = sc.nextLine();
			tamanhoDasVariaveis = (byte) email.length();
		} while(tamanhoDasVariaveis > 80);
		
		do {
			System.out.println("Data de nascimento (dd/MM/yyyy): ");
			dataNasc = sc.nextLine();
		}while(dataNasc.length() != 10);
		
		listaNascimentoClientes.add(dataNasc);
		
		int autorizacao;
		do {
			System.out.println("O cliente deseja estar na lista de mensagens? 1 para sim, 2 para nao");
				autorizacao = sc.nextInt();
			
		} while(autorizacao != 1 || autorizacao != 2);
		
		listaNomeClientes.add(index, nome);
		listaSexoClientes.add(index, sexo);
		listaEnderecoClientes.add(enderecoB);
		listaTelefoneClientes.add(telefone);
		if(email.length() == 0) {
			listaEmailClientes.add(null);
		}
		else {
		listaEmailClientes.add(index, email);
		}
		listaNascimentoClientes.add(index, dataNasc);
		if(autorizacao == 1) {
			listaAutorizacaoClientes.add(true);
		}
		else if(autorizacao == 2) {
			listaAutorizacaoClientes.add(false);
		}

		
	}
	
	
}
