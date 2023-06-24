package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelAtualizar  extends JPanel {

	public PainelAtualizar() {
		  criarFormularioAtualizar();
		  this.setBackground(Color.LIGHT_GRAY);
		}

		private void criarFormularioAtualizar() {

			
			JLabel matricula  = new JLabel("Matricula");
			JTextField caixamatricula= new JTextField(8);
			
			JLabel vertente  = new JLabel("Vertente");
			JTextField caixaVertente= new JTextField(8);
			
			Botao batualizar = new Botao("Atualizar", Color.blue);
			
			this.setLayout(new GridLayout(3,2));

			this.add(matricula);
			this.add(caixamatricula);
			this.add(vertente);
			this.add(caixaVertente);
			this.add(batualizar);
			
	
		}
}
