/*
 * Registrar produtos
 */
package sistemademercado;


/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Produto {
    // Atributos
    private String produto;
    private int quantidadeDeProdutos;
    private float preço;


    // Construct
    public Produto() {
        this.setProduto("produto");
        this.setQuantidadeDeProdutos(0);
        this.setPreço(0.0f);
    }
    
    // Métodos Personalizados
    public void addProduto(String produto, int quantidade, float preço){
        this.setProduto(produto);
        this.setQuantidadeDeProdutos(quantidade);
        this.setPreço(preço);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }
    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }    
    
}