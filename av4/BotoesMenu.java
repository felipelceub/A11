package av4;

import javax.swing.JMenu;

public class BotoesMenu{
	
	
    static JMenu menuSair = new JMenu("Sair");
    
	public static JMenu botaoCadastro() {
		return BotaoCadastro.cadastrar(menuSair);
	}
	
	public static JMenu botaoVisualizacaoOutter() {
		return BotaoVisualizacao.botaoVisualizacaoInner(menuSair);
	}
	
	public static JMenu botaoSair(){
		return BotaoSair.botaoSair();
	}
	
}