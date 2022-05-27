import javax.swing.JFrame;
import java.awt.FlowLayout;

public class ApelidosTop extends JFrame{
    private JLabel imagemGirafa;
    private JLabel textoGirafa;
    private JLabel placarGirafa;

    private JLabel imagemVarejao;
    private JLabel 

    public ApelidosTop(){
        super("Titulo da janela");

        /**
         * prepararJenela();
         * organizarComponentes();
         * organizarEventos();
         * exibirJanela();
         */
    }

    private void prepararJanela() {
        setSize(800, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(FlowLayout); // o estilista da tela. é um objeto que precisa passar.
    }

    
}
