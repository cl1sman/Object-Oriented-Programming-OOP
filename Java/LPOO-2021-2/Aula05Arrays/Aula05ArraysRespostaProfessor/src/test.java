import java.util.Scanner;

class Arrays{
    // Atributo
    int[] vet;

    // Construtores
    Arrays(){

    }
    // Recebe n que é nosso limite do vetor
    Arrays(int n){
        vet = new int[n];
    }

    // Método
    int soma(){
        int sum = 0;
        for (int i = 0; i < vet.length; i++) {
            sum += vet[i];
        }
        return sum;
    }
}

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Arrays arr = new Arrays(n); // arr é o objeto

        for (int i = 0; i < n; i++) {
            arr.vet[i] = s.nextInt();
            // arr é o objeto. o objeto tem um atributo que é um vetor, i é o indice
        }
        System.out.println(arr.soma());
    }
}
