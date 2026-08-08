package exercicio1;

public class Teste {
    static void main() {
        Professor p = new Professor("Girafalis", "gira@gmail.com");

        Turma t1 = new Turma(1, "Turma do chaves", p, 10);

        Aluno a1 = new Aluno("Chaves", "chaves@gmail.com");

        t1.matricularAluno(a1);
        t1.listarAlunos();
    }
}
