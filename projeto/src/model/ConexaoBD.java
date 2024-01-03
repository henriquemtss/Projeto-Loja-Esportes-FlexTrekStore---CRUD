
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    //status de conexao para consultas
    private String stsConexao  = "N�o conectado!";
    
    public Connection getConexao(){
        //Atributo para conexao
        
        Connection  conexao = null;
        
        //inicia a tentativa de conexao
        try {
            //define o driver de conex�o padr�o  para essa conex�o
            String nomeDriver = "com.mysql.cj.jdbc.Driver";
            Class.forName(nomeDriver);
            
            //Define parametros de conex�o ao banco
            
            String servidor = "localhost"; //caminho de rede at� o BD
            String schema = "loja_esportes_bd"; //nome banco
            
            //url para o driver JDBC
            String url = "jdbc:mysql://" + servidor + "/" + schema + "?useTimezone=true&serverTimezone=UTC";
            
            //usuario de senha(parametros de conex�o)
            String usuario = "root";
            String senha = "";
            
            //define a conex�o
            conexao = (Connection)DriverManager.getConnection(url, usuario, senha);
            
            //testando a conex�o
            if(conexao != null){ //se a conex�o estiver funcioando ela n�o � nula
                //troca o status da conex�o
                stsConexao = "Conectado!";
            }else{
                stsConexao = "N�o conectado";
            }
            return conexao;
        } catch(ClassNotFoundException e){//caso o driver de conex�o nao seja encontrado
            System.out.println("Driver de conex�o n�o encontrato");
            return null;
        } catch(SQLException e){ //Caso n�o consiga conectar
            System.out.println("Falha na conex�o!");
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    //retorna o status de conex�o
    public String getStsConexao(){
        return stsConexao;
    }
    
    //metodo para encerrar a conex�o
    public boolean fechaConexao(){
        try {
            getConexao().close(); // fecha a conex�o
            stsConexao = "Conex�o Fechada";
            return true; //retorna verdadeiro se conseguir fechar
        } catch (SQLException e) {
            //Caso de algum erro, imprima
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    //m�todo para reiniciar a conexao, se necess�rio
    public Connection reiniciaConexao(){
        fechaConexao(); // fecha a mesma
        return getConexao(); //abre e retorna
    }
}
