package exercicio1;

public class Aluno extends Pessoa{
    public Aluno(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void logar() {
        System.out.println("Aluno logado!");
    }

    @Override
    public String toString() {
        return "----------\nNome: " + getNome() + "\nEmail: " + getEmail();
    }
}
