/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Caneta {
    // Atributos
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    // Método Construtor (construct)
    public Caneta(String m, String c, float p){ // dando o mesmo nome da classe
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
        
        // assim que instanciar, criar uma caneta ela
        // estará tampada e será azul
    }
    
    // #### Getters and Setters
    public String getModelo(){ // não pode ser void, pois retorna uma string
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){ // void não retorna nada
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampada(){
        return this.tampada; // como vai retornar, não pode ser void, mas seguir
                             // o tipo do atributo
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    // Métodos
    public void status(){
        System.out.println("### CANETA ###");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
