package av4;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;

public class BotaoVisualizacao{

	static JMenu menuVisualizacao = new JMenu("Visualização");

	public static JMenu botaoVisualizacaoInner(JMenu menuSair) {
		menuVisualizacao.addMenuListener(new javax.swing.event.MenuListener() {
	        
			@Override
	        public void menuSelected(javax.swing.event.MenuEvent e) {
	        		menuSair.setEnabled(false);
	        }

	        
			@Override
			public void menuDeselected(MenuEvent e) {
				menuSair.setEnabled(true);
			}

	        
			@Override
			public void menuCanceled(MenuEvent e) {
				menuSair.setEnabled(true);
			}
	    });
		
		JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
	    JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
	    menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
	    menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);
	    return menuVisualizacao;
	}
}