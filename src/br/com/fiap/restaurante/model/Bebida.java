package br.com.fiap.restaurante.model;

public class Bebida extends Produto {
    private int quantidade;

    //Chamando o construtor da classe pai atraves da palavra super, sem nenhum argumento
    public Bebida(){ super(); };

    //Chamando o construtor com todos os argumetos
    public Bebida(String nome, String ingredientes, double preco, int quantidade) {
        super(nome, ingredientes, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() { return quantidade; };

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; };




}
