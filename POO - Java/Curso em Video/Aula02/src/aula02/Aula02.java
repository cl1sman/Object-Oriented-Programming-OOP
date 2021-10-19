/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Cl1sman
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanciando (gerando um objeto, a partir de uma Classe)
        Caneta c1 = new Caneta(); // Classe Caneta, objeto c1
        
        // mexendo nos atributos
        c1.modelo = "Pentel";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false; // referencia a atributo
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
//         // Referencia a metodo
//        c1.tampar();
//        c1.rabiscar();
//        // chamando o metodo status
//        c1.status();
//        
//        c1.destampar();
//        c1.rabiscar();
//        c1.status();
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
    }
    
}
