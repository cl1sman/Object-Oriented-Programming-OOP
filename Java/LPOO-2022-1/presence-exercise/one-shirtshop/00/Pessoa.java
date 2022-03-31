public class Pessoa{
  String nome;
  String cpf;
  String dataDeNascimento;
  
  Camiseta primeiraCamiseta;
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
    this.primeiraCamiseta = primeiraCamiseta;
    this.segundaCamiseta = segundaCamiseta;
  }
}
