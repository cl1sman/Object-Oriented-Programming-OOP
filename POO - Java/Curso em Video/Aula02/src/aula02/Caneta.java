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
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // Metodos( ou ações, funções)
    void status(){
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
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO: Não posso rabiscar");
            System.out.println("");
        } else {
            System.out.println("Estou Rabiscando");
            System.out.println("");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    // Fim dos metodos
}