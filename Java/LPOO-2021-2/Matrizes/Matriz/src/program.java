class Matriz {
    int n;
    int m;

    double [][] M;


    Matriz(double [][] valores){
        copiaMatriz(valores);

        n = valores.length;
        m = pegaTamanhoDoSegundoArray(valores);
    }

    Matriz(int n_, int m_){
        n = n_;
        m = m_;

        double[][] x = new double[n][m];

        for (int i = 0; i < x.length; i++) {
            double[] ds = x[i];
            for (int j = 0; j < ds.length; j++) {
                ds[j] = 0;
            }

            x[i] = ds;
        }

    }

    Matriz somaMatriz(Matriz b) {
        try {

            // percorre a linhas
            int t =  pegaTamanhoDoSegundoArray(M);
            double [][] lr = new double[M.length][t];
            for(int i = 0; i < M.length; i++) {
                double[] di = M[i];
                double [] bi = b.M[i];

                // percorre as colunas
                double [] cr = new double[di.length];
                for(int j = 0; j < di.length; j++) {
                    double dj = di[j];
                    double bj = bi[j];

                    double dbj = dj + bj;
                    cr[j] = dbj;
                }

                lr[i] = cr;
            }

            return new Matriz(lr);
        } catch (Exception e) {
            return null;
        }
    }

    int pegaTamanhoDoSegundoArray(double [][] m) {
        int r = 0;

        if(m.length > 0) {
            r = m[1].length;
        }

        return r;
    }


    Matriz multiplicaMatriz(Matriz b) {
        try {
//            int result = 0;
//            // percorre a linhas
//            int t =  pegaTamanhoDoSegundoArray(M);
//            double [][] lr = new double[M.length][t];
//            for(int i = 0; i < M.length; i++) {
//                double[] di = M[i];
//                double [] bi = b.M[i];
//
//                // percorre as colunas
//                double [] cr = new double[di.length];
//                for(int j = 0; j < di.length; j++) {
//                    double dj = di[i];
//                    double bj = bi[j];
//
//                    double dbj = dj * bj; // fazer isso dentro de um for
//                    cr[j] = dbj;
            int[][] matrizC = new int[linha][coluna2];
            for (int i = 0; i < linha; i++){
                for (int j = 0; j < coluna2; j++){
                    for (int k = 0; k < linha2; k++){
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }

                lr[i] = cr;
            }

            return new Matriz(lr);

        } catch (Exception e) {
            return null;
        }
    }

    void copiaMatriz(double [][] valores) {
        this.M = valores.clone();
    }

    void imprimeMatriz() {
        // percorre a linhas
        for(int i = 0; i < M.length; i++) {
            double[] di = M[i];

            // percorre as colunas
            for(int j = 0; j < di.length; j++) {
                double dj = di[j];
                System.out.print(dj + " ");
            }
            System.out.print("\n");
        }
    }

    Boolean ehQuadrada() {
        return n == m;
    }

}
 

class Main {

    public static void main(String ... args) {
        System.out.println("Programa de matriz");

        double [][] valores1 = {{-1, 0, 0},
                                {0, -1, 0},
                                {0, 0,-1}};

        double [][] valores2 = {{1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}};

        Matriz A = new Matriz(valores2);
        Matriz B = new Matriz(valores1);

        A.multiplicaMatriz(B).imprimeMatriz();
    }
}