public class ShirtShop {
    public static void main(String[] args) {
        Camiseta nsync = new Camiseta("P", "Vermelho", true, 10.0, 50.0);
        Camiseta five = new Camiseta("G", "Vermelho", false, 10.0, 50.0);
        Camiseta rouge = new Camiseta("P", "Rosa", true, 10.0, 50.0);
        Camiseta broz = new Camiseta("P", "Vermelho", true, 10.0, 50.0);
        Camiseta justin = new Camiseta("P", "Vermelho", true, 10.0, 50.0);
        Camiseta eminem = new Camiseta("P", "Vermelho", true, 10.0, 50.0);

        Pessoa dono1 = new Pessoa("Samuel", "123.456.789-10", "01/01/2001");
        Pessoa dono2 = new Pessoa("Pafúncio", "123.345.789-10", "01/01/1900");
        Pessoa dono3 = new Pessoa("Ziguifrido", "345.345.789-10", "01/01/1980");


        dono1.recebaCamiseta(nsync);
        dono1.recebaCamiseta(five);
        dono2.recebaCamiseta(rouge);
        dono2.recebaCamiseta(broz);
        dono3.recebaCamiseta(justin);
        dono3.recebaCamiseta(eminem);

    }
}