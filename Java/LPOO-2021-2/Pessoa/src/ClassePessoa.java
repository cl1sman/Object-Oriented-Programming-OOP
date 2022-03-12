public class ClassePessoa {
    private String nome;
    private int idade;

    public ClassePessoa() {
        this.nome = "No name";
        this.idade = 0;
    }

    // Métodos Personalizados
    public void falar(){
        System.out.println("Falando");
    }

    // Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
