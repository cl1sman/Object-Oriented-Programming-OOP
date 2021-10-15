/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // ----- Método Construtor -----
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    // Getters and Setters
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    
    // ----------------- Métodos -----------------------
    public void abrirConta(){
        // code
    }
    public void fecharConta(){
        // code
    }
    public void depositar(){
        // code
    }
    public void sacar(){
        // code
    }
    public void pagarMensal(){
        // code
    }
}