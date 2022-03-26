class ShirtShop{
  public static void main(String[] args) {
    // Camisetas
    Camiseta mamonas = new Camiseta("G", "Vermelho", true, 50.0, 75.03);
    Camiseta florentinaFlorentina = new Camiseta("P", "Rosa", false, 34.0, 55.03);
    Camiseta passarinhosDoForro = new Camiseta("GG", "Caramelo", true, 50.0, 2.03);
    Camiseta frotaEstelar = new Camiseta("M", "Vermelho", false, 23.0, 111.03);
    Camiseta oMarNaoEVerde = new Camiseta("P", "Tomate", true, 11111.0, 5674.03);
    Camiseta ateQueOSolCaia = new Camiseta("G", "Abobora", true, 23.0, 5243.03);

    // os que se acham os donos
    Pessoa cliente1 = new Pessoa("João Cleber", "19283412394", "12/12/12");
    Pessoa cliente2 = new Pessoa("Martolomeu No Rey", "10982374", "34/12/45");
    Pessoa cliente3 = new Pessoa("Entonildo da Silva", "1928374", "54/12/34");

    // As camisetas estão olhando para a cliente1
    mamonas.dono = cliente1; // fazendo mamonas.dono apontar para a posição na memoria de onde esta o objeto cliente1.
    florentinaFlorentina.dono = mamonas.dono;

    // As camisetas estão olhando para a cliente2
    passarinhosDoForro.dono = cliente2;
    frotaEstelar.dono = passarinhosDoForro.dono;

    // As camisetas estão olhando para a dona cliente3
    oMarNaoEVerde.dono = cliente3;
    ateQueOSolCaia.dono = oMarNaoEVerde.dono;

    // Passadno as camisetas para seus respectivos donos.
    cliente1.primeiraCamiseta = mamonas;
    cliente1.segundaCamiseta = florentinaFlorentina;
    cliente2.primeiraCamiseta = passarinhosDoForro;
    cliente2.segundaCamiseta = frotaEstelar;
    cliente3.primeiraCamiseta = oMarNaoEVerde;
    cliente3.segundaCamiseta = ateQueOSolCaia;

    System.out.println("Dono");
    System.out.println(cliente1.nome);
    System.out.println(cliente1.cpf);
    System.out.println(cliente1.dataDeNascimento);
    System.out.println("Camisetas");
    System.out.println(cliente1.primeiraCamiseta.tamanho);
    System.out.println(cliente1.primeiraCamiseta.cor);
    System.out.println(cliente1.primeiraCamiseta.possuiEstampa);
    System.out.println(cliente1.primeiraCamiseta.precoDeCusto);
    System.out.println(cliente1.primeiraCamiseta.precoDeVenda);

    System.out.println(cliente1.segundaCamiseta.tamanho);
    System.out.println(cliente1.segundaCamiseta.cor);
    System.out.println(cliente1.segundaCamiseta.possuiEstampa);
    System.out.println(cliente1.segundaCamiseta.precoDeCusto);
    System.out.println(cliente1.segundaCamiseta.precoDeVenda);
    System.out.println("");

    System.out.println("Dono");
    System.out.println(cliente2.nome);
    System.out.println(cliente2.cpf);
    System.out.println(cliente2.dataDeNascimento);
    System.out.println("Camisetas");
    System.out.println(cliente2.primeiraCamiseta.tamanho);
    System.out.println(cliente2.primeiraCamiseta.cor);
    System.out.println(cliente2.primeiraCamiseta.possuiEstampa);
    System.out.println(cliente2.primeiraCamiseta.precoDeCusto);
    System.out.println(cliente2.primeiraCamiseta.precoDeVenda);

    System.out.println(cliente2.segundaCamiseta.tamanho);
    System.out.println(cliente2.segundaCamiseta.cor);
    System.out.println(cliente2.segundaCamiseta.possuiEstampa);
    System.out.println(cliente2.segundaCamiseta.precoDeCusto);
    System.out.println(cliente2.segundaCamiseta.precoDeVenda);
    System.out.println("");

    System.out.println("Dono");
    System.out.println(cliente3.nome);
    System.out.println(cliente3.cpf);
    System.out.println(cliente3.dataDeNascimento);
    System.out.println("Camisetas");
    System.out.println(cliente3.primeiraCamiseta.tamanho);
    System.out.println(cliente3.primeiraCamiseta.cor);
    System.out.println(cliente3.primeiraCamiseta.possuiEstampa);
    System.out.println(cliente3.primeiraCamiseta.precoDeCusto);
    System.out.println(cliente3.primeiraCamiseta.precoDeVenda);

    System.out.println(cliente3.segundaCamiseta.tamanho);
    System.out.println(cliente3.segundaCamiseta.cor);
    System.out.println(cliente3.segundaCamiseta.possuiEstampa);
    System.out.println(cliente3.segundaCamiseta.precoDeCusto);
    System.out.println(cliente3.segundaCamiseta.precoDeVenda);
    System.out.println("");

    // // Apontam para o mesmo endereço na memoria
    // Pessoa cliente1 = new Pessoa("João Cleber", "19283412394", "12/12/12");
    // mamonas.dono = cliente1;
    //
    // System.out.println(mamonas.dono); // Pessoa@7344699f
    // System.out.println(cliente1); // Pessoa@7344699f

    // // Para onde mamonas aponta?
    // System.out.println(mamonas); // Camiseta@6b95977
    // System.out.println(florentinaFlorentina); // Camiseta@7e9e5f8a

    // System.out.println(cliente1.primeiraCamiseta); // Camiseta@6b95977
    // System.out.println(cliente1.segundaCamiseta); // Camiseta@7e9e5f8a
  }
}
