class ShirtShop{
  public static void main(String[] args) {
    Camiseta camiseta1 = new Camiseta("G", "Vermelho", true, 50.0, 75.03);
    Camiseta camiseta2 = new Camiseta("P", "Rosa", false, 50.0, 75.03);
    Camiseta camiseta3 = new Camiseta("GG", "Caramelo", true, 50.0, 75.03);
    Camiseta camiseta4 = new Camiseta("M", "Vermelho", false, 50.0, 75.03);
    Camiseta camiseta5 = new Camiseta("P", "Tomate", true, 50.0, 75.03);
    Camiseta camiseta6 = new Camiseta("G", "Abobora", true, 50.0, 75.03);

    Pessoa dono1 = new Pessoa("João Cleber", "19283412394", "12/12/12");
    Pessoa dono2 = new Pessoa("Martolomeu No Rey", "10982374", "34/12/45");
    Pessoa dono3 = new Pessoa("Entonildo da Silva", "1928374", "54/12/34");

    dono1.primeiraCamiseta = camiseta1;
    dono1.primeiraCamiseta = camiseta2;

    System.out.println(dono1.primeiraCamiseta);
    System.out.println(dono1.segundaCamiseta);
  }
}
