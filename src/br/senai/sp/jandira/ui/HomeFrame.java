/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.DAO.EspecialidadeDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282225
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        initPanel();

    }
    //Atributos da class
    JPanelEspecialidades panelEspecialidades;
    JPanelPlanoDeSaude panelPlanoDeSaude;
    JPanelMedico panelMedico;

    //constantes
    private final int pos_X = 0;
    private final int pos_Y = 170;
    private final int LARGURA = 800;
    private final int ALATURA = 290;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        tituloDoHeader = new javax.swing.JLabel();
        iconeDaAgenda = new javax.swing.JLabel();
        buttonAgendamento = new javax.swing.JButton();
        buttonPasciente = new javax.swing.JButton();
        buttonMédico = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonSaida = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelNomedaEmpresa = new javax.swing.JLabel();
        jLabelSubTitulo = new javax.swing.JLabel();
        jLabelContatos = new javax.swing.JLabel();
        jPanelLinhaAmarela = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelSite = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setLayout(null);

        tituloDoHeader.setBackground(new java.awt.Color(0, 0, 0));
        tituloDoHeader.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        tituloDoHeader.setForeground(new java.awt.Color(255, 255, 255));
        tituloDoHeader.setText("Sistema para agendamento de Consulta");
        header.add(tituloDoHeader);
        tituloDoHeader.setBounds(80, 40, 420, 26);

        iconeDaAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendario (1).png"))); // NOI18N
        header.add(iconeDaAgenda);
        iconeDaAgenda.setBounds(6, 6, 90, 88);

        getContentPane().add(header);
        header.setBounds(0, 0, 810, 110);

        buttonAgendamento.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        buttonAgendamento.setToolTipText("Agendamento");
        buttonAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgendamento);
        buttonAgendamento.setBounds(100, 110, 90, 40);

        buttonPasciente.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonPasciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPasciente.setToolTipText("Paciente");
        buttonPasciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPascienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPasciente);
        buttonPasciente.setBounds(190, 110, 90, 40);

        buttonMédico.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonMédico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMédico.setToolTipText("Médico");
        buttonMédico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMédicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMédico);
        buttonMédico.setBounds(280, 110, 100, 40);

        buttonEspecialidades.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/recompensa.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(380, 110, 120, 40);

        buttonSaida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/saida-de-emergencia.png"))); // NOI18N
        buttonSaida.setToolTipText("Saír");
        buttonSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSaida);
        buttonSaida.setBounds(620, 110, 180, 40);

        buttonPlanoDeSaude.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano De Saúde");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(500, 110, 120, 40);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/homet-32.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(0, 110, 100, 40);

        panelHome.setBackground(new java.awt.Color(51, 51, 51));
        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N
        panelHome.setLayout(null);

        labelNomedaEmpresa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelNomedaEmpresa.setForeground(new java.awt.Color(255, 255, 0));
        labelNomedaEmpresa.setText("TroiaV");
        panelHome.add(labelNomedaEmpresa);
        labelNomedaEmpresa.setBounds(10, 60, 90, 20);

        jLabelSubTitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSubTitulo.setText("Sistema de Agentamento Para consulta");
        panelHome.add(jLabelSubTitulo);
        jLabelSubTitulo.setBounds(10, 80, 240, 14);

        jLabelContatos.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabelContatos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContatos.setText("Dados para contatos:");
        panelHome.add(jLabelContatos);
        jLabelContatos.setBounds(630, 120, 150, 20);

        jPanelLinhaAmarela.setBackground(new java.awt.Color(255, 255, 102));
        panelHome.add(jPanelLinhaAmarela);
        jPanelLinhaAmarela.setBounds(0, 100, 800, 2);

        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail: TroiaV5@gmail.com");
        panelHome.add(jLabelEmail);
        jLabelEmail.setBounds(630, 140, 160, 16);

        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("Telefone: (11) 4002-8922");
        panelHome.add(jLabelTelefone);
        jLabelTelefone.setBounds(630, 160, 140, 16);

        jLabelSite.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSite.setText("Site: www.Troia.com.br");
        panelHome.add(jLabelSite);
        jLabelSite.setBounds(630, 180, 140, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cavalo-de-troia.png"))); // NOI18N
        panelHome.add(jLabel1);
        jLabel1.setBounds(300, 30, 70, 70);

        getContentPane().add(panelHome);
        panelHome.setBounds(0, 150, 800, 290);

        setSize(new java.awt.Dimension(816, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendamentoActionPerformed

    private void buttonMédicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMédicoActionPerformed
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(false);
        panelMedico.setVisible(true);
    }//GEN-LAST:event_buttonMédicoActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(true);
        panelHome.setVisible(false);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonPascienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPascienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPascienteActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelPlanoDeSaude.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaidaActionPerformed

        JOptionPane.showMessageDialog(this, "Tem certeza que deseja sair do aplicatico", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
        dispose();


    }//GEN-LAST:event_buttonSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgendamento;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMédico;
    private javax.swing.JButton buttonPasciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSaida;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iconeDaAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContatos;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSite;
    private javax.swing.JLabel jLabelSubTitulo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelLinhaAmarela;
    private javax.swing.JLabel labelNomedaEmpresa;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel tituloDoHeader;
    // End of variables declaration//GEN-END:variables

    private void initPanel() {

        panelEspecialidades = new JPanelEspecialidades();

        panelEspecialidades.setBounds(
                pos_X,
                pos_Y,
                LARGURA,
                ALATURA);

        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);

        panelPlanoDeSaude = new JPanelPlanoDeSaude();

        panelPlanoDeSaude.setBounds(
                pos_X,
                pos_Y,
                LARGURA,
                ALATURA);

        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);

        panelMedico = new JPanelMedico();

        panelMedico.setBounds(
                pos_X,
                pos_Y,
                LARGURA,
                ALATURA);

        getContentPane().add(panelMedico);
        panelMedico.setVisible(false);
    }

}
