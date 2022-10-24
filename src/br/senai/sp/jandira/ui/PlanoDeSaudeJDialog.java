package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.DAO.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class PlanoDeSaudeJDialog extends javax.swing.JDialog {
     private PlanoDeSaude planoDeSaude;
        private OperacaoEnum operacao;
        
        public PlanoDeSaudeJDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
            super(parent, modal);
        initComponents();
        this.operacao = operacao;
        }       
    
    public PlanoDeSaudeJDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        
        planoDeSaude = p;
        this.operacao = operacao;
        preencherFormulario();
    }
        public void preencherFormulario(){
        
        jTextFieldCódigo.setText(planoDeSaude.getCodigo().toString());
        jTextFieldOperadora.setText(planoDeSaude.getNumero());
        jTextFieldNumero.setText(planoDeSaude.getCategoria());
        
    }
        private void preencherTitulo(){
     labelTitulo.setText("Especialidades - " + operacao);
     
         if (operacao == OperacaoEnum.EDITAR) {
                iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar(1).png")));
         }else{
         
                 iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar(1).png")));
         
         
         }
        
     
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
        jLabelOperadora = new javax.swing.JLabel();
        jTextFieldOperadora = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelCategoria = new javax.swing.JLabel();
        jTextFieldCadegoria = new javax.swing.JTextField();
        jLabelValidade = new javax.swing.JLabel();
        jTextFieldValidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 255, 51));
        labelTitulo.setText("Plano de Saúde - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(80, 30, 260, 22);

        iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        jPanel1.add(iconAdicionar);
        iconAdicionar.setBounds(20, 20, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 80);

        jPanelDetalhesDaEspecialidades.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDetalhesDaEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano De Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanelDetalhesDaEspecialidades.setLayout(null);

        jLabelCódigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCódigo.setText("Código :");
        jPanelDetalhesDaEspecialidades.add(jLabelCódigo);
        jLabelCódigo.setBounds(20, 50, 50, 16);

        jTextFieldCódigo.setEditable(false);
        jTextFieldCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCódigoActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldCódigo);
        jTextFieldCódigo.setBounds(20, 70, 90, 22);

        jLabelOperadora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOperadora.setText("Operadora :");
        jPanelDetalhesDaEspecialidades.add(jLabelOperadora);
        jLabelOperadora.setBounds(20, 100, 110, 16);

        jTextFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOperadoraActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldOperadora);
        jTextFieldOperadora.setBounds(20, 120, 160, 22);

        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("Número :");
        jPanelDetalhesDaEspecialidades.add(jLabelNumero);
        jLabelNumero.setBounds(20, 160, 130, 16);

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(20, 182, 160, 20);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jButtonSalvar);
        jButtonSalvar.setBounds(600, 290, 80, 40);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-x.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jButtonCancelar);
        jButtonCancelar.setBounds(520, 290, 70, 40);

        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categoria :");
        jPanelDetalhesDaEspecialidades.add(jLabelCategoria);
        jLabelCategoria.setBounds(370, 90, 70, 16);

        jTextFieldCadegoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadegoriaActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldCadegoria);
        jTextFieldCadegoria.setBounds(370, 110, 110, 22);

        jLabelValidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValidade.setText("Validade :");
        jPanelDetalhesDaEspecialidades.add(jLabelValidade);
        jLabelValidade.setBounds(370, 150, 70, 16);

        jTextFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValidadeActionPerformed(evt);
            }
        });
        jPanelDetalhesDaEspecialidades.add(jTextFieldValidade);
        jTextFieldValidade.setBounds(370, 170, 100, 22);

        getContentPane().add(jPanelDetalhesDaEspecialidades);
        jPanelDetalhesDaEspecialidades.setBounds(10, 90, 690, 340);

        setBounds(0, 0, 732, 453);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCódigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCódigoActionPerformed

    private void jTextFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOperadoraActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (operacao ==  OperacaoEnum.ADICIONA) {
            adicionar();

        }else{
             editar();
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValidadeActionPerformed
       
    }//GEN-LAST:event_jTextFieldValidadeActionPerformed

    private void jTextFieldCadegoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadegoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadegoriaActionPerformed
    private void adicionar(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        PlanoDeSaude Plano = new PlanoDeSaude();
       Plano.setOperadora(jTextFieldOperadora.getText());
       Plano.setCategoria(jTextFieldCadegoria.getText());
       Plano.setNumero(jTextFieldNumero.getText());        
       Plano.setValidade(LocalDate.parse(jTextFieldValidade.getText(), formato));
        
        PlanoDeSaudeDAO.gravar(Plano);
        
        JOptionPane.showMessageDialog(
                this,
                "Plano de Saúde gravado com sucesso!",
                "Planos de Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
   
    
    private void editar(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        planoDeSaude.setOperadora(jTextFieldOperadora.getText());
        planoDeSaude.setCategoria(jTextFieldCadegoria.getText());
        planoDeSaude.setNumero(jTextFieldNumero.getText());
        planoDeSaude.setValidade(LocalDate.parse(jTextFieldValidade.getText(), formato));
        
        PlanoDeSaudeDAO.gravar(planoDeSaude);
        
        JOptionPane.showMessageDialog(
                this,
                "Plano de saúde atualizado com sucesso!",
                "Editar plano de saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCódigo;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelOperadora;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDetalhesDaEspecialidades;
    private javax.swing.JTextField jTextFieldCadegoria;
    private javax.swing.JTextField jTextFieldCódigo;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldOperadora;
    private javax.swing.JTextField jTextFieldValidade;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
