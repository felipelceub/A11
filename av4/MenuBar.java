package av4;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;


public class MenuBar{
	
	
	public MenuBar(JFrame principal) {
	JMenuBar menuPrincipal = new JMenuBar();

    menuPrincipal.add(BotoesMenu.botaoCadastro());
    menuPrincipal.add(BotoesMenu.botaoVisualizacaoOutter());
    menuPrincipal.add(BotoesMenu.botaoSair());

    
    /*JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
    JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
    menuCadastro.add(itemMenuCadastroUsuarios);
    menuCadastro.add(itemMenuCadastroPessoas);*/

    
    /*JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
    JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
    menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
    menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);*/
    
    principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
    
	}
}