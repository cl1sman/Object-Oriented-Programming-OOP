public class ShirtShop {
    public static void main(String[] args) {
        Camiseta nsync = new Camiseta("A", "Vermelho", true, 10.0, 50.0);
        Camiseta five = new Camiseta("B", "Vermelho", true, 10.0, 50.0);
        Camiseta rouge = new Camiseta("D", "Rosa", false, 10.0, 50.0);
        Camiseta broz = new Camiseta("E", "Vermelho", false, 10.0, 50.0);
        Camiseta justin = new Camiseta("F", "Vermelho", false, 10.0, 50.0);
        Camiseta eminem = new Camiseta("G", "Vermelho", false, 10.0, 50.0);
        
        // Tentando colocar mais uma camiseta
        Camiseta doRonaldo = new Camiseta("C", "Camiseta de um teste", true, 10.0, 50.0);
        Camiseta doRonaldo2 = new Camiseta("C2", "Camiseta de mais um teste", true, 10.0, 50.0);

        Pessoa dono1 = new Pessoa("Samuel", "000.000.000-00", "00/00/0000");
        Pessoa dono2 = new Pessoa("Pafúncio", "111.111.111-11", "11/11/1111");
        Pessoa dono3 = new Pessoa("Ziguifrido", "333.333.333-33", "22/22/2222");

        // // a camiseta tem um dono
        // nsync.dono = dono1;
        // five.dono = dono1;
        // rouge.dono = dono2;
        // broz.dono = dono2;
        // justin.dono = dono3;
        // eminem.dono = dono3;
        // // o dono tem uma camiseta
        // dono1.camiseta1 = nsync; // não é necessario o new no camiseta1, porque ele já foi declarado. tendo como valor inicial null, não precisa fazer new. Aqui já existe o "espaço" para a camiseta1, não desejo criar uma nova camiseta1, só quero que ela olhe para o lugar que desejo.
        // dono1.camiseta2 = five;
        // dono2.camiseta1 = rouge;
        // dono2.camiseta2 = broz;
        // dono3.camiseta1 = justin;
        // dono3.camiseta2 = eminem;

        // // Ao invés de fazer isso na mão, automatizar, crianado um metodo.
        // nsync.dono = dono1;
        // five.dono = dono1;
        // dono1.camiseta1 = nsync;
        // dono1.camiseta2 = five;
        
        // * aqui estou passando a camiseta para o dono
        dono1.recebaCamiseta(nsync);
        dono1.recebaCamiseta(five);
        dono1.recebaCamiseta(doRonaldo);
        doRonaldo.recebaDono(dono1);
        dono1.recebaCamiseta(doRonaldo2);
        doRonaldo2.recebaDono(dono1);

        dono2.recebaCamiseta(rouge);
        dono2.recebaCamiseta(broz);
        dono3.recebaCamiseta(justin);
        dono3.recebaCamiseta(eminem);
        // * aqui estou pasando o dono para a camiseta
        nsync.recebaDono(dono1);
        five.recebaDono(dono1);
        rouge.recebaDono(dono2);
        broz.recebaDono(dono2);
        justin.recebaDono(dono3);
        eminem.recebaDono(dono3);

        
        dono1.mostra();
        dono2.mostra();
        dono3.mostra();
        // dono1.camisetas[1].mostra();
        // dono1.camisetas[2].mostra();
        // dono2.camisetas[0].mostra();
        // dono2.camisetas[1].mostra();
        // dono3.camisetas[0].mostra();
        // dono3.camisetas[1].mostra();

        // dono1.camiseta1 = new Camiseta();
        // dono1.camiseta1 = nsync;
        // dono1.camiseta2 = five;

        // rouge.dono = dono2;
        // broz.dono = dono2;
        // dono2.camiseta1 = rouge;
        // dono2.camiseta2 = broz;

        // justin.dono = dono3;
        // eminem.dono = dono3;
        // dono3.camiseta1 = justin;
        // dono3.camiseta2 = eminem;

        // System.out.println(dono1.nome);










        // ##################################################
        // Camiseta camiseta1 = new Camiseta("P", "Vermelho", true, 10.0, 50.0);
        // Camiseta camiseta2 = new Camiseta("G", "Azul", true, 10.0, 50.0);

        // if(camiseta1.dono == camiseta2.dono) {
        //     System.out.println("São do mesmo dono!");
        // }
        // else {
        //     System.out.println("São de donos diferentes!");
        // }

    }
}
