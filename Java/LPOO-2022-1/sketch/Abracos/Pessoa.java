public abstract class Pessoa extends Usuario{
    private String nome;
    private String cpf;

    Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
