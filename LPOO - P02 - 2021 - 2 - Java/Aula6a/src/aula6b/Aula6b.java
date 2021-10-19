/*
 * Progama Principal
 * Encapsulamento em Java
 * 
 * Implementação de um controle Remoto
 */
package aula6b;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Aula6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
