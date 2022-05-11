public class Camiseta {
    String tamanho;
    String cor;
    boolean possuiEstampa;
    double precoDeCusto;
    double precoDeVenda;
    // Composição
    Pessoa dono;

    // Construtor
    // 1a característica: mesmo nome da classe
    // 2a característica: invocação automática
    // 3a característica: não tem retorno
    Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda, String nome, String cpf, String dataDeNascimento) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.possuiEstampa = possuiEstampa;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;

        this.dono = new Pessoa(nome, cpf, dataDeNascimento);
    }

    // Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda) {
    //     this.tamanho = tamanho;
    //     this.cor = cor;
    //     this.possuiEstampa = possuiEstampa;
    //     this.precoDeCusto = precoDeCusto;
    //     this.precoDeVenda = precoDeVenda;

    //     this.dono = new Pessoa("Guilherme", "123.123.123-12", "02/02/22");
    // }



    Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.possuiEstampa = possuiEstampa;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
    }

    // Métodos
    // void recebaDono(Pessoa dono) {
    //     this.dono = dono;
    // } Melhor não usar, porque não é uma boa prática. Melhor fazer com que o metodo lá em pessoa, já faço os dois.
}
