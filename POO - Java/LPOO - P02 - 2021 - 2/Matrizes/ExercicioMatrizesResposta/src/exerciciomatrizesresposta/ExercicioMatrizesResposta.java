/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciomatrizesresposta;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class ExercicioMatrizesResposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] valores1 = {{-1,0,0},{0,-1,0},{0,0,-1}};
        double [][] valores2 = {{1,2,3},{4,5,6},{7,8,9}};
        Matriz A = new Matriz(valores2);
        Matriz B = new Matriz(valores1);
        A.multiplicaMatriz(B).imprimeMatriz();
    }
    
}
