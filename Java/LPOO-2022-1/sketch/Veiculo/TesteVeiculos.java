public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo v = new Veiculo(10.0);
        VeiculoTerrestre vt = new VeiculoTerrestre(10.0, false);
        Tanque t = new Tanque(10.0, true, "01/01/2000");

        t.setPeso(500.0); // Veiculo
        t.setTracado(true); // VeiculoTerrestre
        t.setDataDeFabricacao("01/01/2000"); // Tanque

        v = vt;
        v.setPeso(500.0); // Funciona
        // v.setTracado(true); // Não funciona

        VeiculoTerrestre vt2 = (VeiculoTerrestre) v; // Cast. Só funciona por conta de v = vt;
        vt2.setTracado(true); // Funciona

        Veiculo v2 = t;
        // v2.setDataDeFabricacao("01/01/2000"); // Não funciona
        v2.setPeso(500.0); // Funciona

        // Com isso, posso criar um vetor para armazenar todos os veículos e depois.
        // Cria uma pai, e faz ele olhar um filho, e etc
    }
}
