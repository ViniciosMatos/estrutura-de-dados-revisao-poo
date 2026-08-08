package exercicio2;

public class Teste {
    static void main() {
        Livraria l1 = new Livraria(10);

        Livro book = new Livro("TITULO", "VINICIOS", 12, true);

        Livro livro = new Livro("AAAA", "BBBBBB", 22, true);

        l1.inserirLivro(book);
        l1.inserirLivro(livro);
        book.reservar();

        l1.listarDisponiveis();

        book.devolver();
        l1.listarlivros();

    }
}
