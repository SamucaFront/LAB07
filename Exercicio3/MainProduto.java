public class MainProduto {
    public static void main(String[] args) {
        Eletronico e = new Eletronico("Notebook", 3500, "123456", "Dell", "110V");
        Livro l = new Livro("Java Básico", 120, "789101", "Ana Souza", "ISBN12345");
        Roupa r = new Roupa("Camisa", 80, "555777", "M", "Algodão");

        e.exibirDetalhes();
        l.exibirDetalhes();
        r.exibirDetalhes();
    }
}