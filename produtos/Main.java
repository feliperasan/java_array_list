package produtos;

import java.util.Locale;

import produtos.entities.GerenciarProduto;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        GerenciarProduto gerProduto = new GerenciarProduto();

        gerProduto.adicionarProduto(1, "TV", 1200.00);
        gerProduto.adicionarProduto(2, "Geladeira", 2500.00);
        gerProduto.adicionarProduto(3, "Liquidificador", 300.00);
        gerProduto.adicionarProduto(4, "Computador", 3500.00);
        gerProduto.adicionarProduto(5, "Notebook", 3999.00);
        gerProduto.adicionarProduto(6, "Celular", 2399.00);
        gerProduto.adicionarProduto(7, "Bicicleta", 1000.00);

        gerProduto.listarProdutos();

        double precoMedio = gerProduto.precoMedioLista();
        System.out.printf("Preco Medio: R$ %.2f%n", precoMedio);

        double maiorPreco = gerProduto.produtoMaisCaro();
        System.out.printf("Maior Preco: R$ %.2f%n", maiorPreco);

        gerProduto.removerMaisBarato();

        gerProduto.listarProdutos();

    }

}
