package exercicio2;

public class Livraria {
    private Livro[] livros;
    private int quantidadeLivros;

    public Livraria(int capacidadeLivros) {
        this.livros = new Livro[capacidadeLivros];
        this.quantidadeLivros = 0;
    }

    public void inserirLivro(Livro livro){
        if (quantidadeLivros == livros.length){
            System.out.println("Biblioteca cheia");
            return;
        }
        livros[quantidadeLivros] = livro;
        quantidadeLivros++;
        System.out.println("Livro cadastrado");
    }

    public void listarlivros(){
        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println(livros[i]);
        }
    }

    public void listarDisponiveis(){
        for (int i = 0; i < quantidadeLivros; i++) {
            if (!livros[i].isDisponivel()) continue;
            System.out.println(livros[i]);
        }
    }
}
