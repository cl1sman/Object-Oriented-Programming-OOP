public class Tanque extends VeiculoTerrestre {
    private String dataDeFabricacao;

    public Tanque(double peso, boolean tracado, String dataDeFabricacao) {
        super(peso, tracado);
        setDataDeFabricacao(dataDeFabricacao);
    }

    public void guerrear() {
        System.out.println("Tanque guerreando");
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public String getDataDeFabricacao() {
        return this.dataDeFabricacao;
    }
}
