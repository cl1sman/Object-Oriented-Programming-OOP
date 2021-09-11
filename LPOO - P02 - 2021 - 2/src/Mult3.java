// EXERCÍCIOS DE LAÇOS
// 3. Imprima todos os múltiplos de 3, entre 1 e 100.
public class Mult3 {
    public static  void main(String[] args){
        for(int i = 0; i <= 1000; i++){
            if (i %3 == 0){
                System.out.println(i);
            }
        }
    }
}
