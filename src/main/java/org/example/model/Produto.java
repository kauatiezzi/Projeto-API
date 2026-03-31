package org.example.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class Produto {

    @NotBlank(message = "O codigo e obrigatorio.")
    private String codigo;

    @NotBlank(message = "O nome e obrigatorio.")
    private String nome;

    @NotBlank(message = "A descricao e obrigatoria.")
    private String descricao;

    @NotNull(message = "O preco e obrigatorio.")
    @Positive(message = "O preco deve ser maior que zero.")
    private BigDecimal preco;

    @NotNull(message = "A quantidade em estoque e obrigatoria.")
    @PositiveOrZero(message = "A quantidade em estoque nao pode ser negativa.")
    private Integer quantidadeEmEstoque;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
