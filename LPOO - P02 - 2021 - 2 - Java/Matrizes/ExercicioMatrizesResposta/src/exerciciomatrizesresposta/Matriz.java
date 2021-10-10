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
public class Matriz {
    public double M[][];
    public int n, m;
    
    
    private void copiaMatriz(double [][] valores){
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                M[i][j] = valores[i][j];
    }
    
    Matriz(double [][] valores){
        n = valores.length;
        m = valores[0].length;
        M = new double[n][m];
        copiaMatriz(valores);
    }
    
    Matriz(int n_, int m_){
        this.n = n_;
        this.m = m_;
        
        M = new double[n][m];
        
        for(int i = 0; i < n; i ++)
            for(int j = 0; j < m; j++)
                M[i][j] = 0.0;
    }
    
    Matriz somaMatriz(Matriz B){
        if(B.n != n || B.m != m)
            return null;
        
        Matriz C = new Matriz(n, m);
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                C.M[i][j] = this.M[i][j] + B.M[i][j];
        
        return C;
    }
    
    Matriz multiplicaMatriz(Matriz B){
        // a, b x b, c = a, c
        if(m != B.n)
            return null;
        
        int c_n = n;
        int c_m = B.m;
        
        Matriz C = new Matriz(c_n, c_m);
        for(int i = 0; i < c_n; i++)
            for(int j = 0; j < c_m; j++){
                C.M[i][j] = 0;
                for(int k = 0; k < m; k++)
                    C.M[i][j] += M[i][k] * B.M[k][j];
            }
        return C;
    }
    
    Boolean ehQuadrada(){
        return n == m;
    }
    
    void imprimeMatriz(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }
}