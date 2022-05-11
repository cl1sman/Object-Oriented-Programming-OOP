public class Camiseta {
    String tamanho;
    String cor;
    boolean possuiEstampa;
    double precoDeCusto;
    double precoDeVenda;
    // Composição
    Cliente dono;

    Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda, String nome, String cpf, String dataDeNascimento) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.possuiEstampa = possuiEstampa;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;

        this.dono = new Cliente(nome, cpf, dataDeNascimento);
    }



    Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.possuiEstampa = possuiEstampa;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
    }

    // Métodos
    void recebaDono(Cliente dono) {
        this.dono = dono;
    }
}
