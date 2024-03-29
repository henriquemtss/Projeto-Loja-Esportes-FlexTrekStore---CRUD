/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HENRIQUE
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPaneC = new javax.swing.JDesktopPane();
        btnFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mnuBarTelaPrincipal = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadastroF = new javax.swing.JMenuItem();
        mnuCadastroP = new javax.swing.JMenuItem();
        mnuPesquisa = new javax.swing.JMenu();
        mnuPesquiaF = new javax.swing.JMenuItem();
        mnuPesquiaP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FLEX TREK ESPORTIVOS");

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logoflex.png"))); // NOI18N

        dskPaneC.setLayer(btnFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPaneC.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskPaneCLayout = new javax.swing.GroupLayout(dskPaneC);
        dskPaneC.setLayout(dskPaneCLayout);
        dskPaneCLayout.setHorizontalGroup(
            dskPaneCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskPaneCLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskPaneCLayout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(307, 307, 307))
        );
        dskPaneCLayout.setVerticalGroup(
            dskPaneCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskPaneCLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnFechar)
                .addGap(28, 28, 28))
        );

        mnuArquivo.setText("Arquivo");
        mnuBarTelaPrincipal.add(mnuArquivo);

        mnuCadastro.setText("Cadastro");

        mnuCadastroF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadastroF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fornecedor.png"))); // NOI18N
        mnuCadastroF.setText("Cadastro de Fornecedor");
        mnuCadastroF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroFActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroF);

        mnuCadastroP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadastroP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/entregavel.png"))); // NOI18N
        mnuCadastroP.setText("Cadastro de Produto");
        mnuCadastroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroPActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroP);

        mnuBarTelaPrincipal.add(mnuCadastro);

        mnuPesquisa.setText("Pesquisa");

        mnuPesquiaF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuPesquiaF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pesquisaforne.png"))); // NOI18N
        mnuPesquiaF.setText("Pesquisar Fornecedor");
        mnuPesquiaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesquiaFActionPerformed(evt);
            }
        });
        mnuPesquisa.add(mnuPesquiaF);

        mnuPesquiaP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuPesquiaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pesquisar-produto.png"))); // NOI18N
        mnuPesquiaP.setText("Pesquisar Estoque");
        mnuPesquiaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesquiaPActionPerformed(evt);
            }
        });
        mnuPesquisa.add(mnuPesquiaP);

        mnuBarTelaPrincipal.add(mnuPesquisa);

        setJMenuBar(mnuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPaneC)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPaneC)
        );

        setSize(new java.awt.Dimension(1021, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroFActionPerformed
        TelaC_Fornecedor telaCadastroF = new TelaC_Fornecedor();
        dskPaneC.add(telaCadastroF); //adiciona o frame no dskPanel
        telaCadastroF.setVisible(true); //exibe a janela de cadastro
    }//GEN-LAST:event_mnuCadastroFActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        int op = JOptionPane.showInternalConfirmDialog(null, "Deseja fechar a apli��o", "Fechar Sistema", 
                JOptionPane.YES_NO_OPTION);
        
        if (op == JOptionPane.YES_OPTION){
            this.dispose(); //encerra o frame
            System.exit(0); //encerra a aplicacao
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void mnuCadastroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroPActionPerformed
        try {
            TelaC_Produto telaCadastroF = new TelaC_Produto();
            dskPaneC.add(telaCadastroF); //adiciona o frame no dskPanel
            telaCadastroF.setVisible(true); //exibe a janela de cadastro
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_mnuCadastroPActionPerformed

    private void mnuPesquiaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesquiaPActionPerformed
        TelaPesquisaEstoque telaPesquisaProduto = new TelaPesquisaEstoque();
        
        dskPaneC.add(telaPesquisaProduto);
        telaPesquisaProduto.setVisible(true);
    }//GEN-LAST:event_mnuPesquiaPActionPerformed

    private void mnuPesquiaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesquiaFActionPerformed
        TelaPesquisaFornecedor telaPesquisaFornecedor = new TelaPesquisaFornecedor();
        
        dskPaneC.add(telaPesquisaFornecedor);
        telaPesquisaFornecedor.setVisible(true);
    }//GEN-LAST:event_mnuPesquiaFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JDesktopPane dskPaneC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuBar mnuBarTelaPrincipal;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuCadastroF;
    private javax.swing.JMenuItem mnuCadastroP;
    private javax.swing.JMenuItem mnuPesquiaF;
    private javax.swing.JMenuItem mnuPesquiaP;
    private javax.swing.JMenu mnuPesquisa;
    // End of variables declaration//GEN-END:variables
}
