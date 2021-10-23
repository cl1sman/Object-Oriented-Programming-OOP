/*
 * Registrar produtos
 */
package sistemademercado;


import java.util.Scanner;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Produto {
    // Atributos
    private String produto;
    private int quantidadeDeProdutos;
    private float preço;
    Produto[] vetorDeProdutos;


    // Construct
    public Produto(){

    }
    public Produto(int n){
        vetorDeProdutos = new Produto[n]; // limite do vetor
    }


    // Métodos Personalizados
    public void addProduto(String a, int b, float c){
        this.setProduto(a);
        this.setQuantidadeDeProdutos(b);
        this.setPreço(c);
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