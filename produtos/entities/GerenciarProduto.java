package produtos.entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciarProduto {
    List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(int id, String name, double preco) {
        produtos.add(new Produto(id, name, preco));
    }

    public double precoMedioLista() {
        double totalProd = 0.0;
        for (Produto produto : produtos) {
            totalProd += produto.getPreco();
        }

        return totalProd / produtos.size();
    }

    public void listarProdutos() {
        System.out.println("Id - Produto - Preco");
        if (produtos.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(
                        produtos.get(i).getId() + " " + produtos.get(i).getName() + " " + produtos.get(i).getPreco());
            }
        }
    }

    public double produtoMaisCaro() {
        double maiorPreco = produtos.get(0).getPreco();
        for (Produto produto : produtos) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
            }
        }
        return maiorPreco;
    }

    public void removerMaisBarato() {

        if (!produtos.isEmpty()) {
            Produto produtoMaisBarato = null;
            double menorPreco = produtos.get(0).getPreco();
            for (Produto produto : produtos) {
                if (menorPreco > produto.getPreco()) {
                    menorPreco = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
            produtos.remove(produtoMaisBarato);
        } else {
            System.out.println("A lista de produtos está vazia.");
        }
    }
}
