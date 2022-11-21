package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.DAO.MedicoDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JTable;

public class JPanelMedico extends javax.swing.JPanel {

    
    public JPanelMedico() {
        initComponents();
        ajustarTabela();
        prenccherTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMedico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeMedico = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        jPanelMedico.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanelMedico.setPreferredSize(new java.awt.Dimension(800, 290));
        jPanelMedico.setLayout(null);

        tabelaDeMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaDeMedico);

        jPanelMedico.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 780, 220);

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-x.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir Especialidade");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        jPanelMedico.add(buttonExcluir);
        buttonExcluir.setBounds(660, 240, 130, 40);

        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar (1).png"))); // NOI18N
        buttonEditar.setToolTipText("Alterar Especialidade ");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        jPanelMedico.add(buttonEditar);
        buttonEditar.setBounds(530, 240, 130, 40);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar Especialidade");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanelMedico.add(buttonAdicionar);
        buttonAdicionar.setBounds(400, 240, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        

    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
       
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

      
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanelMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDeMedico;
    // End of variables declaration//GEN-END:variables
     private void prenccherTabela() {

        tabelaDeMedico.setModel(MedicoDAO.getTabelaMedico());
        ajustarTabela();
    }

    private void ajustarTabela() {

        //Impedir que o usuario movemente as calunas
        tabelaDeMedico.getTableHeader().setReorderingAllowed(false);

        //bloquear a edição das celulas da tabela
        tabelaDeMedico.setDefaultEditor(Object.class, null);

        // Definir a largura das calunas
         tabelaDeMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaDeMedico.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabelaDeMedico.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabelaDeMedico.getColumnModel().getColumn(2).setPreferredWidth(490);

    }





}
