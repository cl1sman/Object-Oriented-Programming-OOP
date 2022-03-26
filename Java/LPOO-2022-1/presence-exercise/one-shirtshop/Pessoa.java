class Pessoa{
  String nome;
  String cpf;
  String dataDeNascimento;
  Camiseta = primeitaCamiseta;
  Camiseta segundaCamiseta;
  // Constructors
  Pessoa(){}
  Pessoa(String nome, String cpf, String dataDeNascimento){
    this.nome = nome;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
  }
  Pessoa(String nome, String cpf, String dataDeNascimento, Camiseta primeiraCamiseta, Camiseta segundaCamiseta){
    this.nome = nome;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
    this.umaDasCamisetas = primeiraCamiseta;
    this.outraDasCamisetas = outraDasCamisetas;
  }
}
