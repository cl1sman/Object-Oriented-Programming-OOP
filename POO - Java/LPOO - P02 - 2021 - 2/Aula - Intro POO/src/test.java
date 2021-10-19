class Pessoa{
    // Atributos
    int idade;
    String nome;

    // Construtores
    Pessoa(){

    }
    Pessoa(String novoNome, int novaIdade){
        nome = novoNome;
        idade = novaIdade;
    }

    // Metodos
    void falar(){
        System.out.println("Oi, meu nome é " + nome);
    }
}

public class test {
    public static void main(String[] args) {
//        // objeto p de Pessoa
//        Pessoa p = new Pessoa();
//
//        // Acesso aos atributos
//        p.nome = "João";
//        p.idade = 25;
//        // Chamada ao metodo falar
//        p.falar();
        Pessoa p1 = new Pessoa(); // usando o construtor vazio, pois não passei nada para o parametro
        Pessoa p2 = new Pessoa("João", 25); // aqui ele vai usar o 2° construtor, definindo os atributos passados
        System.out.println("Pessoa1: " + p1.idade + ' ' + p1.nome);
        System.out.println("Pessoa2: " + p2.idade + ' ' + p2.nome);
    }
}
