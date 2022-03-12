// EXERCÍCIOS DE LAÇOS
// 2. Imprima a soma de 1 até 1000
public class soma_1_1000 {
    public static void main(String[] args){
        int i = 1;
        int soma = 0;
        while (i < 1001){
            soma = soma + i;
            System.out.println(soma);
            i = i + 1;
        }
    }
}
