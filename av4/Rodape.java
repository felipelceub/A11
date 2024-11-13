package av4;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rodape{
	public Rodape(JFrame principal) {
		JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel("Versão: " + ConfiguracoesSistema.VERSAO_SISTEMA +
                " | Usuário: " + ConfiguracoesSistema.NOME_USUARIO +
                " | Data de acesso: " + ConfiguracoesSistema.DATA_ACESSO);
        painelRodape.add(labelRodape);
        
        
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);
        
	}
}