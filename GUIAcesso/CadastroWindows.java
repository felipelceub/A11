package model;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CadastroWindows extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JLabel nameLabel = new JLabel("Usuário: ");
		nameLabel.setSize(100, 30);
		nameLabel.setLocation(160, 0);
		JTextField nameField = new JTextField();
		nameField.setLocation(160, 30);
		nameField.setSize(150, 25);
		
		JLabel passwordLabel = new JLabel("Senha: ");
		passwordLabel.setSize(100, 30);
		passwordLabel.setLocation(160, 60);
		JTextField passwordField = new JTextField();
		passwordField.setLocation(160, 90);
		passwordField.setSize(150, 25);
		
		JFrame frame = new JFrame("Login");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JButton btnConfirmar = new JButton("Clique aqui para confirmar");
		btnConfirmar.setBounds(135, 210, 200, 30);
		
		JButton btnCancelar = new JButton("Clique aqui para cancelar");
		btnCancelar.setBounds(135, 170, 200, 30);
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nameField.getText().equals("denys.silva") && passwordField.getText().equals("Teste@2024")) {
					JOptionPane.showMessageDialog(null, "Acesso permitido");
				}
				else {
					JOptionPane.showMessageDialog(null, "Acesso negado");
				}
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		
		frame.add(nameLabel);
		frame.add(nameField);
		frame.add(passwordLabel);
		frame.add(passwordField);
		frame.add(btnConfirmar);
		frame.add(btnCancelar);
		
		
		nameLabel.setVisible(true);
		frame.setVisible(true);
		}
}
