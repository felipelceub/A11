package av4;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import javax.swing.JTextArea;

public class MenuPrincipal{
public MenuPrincipal() {

		JFrame principal = new JFrame("Sistema Pessoa");
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(500, 400);

        new MenuBar(principal);
        new Rodape(principal);
        
        JTextArea areaTrabalho = new JTextArea();

        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);

        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
}