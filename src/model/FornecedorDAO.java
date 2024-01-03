
package model;

import controller.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class FornecedorDAO {
    
    PreparedStatement st = null; // Definicao do obj st como nulo
    
    public List<Fornecedor> bucaPorNFornecedor(String nomeF) throws SQLException {
        ConexaoBD con = new ConexaoBD(); // instacia  da classe ConexaoBD
        con.getConexao(); //obtendo conexao

        PreparedStatement stmt = null; // Definicao do obj stmt como nulo
        ResultSet rs = null;

        //prepara a lista de produto para retornar
        List<Fornecedor> listaFornecedores = new ArrayList<>();

        try {

            String sql = "select * from fornecedores WHERE nome_fornecedor LIKE ?;";

            //exeuta a query
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, "%" + nomeF + "%");
            rs = stmt.executeQuery();

            //para cada item retornado no  comando SQL faca
            while (rs.next()) {
                Fornecedor forn = new Fornecedor();
                
                
                forn.setId_fornecedor(rs.getInt("id_fornecedor"));
                forn.setNomeF(rs.getString("nome_fornecedor"));
                forn.setEmailF(rs.getString("email"));
                forn.setTelefone(rs.getString("telefone"));
                
               
                
                //insere o produto na lista local
                listaFornecedores.add(forn);
            }

            return listaFornecedores;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            //apos terminar, fecha a conexao, stmt e rs
            rs.close();
            stmt.close();
            con.getConexao().close();
        }
    }
    
    //metodo para retornar a lista de produtos, com todos os produtos
    public List<Fornecedor> listaFornecedores() throws SQLException{
        ConexaoBD con = new ConexaoBD(); // instacia  da classe ConexaoBD
        con.getConexao(); //obtendo conexao
        
        PreparedStatement stmt = null; // Definicao do obj stmt como nulo
        ResultSet rs = null;
        
        try {
            //prepara a lista de produto para retornar
            List<Fornecedor> ListaFornecedores = new ArrayList<>();
            
            //comando slq na base = tabela de produtos
            String sql = "select * from fornecedores;";
            
            //exeuta a query
            
            stmt = con.getConexao().prepareStatement(sql);
            rs = stmt.executeQuery();
            
            //para cada item retornado no  comando SQL faca
            while (rs.next()) {                
                Fornecedor forn = new Fornecedor(); // criando uma instancia, novo produto
                
                forn.setId_fornecedor(rs.getInt("id_fornecedor"));
                forn.setNomeF(rs.getString("nome_fornecedor"));
                forn.setEmailF(rs.getString("email"));
                forn.setTelefone(rs.getString("telefone"));
                
                //insere o forncedor na lista local
                ListaFornecedores.add(forn);
                
                
            }
            
            return ListaFornecedores;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            //apos terminar, fecha a conexao, stmt e rs
            rs.close();
            stmt.close();
            con.getConexao().close();
        }
       
        
    }
    
    public void insereFornecedor(Fornecedor forn) {
        ConexaoBD conexao = new ConexaoBD(); // instacia  da classe ConexaoBD
        
        
        
        try{
            //inserindo a query sql
            String sql = "";
            sql += "";
            sql += "INSERT INTO fornecedores"
                    + "(nome_fornecedor, telefone, email)"
                    + "VALUES"
                    + "(?, ?, ?)";
            
            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            st.setString(1, forn.getNomeF());
            st.setString(2, forn.getTelefoneF());
            st.setString(3, forn.getEmailF());
            
            //executa a query sql
            int linhasAfetadas = st.executeUpdate();
            
            if (linhasAfetadas > 0){
               ResultSet rs = st.getGeneratedKeys();
               if (rs.next()){
                   int id = rs.getInt(1);
                   forn.setId_fornecedor(id);
               }
               rs.close();
           } else {
               throw new SQLException("Erro inesperado! Nenhuma linha afetada!");
           }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }
    }
    
     public void alterarFornecedor(Fornecedor forn) throws SQLException{
        ConexaoBD conexao = new ConexaoBD(); // instacia  da classe ConexaoBD 
        //inserindo a query sql
        String sql = "update fornecedores set nome_fornecedor = ?, telefone = ?, email = ? where id_fornecedor = ?";
     
        try{
            st = conexao.getConexao().prepareStatement(sql);
            
            st.setString(1, forn.getNomeF());
            st.setString(2, forn.getTelefoneF());
            st.setString(3, forn.getEmailF());
            st.setInt(4, forn.getId_fornecedor());
            
            st.execute();
            st.close();
            
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            conexao.fechaConexao();
        }
     }
     
     public void excluirFornecedor(Fornecedor forn){
         ConexaoBD conexao = new ConexaoBD(); // instacia  da classe ConexaoBD 
        //inserindo a query sql
        String sql = "delete from fornecedores where id_fornecedor = ?";
        
        try{
            st = conexao.getConexao().prepareStatement(sql);
            
            st.setInt(1, forn.getId_fornecedor());
            
            st.execute();
            st.close();
            
        }
        catch (SQLException e) {
            
            System.out.println(e.getMessage());
        }finally {
            conexao.fechaConexao();
        }
     }
    
   
}
