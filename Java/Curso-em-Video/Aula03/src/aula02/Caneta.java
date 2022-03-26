/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author mathe
 */
public class Caneta {
    // Atributos (ou caracteristicas)
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    // Metodos( ou ações, funções)
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor); 
                                        // this. é autoreferencia,
                                        // quem chamou o metodo vai ser substi-
                                        // tuido por this. this é uma propria
                                        // referencia ao metodo que o chamou.
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO: Não posso rabiscar");
            System.out.println("");
        } else {
            System.out.println("Estou Rabiscando");
            System.out.println("");
        }
    }
    
    public void tampar(){
        this.tampada = true; // ele pode mexer no atributo tampada
    }
    
    public void destampar(){
        this.tampada = false; // ele pode mexer no atributo tampada
        /**
         * Com isso, para mexer no atributo tampada{que esta como private}, uso
         * um metodo publico, e ele fará a modificação no atributo que esta
         * privado
         */
    }
    // Fim dos metodos
}