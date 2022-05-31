import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ApelidosTop extends JFrame {
	private JLabel imagemGirafa;
	private JLabel textoGirafa;
	private JLabel placarGirafa;
	
	private JLabel imagemVarejao;
	private JLabel textoVarejao;
	private JLabel placarVarejao;
	
	private JButton votarGirafa;
	private JButton votarVarejao;
	private JButton finalizarVotacao;
	
	private OuvidoDaVotacao ouvidoDoVarejao, ouvidoDaGirafa;
	
	public ApelidosTop() {
		super("Apelidos Top");
		
		prepararJanela();
		
		organizarComponentes();
		
		organizarEventos();
		
		setVisible(true);
	}

	private void organizarEventos() {
		ouvidoDoVarejao = new OuvidoDaVotacao(placarVarejao);
		ouvidoDaGirafa = new OuvidoDaVotacao(placarGirafa);
		
		votarVarejao.addActionListener(ouvidoDoVarejao);
		votarGirafa.addActionListener(ouvidoDaGirafa);

		/*
			finalizarVotacao.addActionListener(
			new ActionListener(){ // estou dizendo o comportamento do actionPerformed

				@Override
				public void actionPerformed(ActionEvent e) {
					placarVarejao.setText("0");
					placarGirafa.setText("0");
					
				}
			}
		);

		Para implementação de uma interface que tem um argumento
		*/

		// comportamento quando você clina no botão resetar
		finalizarVotacao.addActionListener(
			(e) -> {
					placarVarejao.setText("0");
					placarGirafa.setText("0");
				}
		);
	}
	
	private void organizarComponentes() {
		imagemGirafa = new JLabel(new ImageIcon("/home/samuel/Downloads/girafa.png"));
		imagemVarejao = new JLabel(new ImageIcon("/home/samuel/Downloads/varejao.png"));
		textoGirafa = new JLabel("Girafa");
		textoVarejao = new JLabel("Varejão");
		placarGirafa = new JLabel("0");
		placarVarejao = new JLabel("0");
		votarGirafa = new JButton("Votar Girafa");
		votarVarejao = new JButton("Votar Varejão");
		finalizarVotacao = new JButton("Reiniciar");
		
		add(imagemVarejao);
		add(textoVarejao);
		add(votarVarejao);
		add(imagemGirafa);
		add(textoGirafa);
		add(votarGirafa);
		add(placarVarejao);
		add(placarGirafa);
		add(finalizarVotacao);
		
	}

	private void prepararJanela() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
	}
}