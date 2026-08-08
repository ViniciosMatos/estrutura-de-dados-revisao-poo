package exercicio2;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numeroPaginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "-----------------\nTitulo: " + titulo + "\nAutor: " + autor +
                "\nNumero de Paginas: " + numeroPaginas + "\nDsiponibilidade: " + disponivel;
    }

    public void exibirDetalhes(){
        this.toString();
    }

    public void reservar(){
        if (!disponivel) {
            System.out.println("Este livro não está disponível.");
            return;
        }
        disponivel = false;
        System.out.println("reserva feita!");
    }

    public void devolver(){
        disponivel = true;
        System.out.println("Agora este livro está disponivel");
    }

}
