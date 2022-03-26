public class CamisariaRodrigues{
  public static void main(String[] args) {
    // da direita para a esquerda, estou criando uma camiseta
    // e guardando ela em uma variavel de mesmo tipo

    // primeiro objeto
    Camiseta senhorDasNoites = new Camiseta(); // a variavel tem que ser do mesmo tipo da que estou criando
    // especificacoes de meu objeto
    senhorDasNoites.tamanho = 'P';
    senhorDasNoites.tipoGola = 'V';
    senhorDasNoites.cor = "Vermelho";
    senhorDasNoites.tecido = "Do que tiver";
    senhorDasNoites.estampa = "Pinterest";
    senhorDasNoites.preco = 50.0;
    senhorDasNoites.custo = 2.50;

    // segundo objeto
    Camiseta hojeAmanha = new Camiseta();
    hojeAmanha.tamanho = 'G';
    hojeAmanha.tipoGola = 'V';
    hojeAmanha.cor = "Roxo";
    hojeAmanha.tecido = "Pano de saco";
    hojeAmanha.estampa = "Joia";
    hojeAmanha.preco = 51.0;
    hojeAmanha.custo = 2.50;
  }
}
