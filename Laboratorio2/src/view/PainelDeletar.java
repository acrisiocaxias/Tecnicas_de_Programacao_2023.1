package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelDeletar extends JPanel{
	public PainelDeletar() {
		  criarFormularioDeletar();
		  this.setBackground(Color.LIGHT_GRAY);
		}

	private void criarFormularioDeletar() {
		
	
			

			
			JLabel matricula  = new JLabel("Matricula");
			JTextField caixamatricula= new JTextField(8);
			
			
			Botao bdeletar = new Botao("Deletar", Color.RED);
			
			this.setLayout(new GridLayout(2,2));
			
	
			this.add(matricula);
			this.add(caixamatricula);

			this.add(bdeletar);
			
			
			
			
		
		
	}
}
