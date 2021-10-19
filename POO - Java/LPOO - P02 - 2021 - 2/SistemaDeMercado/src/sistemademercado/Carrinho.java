/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemademercado;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Carrinho {
    private String carrinho;
    private float soma;
    
    public String getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(String carrinho) {
        this.carrinho = carrinho;
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma += soma;
    }
    
    
}