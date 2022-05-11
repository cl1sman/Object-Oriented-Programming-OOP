public class ClienteCamiseta {
    // Composição
    Cliente dono;
    Camiseta camiseta[];

    ClienteCamiseta(Cliente dono){
        dono = new Cliente();
        this.dono = dono;
        camiseta = new Camiseta[1];
    }
}
