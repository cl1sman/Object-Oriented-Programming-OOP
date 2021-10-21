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
    public Produto(){

    }
    public Produto(String produto){
        this.setProduto(produto);
    }
    public Produto(String produto, int quantidade, float price) {
        this.setProduto(produto);
        this.setQuantidadeDeProdutos(quantidade);
        this.setPreço(price);
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