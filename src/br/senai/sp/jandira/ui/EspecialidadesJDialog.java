
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.DAO.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import java.awt.TextField;
import javax.swing.JOptionPane;


public class EspecialidadesJDialog extends javax.swing.JDialog {

        Especialidade especialidade;
    public EspecialidadesJDialog(
            java.awt.Frame parent,
            boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public EspecialidadesJDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e) {
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        
        preencherFormulario();
    }
    
    public void preencherFormulario(){
        labelTitulo.setText("Especialidades-EDITAR");
        iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png")));
        jTextFieldCódigo.setText(especialidade.getCodigo().toString());
        jTextFieldNomeDaEspecialidade.setText(especialidade.getNome());
        jTextFieldDescricaoDaEspecialidade.setText(especialidade.getDescricao());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        iconAdicionar = new javax.swing.JLabel();
        jPanelDetalhesDaEspecialidades = new javax.swing.JPanel();
        jLabelCódigo = new javax.swing.JLabel();
        jTextFieldCódigo = new javax.swing.JTextField();
        jLabelNomeDaEspecialidade = new javax.swing.JLabel();
        jTextFieldNomeDaEspecialidade = new javax.swing.JTextField();
        jLabelDescricaoDaEspecialidade = new javax.swing.JLabel();
        jTextFieldDescricaoDaEspecialidade = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 255, 51));
        labelTitulo.setText("Especialidades - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(80, 30, 260, 22);

        iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        jPanel1.add(iconAdicionar);
        iconAdicionar.setBounds(20, 20, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 70);

        jPanelDetalhesDaEspecialidades.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDetalhesDaEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanelDetalhesDaEspecialidades.setLayout(null);

        jLabelCódigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCódigo.setText("Código :");
        jPanelDetalhesDaEspecialidades.add(jLabelCódigo);
        jLabelCódigo.setBounds(20, 40, 50, 16);

        jTextFieldCódigo.setEditable(false);
        jTextFieldCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCódigoActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldCódigo);
        jTextFieldCódigo.setBounds(20, 70, 120, 22);

        jLabelNomeDaEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeDaEspecialidade.setText("Nome da Especialidade :");
        jPanelDetalhesDaEspecialidades.add(jLabelNomeDaEspecialidade);
        jLabelNomeDaEspecialidade.setBounds(20, 120, 140, 16);

        jTextFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldNomeDaEspecialidade);
        jTextFieldNomeDaEspecialidade.setBounds(20, 140, 490, 22);

        jLabelDescricaoDaEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescricaoDaEspecialidade.setText("Descrição da Especialidade :");
        jPanelDetalhesDaEspecialidades.add(jLabelDescricaoDaEspecialidade);
        jLabelDescricaoDaEspecialidade.setBounds(20, 180, 200, 16);

        jTextFieldDescricaoDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldDescricaoDaEspecialidade);
        jTextFieldDescricaoDaEspecialidade.setBounds(20, 200, 490, 22);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jButtonSalvar);
        jButtonSalvar.setBounds(520, 290, 80, 40);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-x.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jPanelDetalhesDaEspecialidades.add(jButtonCancelar);
        jButtonCancelar.setBounds(610, 290, 70, 40);

        getContentPane().add(jPanelDetalhesDaEspecialidades);
        jPanelDetalhesDaEspecialidades.setBounds(10, 90, 690, 340);

        setBounds(0, 0, 732, 478);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDaEspecialidadeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
            //Criar um objeto especialidade
            Especialidade especialidade = new Especialidade();
            especialidade.setNome(jTextFieldNomeDaEspecialidade.getText());
            especialidade.setDescricao(jTextFieldDescricaoDaEspecialidade.getText());
          
            //Criar Especialidade Dao
            EspecialidadeDAO.gravar(especialidade);
           
            JOptionPane.showMessageDialog(this,
                    "Especionalidade Salva com sucesso",
                    "Especionalidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCódigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCódigoActionPerformed

    private void jTextFieldDescricaoDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoDaEspecialidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EspecialidadesJDialog dialog = new EspecialidadesJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCódigo;
    private javax.swing.JLabel jLabelDescricaoDaEspecialidade;
    private javax.swing.JLabel jLabelNomeDaEspecialidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDetalhesDaEspecialidades;
    private javax.swing.JTextField jTextFieldCódigo;
    private javax.swing.JTextField jTextFieldDescricaoDaEspecialidade;
    private javax.swing.JTextField jTextFieldNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
