import java.util.Scanner; // para ler as coisas do teclado

class Arrays{
    // Atributo
    int[] vet;
    
    // Construtor (recebe n(limite do vetor))
    Arrays(int n){ // n vai ser o tamanho do nosso vetor
        vet = new int[n];
    }
    
    // Metodo
    int soma(){
        int sum = 0;
        for(int i = 0; i < vet.length; i++){
            sum += vet[i];
        }
        return sum;
    }
}

public class Matriz {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n; // n é o tamanho do vetor
        n = s.nextInt();

        // construindo o objeto
        Arrays arr = new Arrays(n); // passando n para o construtor

        for(int i = 0; i < n; i++){
            // arr é o nosso objeto
            // o objeto arr tem um atributo que é um vetor
            arr.vet[i] = s.nextInt(); // lendo os valores usando o Scanner
        }
        System.out.println(arr.soma()); // imprime a soma
    }
}

/*
        int n = 2;
        int m = 2;

        double[] [] M = new double[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < 9; j++) M[i][j] = i*j;


    public void somaMatriz(matriz B){

        }
 */
