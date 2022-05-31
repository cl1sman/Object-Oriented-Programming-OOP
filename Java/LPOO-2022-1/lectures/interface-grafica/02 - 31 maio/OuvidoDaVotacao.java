import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class OuvidoDaVotacao implements ActionListener {
	
	private JLabel placarLabel;
	
	public OuvidoDaVotacao(JLabel placar) {
		this.placarLabel = placar;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String placarAtual = placarLabel.getText();
		int placar = Integer.parseInt(placarAtual);
		placar++;
		placarLabel.setText(placar + "");
	}

}
