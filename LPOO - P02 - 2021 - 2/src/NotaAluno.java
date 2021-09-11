// EXERCÍCIOS DE LAÇOS
/// 4. Escreva um programa que leia repetidamente uma nota de um
// aluno fornecida pelo usuário até que o usuário digite -1 para
// finalizar. Calcule e imprima a média de todas as notas no final.
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nota = scan.nextDouble();
        double aux = 0;
        int i = 0;
        while (nota != -1){
            aux = aux + nota;
            i = i + 1;
            nota = scan.nextDouble();
        }
        double media = aux / i;
        System.out.println(media);
    }
}
