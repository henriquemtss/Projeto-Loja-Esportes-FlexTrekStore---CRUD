package view;

import controller.Fornecedor;
import controller.Produto;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.FornecedorDAO;
import model.ProdutosDAO;

/**
 *
 * @author HENRIQUE
 */
public class TelaC_Produto extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaC_Produto
     */
    public TelaC_Produto() throws SQLException{
        initComponents();
        
        //para popular o combobox
        FornecedorDAO fornD = new FornecedorDAO();
        
        for (Fornecedor f : fornD.listaFornecedores()){
            cboFornecedor.addItem(f);
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

        pnlCProduto = new javax.swing.JPanel();
        t_cadastroP = new javax.swing.JLabel();
        t_nome = new javax.swing.JLabel();
        c_nomeP = new javax.swing.JTextField();
        t_marca = new javax.swing.JLabel();
        c_marcaP = new javax.swing.JTextField();
        c_quantP = new javax.swing.JTextField();
        t_quantP = new javax.swing.JLabel();
        t_categoriaP = new javax.swing.JLabel();
        c_categoriatP = new javax.swing.JTextField();
        t_descP = new javax.swing.JLabel();
        t_precoP = new javax.swing.JLabel();
        c_precoP = new javax.swing.JTextField();
        t_fornecedorP = new javax.swing.JLabel();
        btn_novoP = new javax.swing.JButton();
        btn_salvarP = new javax.swing.JButton();
        btn_cancelarP = new javax.swing.JButton();
        c_descP = new javax.swing.JTextField();
        cboFornecedor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produto");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        t_cadastroP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        t_cadastroP.setText("Cadastro de Produto");

        t_nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_nome.setText("Nome:");

        c_nomeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomePActionPerformed(evt);
            }
        });

        t_marca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_marca.setText("Marca:");

        c_marcaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_marcaPActionPerformed(evt);
            }
        });

        c_quantP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_quantPActionPerformed(evt);
            }
        });

        t_quantP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_quantP.setText("Quantidade:");

        t_categoriaP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_categoriaP.setText("Categoria:");

        c_categoriatP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_categoriatPActionPerformed(evt);
            }
        });

        t_descP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_descP.setText("Descri�ao:");

        t_precoP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_precoP.setText("Pre�o:");

        c_precoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_precoPActionPerformed(evt);
            }
        });

        t_fornecedorP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_fornecedorP.setText("Fornecedor:");

        btn_novoP.setText("Novo");
        btn_novoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoPActionPerformed(evt);
            }
        });

        btn_salvarP.setText("Salvar");
        btn_salvarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarPActionPerformed(evt);
            }
        });

        btn_cancelarP.setText("Cancelar");
        btn_cancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarPActionPerformed(evt);
            }
        });

        c_descP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descPActionPerformed(evt);
            }
        });

        cboFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o fornecedor" }));
        cboFornecedor.setAutoscrolls(true);
        cboFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFornecedorActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N

        javax.swing.GroupLayout pnlCProdutoLayout = new javax.swing.GroupLayout(pnlCProduto);
        pnlCProduto.setLayout(pnlCProdutoLayout);
        pnlCProdutoLayout.setHorizontalGroup(
            pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCProdutoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCProdutoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlCProdutoLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnlCProdutoLayout.createSequentialGroup()
                                            .addComponent(t_nome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c_nomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCProdutoLayout.createSequentialGroup()
                                            .addComponent(t_marca)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(c_categoriatP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnlCProdutoLayout.createSequentialGroup()
                                                    .addComponent(c_marcaP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(70, 70, 70)
                                                    .addComponent(t_quantP)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c_quantP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(c_descP, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(pnlCProdutoLayout.createSequentialGroup()
                                    .addComponent(t_categoriaP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_precoP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c_precoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCProdutoLayout.createSequentialGroup()
                                .addComponent(t_descP)
                                .addGap(410, 410, 410))))
                    .addGroup(pnlCProdutoLayout.createSequentialGroup()
                        .addComponent(t_fornecedorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCProdutoLayout.createSequentialGroup()
                                .addComponent(btn_novoP)
                                .addGap(90, 90, 90)
                                .addComponent(btn_salvarP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cancelarP))
                            .addGroup(pnlCProdutoLayout.createSequentialGroup()
                                .addComponent(cboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_cadastroP)
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        pnlCProdutoLayout.setVerticalGroup(
            pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCProdutoLayout.createSequentialGroup()
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCProdutoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(t_cadastroP))
                    .addGroup(pnlCProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(23, 23, 23)
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nome)
                    .addComponent(c_nomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_quantP)
                    .addComponent(c_quantP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_marca)
                    .addComponent(c_marcaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_categoriaP)
                    .addComponent(c_categoriatP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_precoP)
                    .addComponent(c_precoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_descP)
                    .addComponent(c_descP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_fornecedorP)
                    .addComponent(cboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(pnlCProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novoP)
                    .addComponent(btn_salvarP)
                    .addComponent(btn_cancelarP))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarPActionPerformed
        Produto prod = new Produto();

        try {
            String nomeP;
            String marca;
            String categoria;
            String descricao;
            int quantidade;
            double preco_unitario;
            int id_fornecedor;

            //validacao de campo fazer mais verifica��o
            if (c_nomeP.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Prencha o campo Nome");
                c_nomeP.requestFocus();
            } else if (c_marcaP.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Prencha o campo Marca");
                c_marcaP.requestFocus();
            } else if (c_categoriatP.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Prencha o campo Categoria");
                c_categoriatP.requestFocus();
            } else if (c_descP.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Prencha o campo Descri��o");
                c_descP.requestFocus();
            } else if (c_precoP.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Prencha o campo Pre�o");
                c_precoP.requestFocus();
            } else if (c_quantP.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Prencha o campo Quantidade");
                c_quantP.requestFocus();
            } else {
                nomeP = c_nomeP.getText();
                marca = c_marcaP.getText();
                categoria = c_categoriatP.getText();
                descricao = c_descP.getText();
                quantidade = Integer.parseInt(c_quantP.getText());
                preco_unitario = Double.parseDouble(c_precoP.getText());

                //fazendo casting para capturar o atributo do Forncedor
                Fornecedor forn = (Fornecedor) cboFornecedor.getSelectedItem();
                
                //atribuindo o id do fornecedor quando o nome do forncedor e selecionado
                id_fornecedor = forn.getId_fornecedor();
                
                prod.setNomeP(nomeP);
                prod.setMarca(marca);
                prod.setCategoria(categoria);
                prod.setDescricao(descricao);
                prod.setQuantidade(quantidade);
                prod.setPreco_unitario(preco_unitario);
                prod.setId_fornecedor(id_fornecedor);
                
                ProdutosDAO pd = new ProdutosDAO();
                pd.insereProduto(prod);
                
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
                
                limparTelaCadastroP();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_salvarPActionPerformed

    private void btn_novoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoPActionPerformed
        limparTelaCadastroP();
    }//GEN-LAST:event_btn_novoPActionPerformed

    private void btn_cancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarPActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarPActionPerformed

    private void c_nomePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomePActionPerformed

    private void c_marcaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_marcaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_marcaPActionPerformed

    private void c_quantPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_quantPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_quantPActionPerformed

    private void c_categoriatPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_categoriatPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_categoriatPActionPerformed

    private void c_precoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_precoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_precoPActionPerformed

    private void c_descPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_descPActionPerformed

    private void cboFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboFornecedorActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
    
    }//GEN-LAST:event_formInternalFrameClosing

    public void limparTelaCadastroP() {
        //limpando campos
        c_nomeP.setText("");
        c_marcaP.setText("");
        c_categoriatP.setText("");
        c_precoP.setText("");
        c_quantP.setText("");
        c_descP.setText("");

        //limpando combobox
        cboFornecedor.setSelectedIndex(0);

        //deixando o focus no primeiro campo
        cboFornecedor.requestFocus();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarP;
    private javax.swing.JButton btn_novoP;
    private javax.swing.JButton btn_salvarP;
    private javax.swing.JTextField c_categoriatP;
    private javax.swing.JTextField c_descP;
    private javax.swing.JTextField c_marcaP;
    private javax.swing.JTextField c_nomeP;
    private javax.swing.JTextField c_precoP;
    private javax.swing.JTextField c_quantP;
    private javax.swing.JComboBox cboFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlCProduto;
    private javax.swing.JLabel t_cadastroP;
    private javax.swing.JLabel t_categoriaP;
    private javax.swing.JLabel t_descP;
    private javax.swing.JLabel t_fornecedorP;
    private javax.swing.JLabel t_marca;
    private javax.swing.JLabel t_nome;
    private javax.swing.JLabel t_precoP;
    private javax.swing.JLabel t_quantP;
    // End of variables declaration//GEN-END:variables
}
