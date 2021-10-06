public class Entrega {
    private String origem, destino;
    private int tempo_entrega;
    private double penalidade;
    private int atraso;

    Entrega(String orig, String dest, int t_e){
        origem = orig;
        destino = dest;
        tempo_entrega = t_e;
    }

    public void computaPenalidade(int atr){
        atraso = atr;
        penalidade = (double) atr/ tempo_entrega *100;
    }
    public double devolvePenalidade(){
        return penalidade;
    }
}

class Main {
    public static void main(String[] args){
        Entrega entrega = new Entrega("Carlinda", "Jorge Teixeira", 10);
        entrega.computaPenalidade(5);
        System.out.println(entrega.devolvePenalidade());
    }
}
