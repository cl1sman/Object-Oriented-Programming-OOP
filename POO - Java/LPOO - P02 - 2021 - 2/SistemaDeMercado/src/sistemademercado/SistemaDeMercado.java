/*
 * III. Sistema de mercado (produtos, descontos, funcionários,... 
 * Ações como registrar produtos, debitar de estoque, ...)
 */
package sistemademercado;


import java.util.Scanner;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class SistemaDeMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto p1 = new Produto();
        p1.addProduto("Macarrão", 2, 3.45f);
        System.out.println(p1.getProduto());
        System.out.println(p1.getQuantidadeDeProdutos());
        System.out.println(p1.getPreço());

        Produto[] vetorTeste = new Produto[1];
        vetorTeste[0] = p1;
        System.out.println(vetorTeste[0].getProduto());

//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        Produto p1 = new Produto(n); // objeto
//
//        for (int i = 0; i < n; i++) {
//            String a = scan.next();
//            int b = scan.nextInt();
//            float c = scan.nextFloat();
//            p1.addProduto(a, b, c);
//            vetorDeProdutos[i] = p1;
//
            /**
             * vetorDeProdutos = new Produto[n];
             * Scanner scan = new Scanner(System.in);
             *
             *         for (int i = 0; i < n; i++) {
             *             String a = scan.next();
             *             int b = scan.nextInt();
             *             float c = scan.nextFloat();
             *
             *             Produto pro = new Produto(a, b, c);
             *             vetorDeProdutos[i] = pro;
             */


        }


//        Vector<Produto> vetor = new Vector<Produto>();
//
//        for (int i = 0; i < 3; i++) {
//            Scanner scan = new Scanner(System.in);
//            String products = scan.next();
//            Produto produto1 = new Produto(products);
//            vetor.add(produto1);
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(vetor.get(i).getProduto());
//        }
////        float soma;
////        soma = ((produto1.getQuantidadeDeProdutos() * produto1.getPreço()) + (produto2.getQuantidadeDeProdutos() * produto2.getPreço()));
}