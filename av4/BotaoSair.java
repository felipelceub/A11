package av4;

import javax.swing.JMenu;

public class BotaoSair{
    static JMenu menuSair = new JMenu("Sair");

	public static JMenu botaoSair() {
		menuSair.addMenuListener(new javax.swing.event.MenuListener() {
			@Override
	        public void menuSelected(javax.swing.event.MenuEvent e) {
	        		System.exit(0);
	        }
	        @Override public void menuDeselected(javax.swing.event.MenuEvent e) {
	        	
	        }
	        @Override public void menuCanceled(javax.swing.event.MenuEvent e) {}
	    });
		return menuSair;
	}
}