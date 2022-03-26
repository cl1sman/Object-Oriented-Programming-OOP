/**
 * Estudo de visibilidade.
 * 
 *  class: Caneta
 *  atributos:
 *      + modelo
 *      + cor
 *      - pont
 *      # carga
 *      # tampada
 *  metodos:
 *      + escrever()
 *      + rabiscar()
 *      + pintar()
 *      - tampar()
 *      - destampar()
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
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; // da erro, porque o atributo esta com visibilidade: private
        // não vou conseguir mexer na ponta porque ela é 'private'
        c1.carga = 80;/** Por que eu posso?.
                        * Ele vai deixar mexer, porque estou dentro de uma 
                        * classe, que esta utilizando a classe caneta
                        * estou: dentro de class Aula02, tenho um metodo princi-
                        * pal 'main' que esta utilizando o objeto da class Caneta
                        * estou dentro de uma classe, que esta usando a classe
                        * caneta
                        */
        // c1.tampada = true; // posso, por estar em uma class que usa a class
        // mudando tampada para 'private'
        /**
         * Mudando os metodos tampar() e destampar() para publico
         * Eles, que estão dentro da classe Caneta podem alterar o atributo
         * 'tampada', porque ele esta dentro da classe
         */
        c1.tampar(); 
        /**
         * Usando o metodo tampar() {public}, vai mudar o atributo
         * tampada {private}, porque esta dentro da classe, e ele pode fazer
         * isso.
         */
        
        /**
         * Exemplo do mercado:
         * Você não tem acesso ao caixa, apenas o operador do caixa. Então, meu
         * acesso ao operador é publico, mas meu acesso ao caixa é privado.
         * Se quiser mexer no caixa, é atravez do operador, e o operado fará
         * as modificações
         * 
         * Você não pode mexer no caixa, mas o operador pode, então da o dinhe-
         * iro ao operador, que ele vai mexer no caixa e lhe devolver o troco.
         */
        
        c1.status();
        
    }
    
}
