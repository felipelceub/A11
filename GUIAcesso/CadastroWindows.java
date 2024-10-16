package model;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroWindows {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Exemplo de Botão Confirmar");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JButton btnConfirmar = new JButton("Clique aqui para confirmar");
		btnConfirmar.setBounds(135, 210, 200, 30); // Define a posição e o tamanho do botão
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão clicado!");
			}
		});
		
		frame.add(btnConfirmar);
		
		frame.setVisible(true);
		}
}
