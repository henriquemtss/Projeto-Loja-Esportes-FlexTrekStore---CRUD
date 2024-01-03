/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.Produto;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ProdutosDAO;

/**
 *
 * @author HENRIQUE
 */
public class TelaPesquisaEstoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquiaProduto
     */
    public TelaPesquisaEstoque() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) tblListaProdutos.getModel();
        tblListaProdutos.setRowSorter(new TableRowSorter(modelo));
    }

        //Isso � para carregar dados do banco na Tabela
    public void LerParaTabelaPorModelo(String modeloProd) throws SQLException {

        DefaultTableModel model = (DefaultTableModel) tblListaProdutos.getModel();
        model.setNumRows(0);

        ProdutosDAO pDAO = new ProdutosDAO();
        
        for(Produto prod : pDAO.bucaPorNome(modeloProd)){
            
            model.addRow(new Object[]{
            prod.getId_produto(),
            prod.getNomeP(),
            prod.getMarca(),
            prod.getQuantidade(),
            prod.getCategoria(),
            prod.getDescricao(),
            prod.getPreco_unitario(),
            prod.getId_fornecedor()
          
        });
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotoes = new javax.swing.JPanel();
        t_bnome = new javax.swing.JLabel();
        c_Bnome = new javax.swing.JTextField();
        btn_consultar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlTabelaConsultaP = new javax.swing.JScrollPane();
        tblListaProdutos = new javax.swing.JTable();
        t_fornecedorP = new javax.swing.JLabel();
        c_descP = new javax.swing.JTextField();
        t_descP = new javax.swing.JLabel();
        c_precoP = new javax.swing.JTextField();
        c_quantP = new javax.swing.JTextField();
        c_nomeP = new javax.swing.JTextField();
        t_nome = new javax.swing.JLabel();
        t_marca = new javax.swing.JLabel();
        c_marcaP = new javax.swing.JTextField();
        t_categoriaP = new javax.swing.JLabel();
        c_categoriaP = new javax.swing.JTextField();
        t_quantP = new javax.swing.JLabel();
        t_precoP = new javax.swing.JLabel();
        t_idP = new javax.swing.JLabel();
        c_idP = new javax.swing.JTextField();
        c_idF = new javax.swing.JTextField();
        btn_alterarP = new javax.swing.JButton();
        btn_excluirP = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisa de Estoque");

        t_bnome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_bnome.setText("Buscar por nome:");

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_bnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_Bnome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_bnome)
                    .addComponent(c_Bnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar)
                    .addComponent(btn_limpar))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        tblListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "C�digo", "Nome", "Marca", "Quantidade", "Categoria", "Descri��o", "Pre�o", "Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaProdutosMouseClicked(evt);
            }
        });
        pnlTabelaConsultaP.setViewportView(tblListaProdutos);

        t_fornecedorP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_fornecedorP.setText("Fornecedor:");

        c_descP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descPActionPerformed(evt);
            }
        });

        t_descP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_descP.setText("Descri�ao:");

        c_precoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_precoPActionPerformed(evt);
            }
        });

        c_quantP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_quantPActionPerformed(evt);
            }
        });

        c_nomeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomePActionPerformed(evt);
            }
        });

        t_nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_nome.setText("Nome:");

        t_marca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_marca.setText("Marca:");

        c_marcaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_marcaPActionPerformed(evt);
            }
        });

        t_categoriaP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_categoriaP.setText("Categoria:");

        c_categoriaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_categoriaPActionPerformed(evt);
            }
        });

        t_quantP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_quantP.setText("Quantidade:");

        t_precoP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_precoP.setText("Pre�o:");

        t_idP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_idP.setText("C�digo:");

        btn_alterarP.setText("Alterar");
        btn_alterarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarPActionPerformed(evt);
            }
        });

        btn_excluirP.setText("Excluir");
        btn_excluirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTabelaConsultaP)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(t_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_nomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_descP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_descP))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_categoriaP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_categoriaP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t_precoP)
                                .addGap(10, 10, 10)
                                .addComponent(c_precoP, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(t_quantP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_quantP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_marca)
                    .addComponent(t_fornecedorP)
                    .addComponent(t_idP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_marcaP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(c_idF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c_idP, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_alterarP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btn_excluirP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabelaConsultaP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nome)
                    .addComponent(c_nomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_marca)
                    .addComponent(c_marcaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_categoriaP)
                        .addComponent(c_categoriaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_precoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_fornecedorP)
                            .addComponent(c_idF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(t_precoP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_descP)
                    .addComponent(c_descP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_idP)
                    .addComponent(c_idP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_quantP)
                    .addComponent(c_quantP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alterarP)
                    .addComponent(btn_excluirP))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        try {
            LerParaTabelaPorModelo(c_Bnome.getText());
        } catch (SQLException ex) {
        }  

    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        limparTelaPesquisaP(true);

    }//GEN-LAST:event_btn_limparActionPerformed
    public void limparTelaPesquisaP(boolean limparTbl) {
        if (limparTbl){
            ((DefaultTableModel) tblListaProdutos.getModel()).setRowCount(0);
            c_Bnome.setText("");
            c_Bnome.requestFocus();
            c_nomeP.setText("");
            c_marcaP.setText("");
            c_quantP.setText("");
            c_categoriaP.setText("");
            c_descP.setText("");
            c_precoP.setText("");
            c_idP.setText("");
            c_idF.setText("");
        }else{
            c_Bnome.setText("");
            c_Bnome.requestFocus();
            c_nomeP.setText("");
            c_marcaP.setText("");
            c_quantP.setText("");
            c_categoriaP.setText("");
            c_descP.setText("");
            c_precoP.setText("");
            c_idP.setText("");
            c_idF.setText("");
        }
        
        

    }
    private void c_descPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_descPActionPerformed

    private void c_precoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_precoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_precoPActionPerformed

    private void c_quantPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_quantPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_quantPActionPerformed

    private void c_nomePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomePActionPerformed

    private void c_marcaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_marcaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_marcaPActionPerformed

    private void c_categoriaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_categoriaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_categoriaPActionPerformed

    private void tblListaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaProdutosMouseClicked
        int setar = tblListaProdutos.getSelectedRow();
        
        c_idP.setText(tblListaProdutos.getModel().getValueAt(setar, 0).toString());
        c_nomeP.setText(tblListaProdutos.getModel().getValueAt(setar, 1).toString());
        c_marcaP.setText(tblListaProdutos.getModel().getValueAt(setar, 2).toString());
        c_quantP.setText(tblListaProdutos.getModel().getValueAt(setar, 3).toString());
        c_categoriaP.setText(tblListaProdutos.getModel().getValueAt(setar, 4).toString());
        c_descP.setText(tblListaProdutos.getModel().getValueAt(setar, 5).toString());
        c_precoP.setText(tblListaProdutos.getModel().getValueAt(setar, 6).toString());
        c_idF.setText(tblListaProdutos.getModel().getValueAt(setar, 7).toString());
        c_idF.setEnabled(false);
        c_idP.setEnabled(false);
    }//GEN-LAST:event_tblListaProdutosMouseClicked

    private void btn_alterarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarPActionPerformed
            alterarProduto();

        try {

            LerParaTabelaPorModelo(c_nomeP.getText());
            limparTelaPesquisaP(false);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btn_alterarPActionPerformed
    private void alterarProduto(){
               try{
           Produto prodA = new Produto();
            
            int id_produtoA, id_fornecedorA, quantidadeA;
            String nomePA, marcaA, categoriaA, descricaoA;
            double preco_unitarioA;            
    
            
            id_produtoA = Integer.parseInt(c_idP.getText());
            id_fornecedorA = Integer.parseInt(c_idF.getText());
            quantidadeA = Integer.parseInt(c_quantP.getText());
            nomePA  = c_nomeP.getText();
            marcaA = c_categoriaP.getText();
            categoriaA = c_categoriaP.getText();
            descricaoA = c_descP.getText();
            preco_unitarioA = Double.parseDouble(c_precoP.getText());
            
            
            prodA.setId_produto(id_produtoA);
            prodA.setId_fornecedor(id_fornecedorA);
            prodA.setNomeP(nomePA);
            prodA.setMarca(marcaA);
            prodA.setCategoria(categoriaA);
            prodA.setDescricao(descricaoA);
            prodA.setPreco_unitario(preco_unitarioA);
            prodA.setQuantidade(quantidadeA);
            
            ProdutosDAO pdao = new ProdutosDAO();
            
            pdao.alterarProduto(prodA);
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
            
       }catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao alterar!");
            System.out.println(e.getMessage());
        }
    }
    
    private void excluirProduto(){
        try{
            
            int id_produtoE;
            
            id_produtoE = Integer.parseInt(c_idP.getText());
            
            Produto prodE= new Produto();
            prodE.setId_produto(id_produtoE);
            
            ProdutosDAO pdao = new ProdutosDAO();
            pdao.excluirProduto(prodE);
            
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
        }catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao excluit!");
            System.out.println(e.getMessage());
        }
        
    }
    
    private void btn_excluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirPActionPerformed
        int op = JOptionPane.showInternalConfirmDialog(null, "Deseja excluir o produto? ", "Excluir Produto", 
                JOptionPane.YES_NO_OPTION);
        
        if (op == JOptionPane.YES_OPTION){
            excluirProduto();
            limparTelaPesquisaP(true);
        }
        
      
        
    }//GEN-LAST:event_btn_excluirPActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarP;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_excluirP;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JTextField c_Bnome;
    private javax.swing.JTextField c_categoriaP;
    private javax.swing.JTextField c_descP;
    private javax.swing.JTextField c_idF;
    private javax.swing.JTextField c_idP;
    private javax.swing.JTextField c_marcaP;
    private javax.swing.JTextField c_nomeP;
    private javax.swing.JTextField c_precoP;
    private javax.swing.JTextField c_quantP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JScrollPane pnlTabelaConsultaP;
    private javax.swing.JLabel t_bnome;
    private javax.swing.JLabel t_categoriaP;
    private javax.swing.JLabel t_descP;
    private javax.swing.JLabel t_fornecedorP;
    private javax.swing.JLabel t_idP;
    private javax.swing.JLabel t_marca;
    private javax.swing.JLabel t_nome;
    private javax.swing.JLabel t_precoP;
    private javax.swing.JLabel t_quantP;
    private javax.swing.JTable tblListaProdutos;
    // End of variables declaration//GEN-END:variables
}
