// Mini-Calculadora
// Queremos implementar uma minicalculadora que realiza operações
// básicas: soma, subtração, multiplicação e divisão

import java.util.Scanner;

class Calc{
    public static void main(String[] args){
        double resultado = 0;

        // Declaramos e criamos o objeto scanner
        Scanner scan = new Scanner(System.in);

        // Lendo um string
        String operacao = scan.next();

        // Lendo as entradas, do tipo double
        double entrada1 = scan.nextDouble();
        double entrada2 = scan.nextDouble();


        // Switch case
        switch (operacao){
            case "+":
                resultado = entrada1 + entrada2;
                System.out.println("A soma é: " + resultado);
                break;
            case "-":
                resultado = entrada1 - entrada2;
                System.out.println("A subtração é: " + resultado);
                break;
            case "/":
                resultado = entrada1 / entrada2;
                System.out.println("A divisão ê: " + resultado);
                break;
            case "*":
                resultado = entrada1 * entrada2;
                System.out.println("A multiplicação é: " + resultado);
                break;
            default:
                System.out.println("!!!");
                break;

        }
    }
}