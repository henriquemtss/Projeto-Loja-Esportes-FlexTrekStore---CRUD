
package controller;


public class Produto {
    private int id_produto;
    private String nomeP;
    private String marca;
    private String categoria;
    private String descricao; 
    private int quantidade;
    private double preco_unitario;
    private int id_fornecedor;

    public Produto() {
    }

    public Produto(int id_produto, String nomeP, String marca, String categoria, String descricao, int quantidade, double preco_unitario, int id_fornecedor) {
        this.id_produto = id_produto;
        this.nomeP = nomeP;
        this.marca = marca;
        this.categoria = categoria;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.id_fornecedor = id_fornecedor;
    }

    
    public int getId_produto() {
        return id_produto;
    }

    
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

   
    public String getNomeP() {
        return nomeP;
    }

   
    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

   
    public String getMarca() {
        return marca;
    }

   
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getCategoria() {
        return categoria;
    }

    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public String getDescricao() {
        return descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }
    
    
    
}
