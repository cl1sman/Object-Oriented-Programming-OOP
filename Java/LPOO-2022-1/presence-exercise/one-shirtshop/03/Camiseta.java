public class Camiseta {
    private String tamanho;
    private String cor;
    private boolean possuiEstampa;
    private double precoDeCusto;
    private double precoDeVenda;

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPossuiEstampa() {
        return this.possuiEstampa;
    }

    public boolean getPossuiEstampa() {
        return this.possuiEstampa;
    }

    public void setPossuiEstampa(boolean possuiEstampa) {
        this.possuiEstampa = possuiEstampa;
    }

    public double getPrecoDeCusto() {
        return this.precoDeCusto;
    }

    public void setPrecoDeCusto(double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public double getPrecoDeVenda() {
        return this.precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    // public Pessoa getDono() {
    //     return this.dono;
    // }

    // public void setDono(Pessoa dono) {
    //     this.dono = dono;
    // }
    // Composição
    Pessoa dono;

    Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda, String nome, String cpf, String dataDeNascimento) {
        setTamanho(tamanho);
        setCor(cor);
        setPossuiEstampa(possuiEstampa);
        setPrecoDeCusto(precoDeCusto);
        setPrecoDeVenda(precoDeVenda);

        this.dono = new Pessoa(nome, cpf, dataDeNascimento);
    }

    Camiseta(String tamanho, String cor, boolean possuiEstampa, double precoDeCusto, double precoDeVenda) {
        setTamanho(tamanho);
        setCor(cor);
        setPossuiEstampa(possuiEstampa);
        setPrecoDeCusto(precoDeCusto);
        setPrecoDeVenda(precoDeVenda);

        this.dono = new Pessoa("Guilherme", "123.123.123-12", "02/02/22");
    }
}