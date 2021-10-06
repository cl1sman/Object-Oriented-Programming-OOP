public class HelloWorld {
    public static void main(String[] args){
        int matrizA[][] = {{4, 3},
                            {2, 1}};
        int matrizB[][] = {{3, 2},
                            {4, 0}};
        int i, j;

        for(i=0; i<matrizA.length; ++i){
            System.out.println(matrizA[i]);
            for(j=0; j< matrizB.length; j++){
                System.out.println((matrizB[j]));

            }
        }
    }
}
