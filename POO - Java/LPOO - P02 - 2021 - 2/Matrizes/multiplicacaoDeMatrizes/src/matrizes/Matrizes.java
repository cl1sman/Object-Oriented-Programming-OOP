package matrizes;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Matriz A
        int linha = 2;
        int coluna = 2;
        int[][] matrizA = new int[linha][coluna];

        // Matriz B
        int linha2 = 2;
        int coluna2 = 2;
        int[][] matrizB = new int[linha2][coluna2];

        // Preencher os valores das matrizes A e B
        // É necessario percorrer e armazenar os dados
        // primeiro laço vai percorrer o total de linhas da matrizA
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                System.out.print("Digite um valor da MatrizA: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("");

        for (int i = 0; i < linha2; i++){
            for (int j = 0; j < coluna2; j++){
                System.out.print("Digite um valor da MatrizB: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }
        // Imprimir Matriz A
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        // Imprimir Matriz B
        for (int i = 0; i < linha2; i++){
            for (int j = 0; j < coluna2; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        // Condicional, se é possivel multiplicar as matrizes (só é, qndo nº de linhas é = nº de colunas)
        if (matrizA[0].length == matrizB.length){
            // Matriz resultante. Ela resulta do total de linhas da matriz A, com o total de colunas da matriz B
            // Quem esta definindo o total de linhas da matriz A? [linha]. Quem esta definindo o total de colunas da
            // matriz B? [coluna2].
            int[][] matrizC = new int[linha][coluna2];
            // recebendo os valores da multiplicação da matriz A com a matriz B
            for (int i = 0; i < linha; i++){ // lê as linhas da matriz resultante. quem define o total de linhas da matriz
                                          // resultante? linha.
                for (int j = 0; j < coluna2; j++){ // quem define o total de colunas da matriz resultante? coluna2
                    for (int k = 0; k < linha2; k++){ // ajuda a percorrer as posições das linhas e colunas das matrizes A e B
                                                      // vai até o total de linhas da matriz B, logo linha2
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }

                }

            }
            // Imprimir a Matriz C. Com a variavel linha, e coluna2 (pois são suas definições)
            for (int i = 0; i < linha; i++){
                for (int j = 0; j < coluna2; j++){
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println("");
            }
        }else {
            System.out.println("Não é possível realizar a multiplicação");
        }
    }
}
