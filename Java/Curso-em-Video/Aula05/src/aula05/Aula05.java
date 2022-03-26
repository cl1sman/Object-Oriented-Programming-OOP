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
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco Jubileu = new ContaBanco();
        Jubileu.abrirConta("cp");
        Jubileu.setDono("Jubileu");
        Jubileu.depositar(300);
        Jubileu.imprimir();
        
        ContaBanco Cleusa = new ContaBanco();
        Cleusa.abrirConta("cc");
        Cleusa.setDono("Cleusa");
        Cleusa.depositar(500);
        Cleusa.sacar(100);
        Cleusa.imprimir();
    }
    
}
