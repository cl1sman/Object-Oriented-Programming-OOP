// APROVADO OU REPROVADO
// Verifique se um aluno foi aprovado ou reprovado na disciplina,
// lendo as notas de duas provas e calculando suas médias.

import java.util.Scanner;

public class Media {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        if (media >= 6){
            System.out.println("aprovado");
        }else
            System.out.println("reprovado");
    }
}
