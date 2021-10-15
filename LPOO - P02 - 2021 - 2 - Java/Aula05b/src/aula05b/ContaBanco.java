/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05b;

/**
 *
 * @author Gustavo Guanabara - Curso em video
 */
public class ContaBanco {
    // ---------- Atributo -------------------
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // -------------------- Métodos Personalizados ---------------------------
    public void estadoAtual(){
        System.out.println("-------------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50);
        } else if(t == "cp"){
            this.setSaldo(150);
        }
        System.out.println(this.getDono() + " Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem saldo");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.isStatus()){ // se o argumento for verdadeiro. ou status: true
            // this.saldo = this.saldo + v; aqui mexe diretamente nos atributos
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
             System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.isStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if(this.getTipo() == "cp"){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    
    // -------------------- Métodos Especiais ----------------------------
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta(){
        return numConta;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() { // quando booleano is e não get
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
