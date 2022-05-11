public class Roqueiro extends Pessoa{
    private int camisetas;
    private String dataDaBarba;

    Roqueiro(String nome, String cpf, int camisetas, String dataDaBarba){
        super(nome, cpf);
    }

    public void setCamisetas(int camisetas) {
        this.camisetas = camisetas;
    }
    public int getCamisetas() {
        return camisetas;
    }
    public void setDataDaBarba(String dataDaBarba) {
        this.dataDaBarba = dataDaBarba;
    }
    public String getDataDaBarba() {
        return dataDaBarba;
    }

    @Override
    public void enviarAbraco(Usuario recebedor){
        if(recebedor instanceof Roqueiro){
            setCamisetas(getCamisetas() - 1);
        }
        else{
            System.out.println("Barba feita"); // update data Beard
        }
    }

    @Override
    public void receberAbraco(Usuario remetente){
        if(remetente instanceof Roqueiro){
            System.out.println("Rock 'n' Roll");
        }
        else{
            System.out.println("Obrigado");
        }
    }
}
