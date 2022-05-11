public class Animal extends Usuario{
    private String tipo;
    private boolean vacinas;

    Animal(String tipo, boolean vacinas){
        setTipo(tipo);
        setVacinas(vacinas);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setVacinas(boolean vacinas) {
        this.vacinas = vacinas;
    }
    public boolean getVacinas() {
        return vacinas;
    }

    @Override
    public void enviarAbraco(Usuario recebedor){
        System.out.println("Me visite e traga comida assim que a Covid-19 passar");
    };
    public void receberAbraco(Usuario remetente){
        if(remetente instanceof Animal || remetente instanceof Roqueiro){
            setVacinas(true);
        }
    };
} 

