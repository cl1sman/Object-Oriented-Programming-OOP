import java.util.Scanner;

public class multMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para printar

        int linha = 2;
        int coluna = 2;
        int[][] matrizA = new int[linha][coluna];

        int linha2 = 2;
        int coluna2 = 2;
        int[][] matrizB = new int[linha2][coluna2];

        // preencher os valores das matrizes
        // o 1° laço for percorre o total de linhas da matrizA
        // quem define o total de linhas da matrizA é a var linha
        for (int i = 0; i < linha; i++) {
            // 2° laço, percorrer as colunas da matrizA
            for (int j = 0; j < coluna; j++) {
                System.out.print("Digite um valor da Matriz A: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        System.out.println("");

        // preencher os valores das matrizes
        // o 1° laço for percorre o total de linhas da matrizB
        // quem define o total de linhas da matrizB é a var linha2
        for (int i = 0; i < linha2; i++) {
            // 2° laço, percorrer as colunas da matrizB
            // quem define o total de colunas da matrizB é coluna2
            for (int j = 0; j < coluna2; j++) {
                System.out.print("Digite um valor da Matriz B: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < coluna2; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }

        // verificando o se é possível realiar a operação
        if (matrizA.length == matrizB[0].length) { // pode estar errado
            int[][] matrizC = new int[linha][coluna2];
            // Matriz C

            // percorrendo as linhas
            for (int i = 0; i < linha; i++) { // quem define o total de linhas da matriz resultante? var: linha
                //percorrendo as colunas
                for (int j = 0; j < coluna2; j++) {
                    // for auxiliar que nos ajuda a percorrer as linhas e colunas das matrizes A e B
                    for (int k = 0; k < linha2; k++) { // total de linhas da matriz B
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }

            }
            System.out.println("");
            // print
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna2; j++) {
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println("");
            }
        }else {
            System.out.println("Não é possível realizar a multiplicação");
        }
    }
}