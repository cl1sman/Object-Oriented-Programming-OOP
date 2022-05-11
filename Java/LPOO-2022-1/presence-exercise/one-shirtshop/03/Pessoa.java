public class Pessoa {
    private String nome;
    private String cpf;
    private String dataDeNascimento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    // public Camiseta getCamisetas[]() {
    //     return this.camisetas[];
    // }

    // public void setCamisetas[](Camiseta camisetas[]) {
    //     this.camisetas[] = camisetas[];
    // }

    Camiseta camisetas[];

    Pessoa(String nome, String cpf, String dataDeNascimento) {
        this.nome = nome;
        setNome(nome);
        setCpf(cpf);
        setDataDeNascimento(dataDeNascimento);

        this.camisetas = new Camiseta[2]; // e aqui, o que devo fazer? 
    }

    void recebaCamiseta(Camiseta camiseta) {
        // a pessoa terá a camiseta
        boolean acheiEspaco = false;
        for(int i = 0 ; i < camisetas.length && !acheiEspaco ; i++) {
            if(camisetas[i] == null) {
                camisetas[i] = camiseta;
                acheiEspaco = true;
            }
        }
    
        camiseta.dono = this;

        if(!acheiEspaco) {
            Camiseta novasCamisetas[] = new Camiseta[camisetas.length * 2];
            
            for(int i = 0; i < camisetas.length; i++){
                novasCamisetas[i] = camisetas[i];
            }

            camisetas = novasCamisetas;

            camisetas[camisetas.length - 1] = camiseta;
            camiseta.dono = this;
        }

    }
}