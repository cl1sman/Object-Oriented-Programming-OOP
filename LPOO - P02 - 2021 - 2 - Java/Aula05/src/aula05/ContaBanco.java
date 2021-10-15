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
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
                
        if(tipo == "cp"){
            setSaldo(getSaldo() + 150.0f);
        }
        if(tipo == "cc"){
            setSaldo(getSaldo() + 50.0f);
        }
        
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro!");
        }else if(saldo < 0){
            System.out.println("Conta em débito!");
        }else{
            setStatus(false);
        }
    }
    public void depositar(float valor){
        if(getStatus() == true){
            setSaldo(getSaldo() + valor);
        }else{
            System.out.println("Impossível depositar");
        }
    }
    public void sacar(float valor){
        if(getStatus() == true){
            if(getSaldo() > 0){
                setSaldo(getSaldo() - valor); // uma forma mais elegante
                // this.saldo -= valor; não é bom usar assim
            }else{
                System.out.println("Saldo insuficiente!");
            }            
        }else{ // se a conta ñ está aberta é impossivel sacar
            System.out.println("Impossivel sacar!");
        }
    }
    public void pagarMensal(){
        int tarifa = 0;
        if(getTipo() == "cc"){
            tarifa = 12;
        }else if(getTipo() == "cp"){
            tarifa = 20;
        }
        
        if(getStatus() == true){
            if(getSaldo() > tarifa){
                setSaldo(getSaldo() - tarifa);
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível pagar");
        }
    }
    
    // ---------------------------- Print -------------------------------
    public void imprimir(){
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("");
    }
}