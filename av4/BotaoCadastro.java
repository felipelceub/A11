package av4;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;

public class BotaoCadastro{
	
	static JMenu menuCadastro = new JMenu("Cadastro");

	public static JMenu cadastrar(JMenu menuSair){
		
		menuCadastro.addMenuListener(new javax.swing.event.MenuListener() {
	   
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
		
		JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
	    JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
	    menuCadastro.add(itemMenuCadastroUsuarios);
	    menuCadastro.add(itemMenuCadastroPessoas);
	    
	    return menuCadastro;
	}
}