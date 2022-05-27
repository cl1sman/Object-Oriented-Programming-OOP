import javax.swing.JFrame;

public class ApelidosTop extends JFrame{
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
        setLayout(); // o estilista da tela. é um objeto que precisa passar.
    }
}
