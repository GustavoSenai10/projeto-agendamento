
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.DAO.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class JPanelPlanoDeSaude extends javax.swing.JPanel {
    
        private int linha;
        public JPanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanoDeSaude();
        ajustarTabela();
        prenccherTabela();
    }
    
         private int getLinha() {
        linha = tabelaPlanoDeSaude.getSelectedRow();
        return linha;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlanoDeSaude = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano De Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 290));
        jPanel1.setLayout(null);

        tabelaPlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaPlanoDeSaude);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 780, 220);

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-x.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir Especialidade");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExcluir);
        buttonExcluir.setBounds(660, 240, 130, 40);

        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar (1).png"))); // NOI18N
        buttonEditar.setToolTipText("Alterar Especialidade ");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEditar);
        buttonEditar.setBounds(530, 240, 130, 40);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar Especialidade");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionar);
        buttonAdicionar.setBounds(400, 240, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
         if (getLinha() != 0) {
            excluirPlanoDeSaude();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Por Favor,Selecione a especialidade que você deseja excluir!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
       if (getLinha() != -1) {
            editarPlanoDeSaude();
        }else{
            JOptionPane.showConfirmDialog(this, "Por favor Selecione a especialidade que você deseja editar.", 
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        
        }
        
        PlanoDeSaudeJDialog plano = 
               new PlanoDeSaudeJDialog(null, true,OperacaoEnum.EDITAR);
       
       plano.setVisible(true);
       prenccherTabela();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
         PlanoDeSaudeJDialog d = new PlanoDeSaudeJDialog(null, true,OperacaoEnum.ADICIONA);
        d.setVisible(true);
        prenccherTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed
      private void editarPlanoDeSaude(){
        
          PlanoDeSaude plano = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanoDeSaudeJDialog planoDeSaudeJDialog = 
               new PlanoDeSaudeJDialog(null, true, plano,OperacaoEnum.EDITAR);
       
       planoDeSaudeJDialog.setVisible(true);
       prenccherTabela();
        
        }
    
    private void excluirPlanoDeSaude(){
      
       int resposta = JOptionPane.showConfirmDialog(this, "você confirma a exclusão?",
               "Atenção",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
       
        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            prenccherTabela();
        }
    }
    
    private Integer getCodigo (){
       String codigoStr = tabelaPlanoDeSaude.getValueAt(getLinha(), 0).toString();
       Integer codigo = Integer.valueOf(codigoStr);
       return codigo;
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPlanoDeSaude;
    // End of variables declaration//GEN-END:variables
    
     private void prenccherTabela() {

        
        tabelaPlanoDeSaude.setModel(PlanoDeSaudeDAO.getTabelaPlanoDeSaude()); 
        ajustarTabela();
    }

    private  void ajustarTabela(){
    
        //Impedir que o usuario movemente as calunas
        tabelaPlanoDeSaude.getTableHeader().setReorderingAllowed(false);
        
        //bloquear a edição das celulas da tabela
        tabelaPlanoDeSaude.setDefaultEditor(Object.class, null);
        
        // Definir a largura das calunas
        tabelaPlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaPlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabelaPlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabelaPlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(490);
        
    }





}
