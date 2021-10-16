/*
 * Registrar produtos
 */
package sistemademercado;

import java.util.ArrayList;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Produto {
    // Atributos
    private ArrayList <String> produto = new ArrayList<>();
    private int [] quantidadeDeProdutos;
    
    // Métodos Personalizados
    public void addProduto(String produto, int quantidade){
        this.setProduto(); // não sei o que fazer p/ add em uma array
        this.quantidadeDeProdutos.push(quantidade);
    }
    
    // Métodos

    public String[] getProduto() {
        return produto;
    }

    public void setProduto(String[] produto) {
        this.produto = produto;
    }

    public int[] getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int[] quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }
    
}
