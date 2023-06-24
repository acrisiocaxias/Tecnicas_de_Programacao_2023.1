package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelListar extends JPanel{
	
	public PainelListar() {
		  criarFormularioListar();
		  this.setBackground(Color.gray);
		}
	


	private void criarFormularioListar() {
		
		
		JTextField listar = new JTextField(50);

		
	
		
			
		
		this.add(listar);
		
	}

}
