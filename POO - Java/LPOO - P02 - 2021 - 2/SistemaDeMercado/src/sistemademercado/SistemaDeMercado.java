/*
 * III. Sistema de mercado (produtos, descontos, funcionários,... 
 * Ações como registrar produtos, debitar de estoque, ...)
 */
package sistemademercado;


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

        Produto produto1 = new Produto();
        produto1.addProduto("Tomate", 2, 5.1f);
        
        Produto produto2 = new Produto();
        produto2.addProduto("Carvão", 1, 10.5f);
        
        Produto produto3 = new Produto();
        produto3.addProduto("Feijão", 3, 8.53f);
        
        Produto produto4 = new Produto();
        produto4.addProduto("Macarrão", 5, 2.5f);
        
//        float soma;
//        soma = ((produto1.getQuantidadeDeProdutos() * produto1.getPreço()) + (produto2.getQuantidadeDeProdutos() * produto2.getPreço())); 

    
    }
}