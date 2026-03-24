package org.example.service;

import org.example.model.Produto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private final List<Produto> produtos = new ArrayList<>();

    public ProdutoService() {
        produtos.add(criarProduto("P001", "Teclado Mecanico", "Teclado ABNT2 com switch blue", new BigDecimal("299.90"), 15));
        produtos.add(criarProduto("P002", "Mouse Gamer", "Mouse RGB com 7 botoes", new BigDecimal("149.90"), 20));
        produtos.add(criarProduto("P003", "Monitor 24", "Monitor Full HD IPS", new BigDecimal("899.00"), 8));
    }

    public Produto cadastrar(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    public List<Produto> listarTodos() {
        return produtos;
    }

    private Produto criarProduto(String codigo, String nome, String descricao, BigDecimal preco, Integer quantidadeEmEstoque) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setPreco(preco);
        produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
        return produto;
    }
}
