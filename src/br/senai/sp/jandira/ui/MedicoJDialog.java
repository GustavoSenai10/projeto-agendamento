package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.DAO.EspecialidadeDAO;
import br.senai.sp.jandira.DAO.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MedicoJDialog extends javax.swing.JDialog {
    
    private Medico medico;
    private OperacaoEnum operacao;
    
    public MedicoJDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
    }
    
    public MedicoJDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        
        this.medico = medico;
        this.operacao = operacao;
        preencherFormulario();
    }
    
    public void preencherFormulario() {
        
        jTextFieldCódigo2.setText(medico.getCodigo().toString());
        jTextFieldNomeDoMedico.setText(medico.getNome());
        jTextFieldCRM.setText(medico.getCrm());
        jTextFieldEmail.setText(medico.getEmail());
        jTextFieldTelefone.setText(medico.getTelefone());
       
    }
    
    private void preencherTitulo() {
        labelTitulo.setText("médico - " + operacao);
        
        if (operacao == OperacaoEnum.EDITAR) {
            iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar(1).png")));
            
        } else {
            iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar(1).png")));
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        iconAdicionar = new javax.swing.JLabel();
        jPanelInformacoesDosMedicos = new javax.swing.JPanel();
        jLabelDataDeNascimento = new javax.swing.JLabel();
        jTextFieldNomeDoMedico = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldDataDeNascimento = new javax.swing.JTextField();
        jLabelCódigo1 = new javax.swing.JLabel();
        jTextFieldCRM = new javax.swing.JTextField();
        jLabelCRM1 = new javax.swing.JLabel();
        jLabelNomeDoMedico1 = new javax.swing.JLabel();
        jTextFieldCódigo2 = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelListaDeEspecialidades = new javax.swing.JLabel();
        jScrollPanelLista = new javax.swing.JScrollPane();
        jListTabelaEspecialidades = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDeEspecialidadeDoMedico = new javax.swing.JList<>();
        jLabelEspecialidadesDoMedico = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 255, 51));
        labelTitulo.setText("Médico - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(80, 30, 260, 22);

        iconAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        jPanel1.add(iconAdicionar);
        iconAdicionar.setBounds(20, 20, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 80);

        jPanelInformacoesDosMedicos.setBackground(new java.awt.Color(51, 51, 51));
        jPanelInformacoesDosMedicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Dos Médicos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanelInformacoesDosMedicos.setLayout(null);

        jLabelDataDeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataDeNascimento.setText("Data De Nascimento:");
        jPanelInformacoesDosMedicos.add(jLabelDataDeNascimento);
        jLabelDataDeNascimento.setBounds(550, 100, 120, 16);

        jTextFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jTextFieldNomeDoMedico);
        jTextFieldNomeDoMedico.setBounds(280, 60, 370, 22);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jButtonSalvar);
        jButtonSalvar.setBounds(600, 280, 90, 40);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-x.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jButtonCancelar);
        jButtonCancelar.setBounds(510, 280, 80, 40);

        jTextFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jTextFieldDataDeNascimento);
        jTextFieldDataDeNascimento.setBounds(550, 120, 130, 22);

        jLabelCódigo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCódigo1.setText("Código :");
        jPanelInformacoesDosMedicos.add(jLabelCódigo1);
        jLabelCódigo1.setBounds(20, 40, 50, 16);

        jTextFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCRMActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jTextFieldCRM);
        jTextFieldCRM.setBounds(140, 60, 110, 22);

        jLabelCRM1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCRM1.setText("CRM:");
        jPanelInformacoesDosMedicos.add(jLabelCRM1);
        jLabelCRM1.setBounds(140, 40, 50, 16);

        jLabelNomeDoMedico1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeDoMedico1.setText("Nome do Médico:");
        jPanelInformacoesDosMedicos.add(jLabelNomeDoMedico1);
        jLabelNomeDoMedico1.setBounds(280, 40, 110, 16);

        jTextFieldCódigo2.setEditable(false);
        jTextFieldCódigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCódigo2ActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jTextFieldCódigo2);
        jTextFieldCódigo2.setBounds(20, 60, 80, 22);

        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone:");
        jPanelInformacoesDosMedicos.add(jLabelTelefone);
        jLabelTelefone.setBounds(20, 100, 70, 16);

        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(20, 120, 140, 22);

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(190, 120, 340, 22);

        jLabelListaDeEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        jLabelListaDeEspecialidades.setText("Lista De Especialidades:");
        jPanelInformacoesDosMedicos.add(jLabelListaDeEspecialidades);
        jLabelListaDeEspecialidades.setBounds(20, 160, 130, 16);

        jScrollPanelLista.setViewportView(jListTabelaEspecialidades);

        jPanelInformacoesDosMedicos.add(jScrollPanelLista);
        jScrollPanelLista.setBounds(20, 180, 120, 140);

        jListDeEspecialidadeDoMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListDeEspecialidadeDoMedico);

        jPanelInformacoesDosMedicos.add(jScrollPane2);
        jScrollPane2.setBounds(240, 180, 110, 146);

        jLabelEspecialidadesDoMedico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEspecialidadesDoMedico.setText("Especialidades do Médico:");
        jPanelInformacoesDosMedicos.add(jLabelEspecialidadesDoMedico);
        jLabelEspecialidadesDoMedico.setBounds(240, 160, 150, 16);

        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail:");
        jPanelInformacoesDosMedicos.add(jLabelEmail);
        jLabelEmail.setBounds(190, 100, 60, 16);

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelInformacoesDosMedicos.add(jButton1);
        jButton1.setBounds(150, 210, 70, 23);

        jButton2.setText("<");
        jPanelInformacoesDosMedicos.add(jButton2);
        jButton2.setBounds(150, 250, 70, 23);

        getContentPane().add(jPanelInformacoesDosMedicos);
        jPanelInformacoesDosMedicos.setBounds(0, 80, 720, 330);

        setSize(new java.awt.Dimension(736, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDoMedicoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'CRM' não pode estar vazio.");
            jTextFieldCRM.grabFocus();
        } else if (jTextFieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Telefone' não pode estar vazio.");
            jTextFieldNomeDoMedico.grabFocus();
        } else if (jTextFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Data de Nascimento' não pode estar vazio.");
            jTextFieldTelefone.grabFocus();
        } else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'E-mail' não pode estar vazio.");
            jTextFieldEmail.grabFocus();
        } else if (jTextFieldDataDeNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome do médico' não pode estar vazio.");
            jTextFieldDataDeNascimento.grabFocus();
        } else {
            if (operacao == OperacaoEnum.ADICIONA) {
                adicionar();
            } else {
                editar();
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataDeNascimentoActionPerformed

    private void jTextFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCRMActionPerformed

    private void jTextFieldCódigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCódigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCódigo2ActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    private void adicionar() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Medico medico = new Medico();
        
        medico.setCrm(jTextFieldCRM.getText());
        medico.setEmail(jTextFieldEmail.getText());
        medico.setNome(jTextFieldNomeDoMedico.getText());
        medico.setTelefone(jTextFieldTelefone.getText());
        medico.setdataDeNascimento(LocalDate.parse(jTextFieldDataDeNascimento.getText(), formato));
        
        System.out.println(medico.getdataDeNascimento());
        
        MedicoDAO.gravar(medico);
        
        JOptionPane.showMessageDialog(
                this,
                "Médico gravado com sucesso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void editar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        medico.setCrm(jTextFieldCRM.getText());
        medico.setNome(jTextFieldNomeDoMedico.getText());
        medico.setEmail(jTextFieldEmail.getText());
        medico.setTelefone(jTextFieldTelefone.getText());
        medico.setdataDeNascimento(LocalDate.parse(jTextFieldDataDeNascimento.getText(), formato));
        
        MedicoDAO.atualizar(medico);
        JOptionPane.showMessageDialog(
                this,
                "Médico atualizado com sucesso!",
                "Editar Médico",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAdicionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCRM1;
    private javax.swing.JLabel jLabelCódigo1;
    private javax.swing.JLabel jLabelDataDeNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEspecialidadesDoMedico;
    private javax.swing.JLabel jLabelListaDeEspecialidades;
    private javax.swing.JLabel jLabelNomeDoMedico1;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JList<String> jListDeEspecialidadeDoMedico;
    private javax.swing.JList<String> jListTabelaEspecialidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInformacoesDosMedicos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPanelLista;
    private javax.swing.JTextField jTextFieldCRM;
    private javax.swing.JTextField jTextFieldCódigo2;
    private javax.swing.JTextField jTextFieldDataDeNascimento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeDoMedico;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

    private String[] pegarEspecialidade() {
        String[] teste = {"agua"};
        return teste;
    }

    private void pegarLista() {
        
        jScrollPanelLista.setViewportView(jListTabelaEspecialidades);
        jListTabelaEspecialidades.setListData(pegarEspecialidade());
        
    }
    
}
