
package view;

import model.ConexaoBD;

public class Principal {
    public static void main(String[] args) {
        ConexaoBD con = new ConexaoBD();
        con.getConexao();
        System.out.println("O status de conexão é: " + con.getStsConexao());
    }
    
}
