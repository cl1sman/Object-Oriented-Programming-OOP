import java.util.Scanner;

class objeto{
    String pessoa;
    int idade;

    objeto(){

    }

    objeto(String nome){
        pessoa = nome;
    }

    public String getPessoa() {
        return pessoa;
    }
}

public class multObject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String nomeDaPessoa = scan.next();
            objeto pessoa1 = new objeto(nomeDaPessoa);
            System.out.println(pessoa1);
            System.out.println(pessoa1.getPessoa());
        }
//        String nomeDaPessoa = scan.next();
//        objeto pessoa1 = new objeto(nomeDaPessoa);
//        System.out.println(pessoa1);
//        System.out.println(pessoa1.getPessoa());

//        for (int i = 0; i < 5; i++) {
//            String x = scan.next();
//            objeto o1 = new objeto(x); // depois do new, é o construtor?
//            System.out.println(o1 + x);
//        }
    }
}
