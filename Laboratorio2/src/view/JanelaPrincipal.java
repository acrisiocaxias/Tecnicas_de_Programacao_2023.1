package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JanelaPrincipal  extends JFrame{

	private JPanel painelPrincipal;
	
	public PainelCadastrar painelCadastrar;
	public JPanel painelListar;
	public JPanel painelAtualizar;
	public JPanel painelDeletar;
	
	public JanelaPrincipal() {
		
		painelCadastrar = new PainelCadastrar();
		
		
		painelListar = new PainelListar();
		
		
		painelAtualizar = new PainelAtualizar();
		
		
		painelDeletar = new PainelDeletar();
		
		
		
		this.setSize(600, 400);
		this.setBackground(Color.LIGHT_GRAY);
		
        PainelBotoes painelBotoes = new PainelBotoes(this); 
		
//		JButton b = new JButton("cadastrar");
//		b.addActionListener(new mostrarCadastro());
//		
		

		painelPrincipal = new JPanel();
		painelPrincipal.setBackground(Color.BLACK);
		painelPrincipal.setVisible(false);

		this.add(painelBotoes, BorderLayout.NORTH);

		
//		this.add(painelPrincipal, BorderLayout.CENTER);
		painelCadastrar.setVisible(false);
		painelListar.setVisible(false);
		painelAtualizar.setVisible(false);
		painelDeletar.setVisible(false);
		JPanel painelGenerico = new JPanel();
		painelGenerico.add(painelCadastrar);
		painelGenerico.add(painelListar);
		painelGenerico.add(painelAtualizar);
		painelGenerico.add(painelDeletar);
		
		this.add(painelGenerico, BorderLayout.CENTER);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}
