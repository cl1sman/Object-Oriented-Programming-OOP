package test;

import java.util.Scanner;

class ProdutoTest{
    private String nomeDoProduto;
    private int quantidadeDeProduto;

    ProdutoTest(){

    }
    ProdutoTest(int n){
        quantidadeDeProduto = n;
    }
    void addProdutoTest(String nome, int numero){
        this.nomeDoProduto = nome;
        this.quantidadeDeProduto = numero;
    }
}


public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        ProdutoTest[] vetorDeProdutos = new ProdutoTest[3];

        ProdutoTest p1 = new ProdutoTest();
        p1.addProdutoTest("Macarrão", 2);

        ProdutoTest p2 = new ProdutoTest();
        p2.addProdutoTest("Mortadela", 1);

        ProdutoTest p3 = new ProdutoTest();
        p3.addProdutoTest("Uva", 45);

        vetorDeProdutos[0] = p1;
        vetorDeProdutos[1] = p2;
        vetorDeProdutos[2] = p3;

    }
}