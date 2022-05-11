public class Emo extends Pessoa{
    private int franja;
    private String corDeCabelo;

    Emo(String nome, String cpf, int franja, String corDeCabelo){
        super(nome, cpf);
        setFranja(franja);
        setCorDeCabelo(corDeCabelo);
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
    public int getFranja() {
        return franja;
    }
    public void setCorDeCabelo(String corDeCabelo) {
        this.corDeCabelo = corDeCabelo;
    }
    public String getCorDeCabelo() {
        return corDeCabelo;
    }

    @Override
    public void enviarAbraco(Usuario recebedor){
        if(recebedor instanceof Emo){
            setCorDeCabelo("Rosa");
        }
        else{
            setCorDeCabelo("Verde");
        }
    }

    @Override
    public void receberAbraco(Usuario remetente){
        if(remetente instanceof Emo){
            setFranja(getFranja() + 2);
        }
        else{
            setFranja(getFranja() + 1);
        }
    }
}
