class ClasseAluno{
    String nome;
    String turma;
    float nota;

    ClasseAluno(){

    }
    ClasseAluno(String n){
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}

public class Aluno {
    public static void main(String[] args) {
        ClasseAluno aluno1 = new ClasseAluno("Carlos");
        System.out.println(aluno1.getNome());
    }
}
