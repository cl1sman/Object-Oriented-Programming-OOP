public class Camiseta{
  String tamanho;
  String cor;
  boolean possuiEstampa;
  double precoDeCusto;
  double precoDeVenda;

  Pessoa dono;

  // Constructors
  Camiseta(){}
  Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda, String nome, String cpf, String dataDeNascimento){
    this.tamanho = tamanho;
    this.cor = cor;
    this.possuiEstampa = possuiEstampa;
    this.precoDeCusto = precoDeCusto;
    this.precoDeVenda = precoDeVenda;

    this.dono = new Pessoa(nome, cpf, dataDeNascimento); // preciso do new, porque é ele quem vai alocar na memoria os "espaços" necessarios para o obejto
  }
  Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda){
    this.tamanho = tamanho;
    this.cor = cor;
    this.possuiEstampa = possuiEstampa;
    this.precoDeCusto = precoDeCusto;
    this.precoDeVenda = precoDeVenda;
  }
}
