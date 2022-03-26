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
    Pessoa jorge = new Pessoa("João Cleber", "19283412394", "12/12/12");
    Pessoa thomasDeAdamantium = new Pessoa("Martolomeu No Rey", "10982374", "34/12/45");
    Pessoa marcolinaMeirelis = new Pessoa("Entonildo da Silva", "1928374", "54/12/34");

    // As camisas do Seu Jorge
    mamonas.dono = jorge; // fazendo mamonas.dono apontar para a posição na memoria de onde esta o objeto jorge.
    florentinaFlorentina.dono = mamonas.dono;

    // As camisas do seu Thomas
    passarinhosDoForro.dono = thomasDeAdamantium;
    frotaEstelar.dono = passarinhosDoForro.dono;

    // As camisas da dona Marcolina
    oMarNaoEVerde.dono = marcolinaMeirelis;
    ateQueOSolCaia.dono = oMarNaoEVerde.dono;

    // Passadno as camisetas para seus respectivos donos.
    jorge.primeiraCamiseta = mamonas;
    jorge.segundaCamiseta = florentinaFlorentina;
    thomasDeAdamantium.primeiraCamiseta = passarinhosDoForro;
    thomasDeAdamantium.segundaCamiseta = frotaEstelar;
    marcolinaMeirelis.primeiraCamiseta = oMarNaoEVerde;
    marcolinaMeirelis.segundaCamiseta = ateQueOSolCaia;

    System.out.println("Dono");
    System.out.println(jorge.nome);
    System.out.println(jorge.cpf);
    System.out.println(jorge.dataDeNascimento);
    System.out.println("Camisetas");
    System.out.println(jorge.primeiraCamiseta.tamanho);
    System.out.println(jorge.primeiraCamiseta.cor);
    System.out.println(jorge.primeiraCamiseta.possuiEstampa);
    System.out.println(jorge.primeiraCamiseta.precoDeCusto);
    System.out.println(jorge.primeiraCamiseta.precoDeVenda);

    System.out.println(jorge.segundaCamiseta.tamanho);
    System.out.println(jorge.segundaCamiseta.cor);
    System.out.println(jorge.segundaCamiseta.possuiEstampa);
    System.out.println(jorge.segundaCamiseta.precoDeCusto);
    System.out.println(jorge.segundaCamiseta.precoDeVenda);
    System.out.println("");

    System.out.println("Dono");
    System.out.println(thomasDeAdamantium.nome);
    System.out.println(thomasDeAdamantium.cpf);
    System.out.println(thomasDeAdamantium.dataDeNascimento);
    System.out.println("Camisetas");
    System.out.println(thomasDeAdamantium.primeiraCamiseta.tamanho);
    System.out.println(thomasDeAdamantium.primeiraCamiseta.cor);
    System.out.println(thomasDeAdamantium.primeiraCamiseta.possuiEstampa);
    System.out.println(thomasDeAdamantium.primeiraCamiseta.precoDeCusto);
    System.out.println(thomasDeAdamantium.primeiraCamiseta.precoDeVenda);

    System.out.println(thomasDeAdamantium.segundaCamiseta.tamanho);
    System.out.println(thomasDeAdamantium.segundaCamiseta.cor);
    System.out.println(thomasDeAdamantium.segundaCamiseta.possuiEstampa);
    System.out.println(thomasDeAdamantium.segundaCamiseta.precoDeCusto);
    System.out.println(thomasDeAdamantium.segundaCamiseta.precoDeVenda);
    System.out.println("");

    System.out.println("Dono");
    System.out.println(marcolinaMeirelis.nome);
    System.out.println(marcolinaMeirelis.cpf);
    System.out.println(marcolinaMeirelis.dataDeNascimento);
    System.out.println("Camisetas");
    System.out.println(marcolinaMeirelis.primeiraCamiseta.tamanho);
    System.out.println(marcolinaMeirelis.primeiraCamiseta.cor);
    System.out.println(marcolinaMeirelis.primeiraCamiseta.possuiEstampa);
    System.out.println(marcolinaMeirelis.primeiraCamiseta.precoDeCusto);
    System.out.println(marcolinaMeirelis.primeiraCamiseta.precoDeVenda);

    System.out.println(marcolinaMeirelis.segundaCamiseta.tamanho);
    System.out.println(marcolinaMeirelis.segundaCamiseta.cor);
    System.out.println(marcolinaMeirelis.segundaCamiseta.possuiEstampa);
    System.out.println(marcolinaMeirelis.segundaCamiseta.precoDeCusto);
    System.out.println(marcolinaMeirelis.segundaCamiseta.precoDeVenda);
    System.out.println("");

    // // Apontam para o mesmo endereço na memoria
    // System.out.println(mamonas.dono); // Pessoa@7344699f
    // System.out.println(jorge); // Pessoa@7344699f

    // // Para onde camiseta1 aponta?
    // System.out.println(mamonas); // Camiseta@6b95977
    // System.out.println(florentinaFlorentina); // Camiseta@7e9e5f8a

    // System.out.println(jorge.primeiraCamiseta); // Camiseta@6b95977
    // System.out.println(jorge.segundaCamiseta); // Camiseta@7e9e5f8a
  }
}
