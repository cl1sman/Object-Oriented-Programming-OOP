import java.util.Scanner;

public class Arrays {
    int quantosNumeros;
    int[] vetorSoma;


    public Arrays() {
    }
    public Arrays(int x){
        this.setQuantosNumeros(x);
    }

    // método soma
    public int soma(){
        int soma = 0;

        vetorSoma = new int[getQuantosNumeros()];
        for (int i = 0; i < vetorSoma.length; i++) {
            Scanner scan = new Scanner(System.in);
            vetorSoma[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorSoma.length; i++) {
            soma += vetorSoma[i];
        }return soma;
    }

    public int getQuantosNumeros() {
        return quantosNumeros;
    }

    public void setQuantosNumeros(int quantosNumeros) {
        this.quantosNumeros = quantosNumeros;
    }

    public int[] getVetorSoma() {
        return vetorSoma;
    }

    public void setVetorSoma(int[] vetorSoma) {
        this.vetorSoma = vetorSoma;
    }
}
