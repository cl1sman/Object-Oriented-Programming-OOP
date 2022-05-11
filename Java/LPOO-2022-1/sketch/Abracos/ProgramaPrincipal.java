import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Cadastro de usuários
        // Creio que um vetor de objetos Usuario seria melhor
        Scanner input = new Scanner(System.in);
        int option = 0;
        Usuario vetorDeUsuarios [] = new Usuario[50];
        int index = 0;

        System.out.println("Bem-vindo ao cadastro de usuários");
        
        while(option !=4){

            System.out.println("Para seu cadastro, informe em qual categoria você se encaixa: ");
            System.out.println("1 - Animal");
            System.out.println("2 - Roqueiro");
            System.out.println("3 - Emo");
            System.out.println("4 - Sair");
            
            option = input.nextInt();
            input.nextLine(); // Limpa o buffer

            switch (option) {
                case 1:
                    String tipo;
                    boolean vacinas;

                    System.out.println("Informe o tipo de animal: ");
                    tipo = input.nextLine();
                    System.out.println("Foi vacinado? (true/false)");
                    vacinas = input.nextBoolean();

                    Usuario animal = new Animal(tipo, vacinas);
                    vetorDeUsuarios[index] = animal;
                    index++;
                    break;
                
                case 2:
                    String nome;
                    String cpf;
                    int camisetas;
                    String dataDaBarba;

                    System.out.println("Informe o nome: ");
                    nome = input.nextLine();
                    System.out.println("Informe o CPF: ");
                    cpf = input.nextLine();
                    System.out.println("Informe a quantidade de camisetas: ");
                    camisetas = input.nextInt();
                    input.nextLine(); // clear buffer
                    System.out.println("Informe a data da barba: ");
                    dataDaBarba = input.nextLine();

                    Usuario roqueiro = new Roqueiro(nome, cpf, camisetas, dataDaBarba);
                    vetorDeUsuarios[index] = roqueiro;
                    index++;
                    break;
                
                case 3:
                    String nome2;
                    String cpf2;
                    int franja;
                    String corDeCabelo;

                    System.out.println("Informe o nome: ");
                    nome2 = input.nextLine();
                    System.out.println("Informe o CPF: ");
                    cpf2 = input.nextLine();
                    System.out.println("Informe o tamanho da franja: ");
                    franja = input.nextInt();
                    input.nextLine(); // clear buffer
                    System.out.println("Informe a cor do cabelo: ");
                    corDeCabelo = input.nextLine();

                    Usuario emo = new Emo(nome2, cpf2, franja, corDeCabelo);
                    vetorDeUsuarios[index] = emo;
                    index++;
                    break;
                default:
                    break;
                } 
            }
    
        // Hugs
        // For para enviar e receber abraços?
    }
}
