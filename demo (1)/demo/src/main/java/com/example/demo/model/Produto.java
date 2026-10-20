package com.example.demo.model;


import jakarta.persistence.*;


@Entity
@Table(name="db_produtos")
public class Produto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100,unique = true)
    private String nome;

    @Column(nullable = false)
    private double preco;

    public Produto(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}