package model;

import controller.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import controller.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {
    
    PreparedStatement st = null; // Definicao do obj st como nulo
    
    public List<Produto> bucaPorNome(String nomeP) throws SQLException {
        ConexaoBD con = new ConexaoBD(); // instacia  da classe ConexaoBD
        con.getConexao(); //obtendo conexao

        PreparedStatement stmt = null; // Definicao do obj stmt como nulo
        ResultSet rs = null;

        //prepara a lista de produto para retornar
        List<Produto> ListaProdutos = new ArrayList<>();

        try {

            String sql = "select * from produtos WHERE nome_produto LIKE ?;";

            //exeuta a query
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, "%" + nomeP + "%");
            rs = stmt.executeQuery();

            //para cada item retornado no  comando SQL faca
            while (rs.next()) {
                Produto prod = new Produto();
                Fornecedor forn = new Fornecedor();
                
                prod.setId_produto(rs.getInt("id_produto"));
                prod.setNomeP(rs.getString("nome_produto"));
                prod.setMarca(rs.getString("marca"));
                prod.setCategoria(rs.getString("categoria"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setQuantidade(rs.getInt("quantidade"));
                prod.setPreco_unitario(rs.getDouble("preco_unitario"));
                prod.setId_fornecedor(rs.getInt("id_fornecedor"));
                
                //insere o produto na lista local
                ListaProdutos.add(prod);
            }

            return ListaProdutos;

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

    //metodo para inserção de um produto
    public void insereProduto(Produto prod) {
        ConexaoBD conexao = new ConexaoBD(); // instacia  da classe ConexaoBD

        PreparedStatement st = null; // Definicao do obj st como nulo

        try {
            //inserindo a query sql
            String sql = "";
            sql += "";
            sql += "INSERT INTO produtos"
                    + "(nome_produto, marca, quantidade, categoria, descricao, preco_unitario, id_fornecedor)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?)";

            // definindo o PreparableStatement, para consultas parametricas com valores formatados
            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, prod.getNomeP());
            st.setString(2, prod.getMarca());
            st.setInt(3, prod.getQuantidade());
            st.setString(4, prod.getCategoria());
            st.setString(5, prod.getDescricao());
            st.setDouble(6, prod.getPreco_unitario());
            st.setInt(7, prod.getId_fornecedor());

            //executa a query sql
            int linhasAfetadas = st.executeUpdate();

            //se a query for executada, captura posicao do registro confome o sgbd
            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    prod.setId_produto(id);
                }
                rs.close();
            } else {
                throw new SQLException("Erro inesperado! Nenhuma linha afetada!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }
    }
    
    public void alterarProduto(Produto prod) throws SQLException{
        ConexaoBD conexao = new ConexaoBD(); // instacia  da classe ConexaoBD 
        //inserindo a query sql
        String sql = "update produtos "
                + "set nome_produto = ?, marca = ?, quantidade = ?, categoria = ?, descricao = ?, preco_unitario = ?"
                + " where id_produto = ?";
     
        try{
            st = conexao.getConexao().prepareStatement(sql);
            
            st.setString(1, prod.getNomeP());
            st.setString(2, prod.getMarca());
            st.setInt(3, prod.getQuantidade());
            st.setString(4, prod.getCategoria());
            st.setString(5, prod.getDescricao());
            st.setDouble(6, prod.getPreco_unitario());
            st.setInt(7, prod.getId_produto());
            
            st.execute();
            st.close();
            
        }
        catch (SQLException e) {
            
            System.out.println(e.getMessage());
        }finally {
            conexao.fechaConexao();
        }
     }
    
    public void excluirProduto(Produto prod){
         ConexaoBD conexao = new ConexaoBD(); // instacia  da classe ConexaoBD 
        //inserindo a query sql
        String sql = "delete from produtos where id_produto = ?";
        
        try{
            st = conexao.getConexao().prepareStatement(sql);
            
            st.setInt(1, prod.getId_produto());
            
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
