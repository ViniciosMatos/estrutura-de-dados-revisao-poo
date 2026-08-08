package exercicio1;

public class Turma {
    private int id;
    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int id, String nome, Professor professor, int capacidadeAlunos) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new Aluno[capacidadeAlunos];
        this.quantidadeAlunos = 0;
    }
    public Turma(int id, String nome, int capacidadeAlunos) {
        this.id = id;
        this.nome = nome;
        this.alunos = new Aluno[capacidadeAlunos];
        this.quantidadeAlunos = 0;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void matricularAluno(Aluno aluno){
        if (quantidadeAlunos == alunos.length){
            System.out.println("Turma lotada.");
            return;
        }
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    public void listarAlunos(){
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println(alunos[i]);
        }
    }
}
