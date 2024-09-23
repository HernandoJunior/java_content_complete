package br.com.fiap.restaurante.model;

public class Produto {
    private String nome;

    private String ingredientes;

    private double preco;

    //Construtores
    public Produto(){

    }

    public Produto(String nome, String ingredientes, Double preco){
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    //Metodos Setters and Getters
    public String getNome(){ return nome;}

    public void setNome(String nome) { this.nome = nome; }

    public String getIngredientes() { return ingredientes;}

    public void setIngredientes(String ingredientes) { this.ingredientes = ingredientes; };

    public Double getPreco() { return preco; };

    public void setPreco(Double preco) { this.preco = preco; };
}