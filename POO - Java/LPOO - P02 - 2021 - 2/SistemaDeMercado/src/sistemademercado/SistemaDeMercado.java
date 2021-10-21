/*
 * III. Sistema de mercado (produtos, descontos, funcionários,... 
 * Ações como registrar produtos, debitar de estoque, ...)
 */
package sistemademercado;


import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class SistemaDeMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vector<Produto> vetor = new Vector<Produto>();

        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            String products = scan.next();
            Produto produto1 = new Produto(products);
            vetor.add(produto1);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(vetor.get(i).getProduto());
        }
//        float soma;
//        soma = ((produto1.getQuantidadeDeProdutos() * produto1.getPreço()) + (produto2.getQuantidadeDeProdutos() * produto2.getPreço())); 

    
    }
}