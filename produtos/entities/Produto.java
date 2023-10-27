package produtos.entities;

public class Produto {
    private int id;
    private String name;
    private double preco;

    public Produto(int id, String name, double preco) {
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }
}
