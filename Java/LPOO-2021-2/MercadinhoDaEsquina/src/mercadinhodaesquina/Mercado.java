/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhodaesquina;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Descontos {
    private float descontoDez;
    
    public float desconto(float item){
        return this.descontoDez = item * 0.1f;
    }
}
