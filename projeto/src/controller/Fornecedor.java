package controller;

public class Fornecedor {

    private String nomeF;
    private String telefoneF;
    private String emailF;
    private int id_fornecedor;

    //construtor
    public Fornecedor() {

    }

    public Fornecedor(String nomeF, String telefoneF, String emailF, int id_forncedor) {
        this.nomeF = nomeF;
        this.telefoneF = telefoneF;
        this.emailF = emailF;
        this.id_fornecedor = id_forncedor;
    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getTelefoneF() {
        return telefoneF;
    }

    public void setTelefone(String telefoneF) {
        this.telefoneF = telefoneF;
    }

    public String getEmailF() {
        return emailF;
    }

    public void setEmailF(String emailF) {
        this.emailF = emailF;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        return this.id_fornecedor == other.id_fornecedor;
    }

    @Override
    public String toString() {
        return this.getNomeF();
    }
    
    
    
}
