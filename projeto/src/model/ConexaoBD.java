
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    //status de conexao para consultas
    private String stsConexao  = "Não conectado!";
    
    public Connection getConexao(){
        //Atributo para conexao
        
        Connection  conexao = null;
        
        //inicia a tentativa de conexao
        try {
            //define o driver de conexão padrão  para essa conexão
            String nomeDriver = "com.mysql.cj.jdbc.Driver";
            Class.forName(nomeDriver);
            
            //Define parametros de conexão ao banco
            
            String servidor = "localhost"; //caminho de rede até o BD
            String schema = "loja_esportes_bd"; //nome banco
            
            //url para o driver JDBC
            String url = "jdbc:mysql://" + servidor + "/" + schema + "?useTimezone=true&serverTimezone=UTC";
            
            //usuario de senha(parametros de conexão)
            String usuario = "root";
            String senha = "";
            
            //define a conexão
            conexao = (Connection)DriverManager.getConnection(url, usuario, senha);
            
            //testando a conexão
            if(conexao != null){ //se a conexão estiver funcioando ela não é nula
                //troca o status da conexão
                stsConexao = "Conectado!";
            }else{
                stsConexao = "Não conectado";
            }
            return conexao;
        } catch(ClassNotFoundException e){//caso o driver de conexão nao seja encontrado
            System.out.println("Driver de conexão não encontrato");
            return null;
        } catch(SQLException e){ //Caso não consiga conectar
            System.out.println("Falha na conexão!");
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    //retorna o status de conexão
    public String getStsConexao(){
        return stsConexao;
    }
    
    //metodo para encerrar a conexão
    public boolean fechaConexao(){
        try {
            getConexao().close(); // fecha a conexão
            stsConexao = "Conexão Fechada";
            return true; //retorna verdadeiro se conseguir fechar
        } catch (SQLException e) {
            //Caso de algum erro, imprima
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    //método para reiniciar a conexao, se necessário
    public Connection reiniciaConexao(){
        fechaConexao(); // fecha a mesma
        return getConexao(); //abre e retorna
    }
}
