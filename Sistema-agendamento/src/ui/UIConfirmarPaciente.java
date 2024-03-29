/*
 * 
 * 
 */
package ui;

import clinica.Clinica;
import consulta.Consulta;
import controler.ControladorConsulta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme
 */
public class UIConfirmarPaciente extends javax.swing.JDialog {

    /**
     * Creates new form UIConfirmarPaciente
     */
    public UIConfirmarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelConsultas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultas = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelConsultas.setText("Consultas:");

        tabelaConsultas.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Paciente", "CPF do Paciente", "Nome do Médico", "Horário", "Confirmada"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaConsultas);

        btnConfirmar.setText("Confirmar Consulta");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelConsultas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        int indexLinha = this.tabelaConsultas.getSelectedRow();
        if (indexLinha == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma consulta para confirmar!!");
            return;
        }

        String nomePaciente = (String) this.tabelaConsultas.getValueAt(indexLinha, 0);
        String horarioString = (String) this.tabelaConsultas.getValueAt(indexLinha, 3);

        Date horario = null;
        try {
            horario = formater.parse(horarioString);
        } catch (ParseException ex) {}

        if(!ControladorConsulta.confirmar(nomePaciente, horario)){
            JOptionPane.showMessageDialog(null, "Não foi possível confirmar a consulta!!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Consulta confirmada com sucesso!!");
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel tableModel = (DefaultTableModel) this.tabelaConsultas.getModel();
        tableModel.setNumRows(0);
        
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        
        Clinica clinica = Clinica.getInstance();
        for (Consulta cons : clinica.getConsultas()){
            tableModel.addRow(new Object[] {
                cons.getPaciente(), cons.getCpfpaciente(), cons.getMedico().getNomeDeUsuario(), formater.format(cons.getHorario()), cons.getConfirmada() ? "Sim" : "Não"
            });
        }
    }//GEN-LAST:event_formWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConsultas;
    private javax.swing.JTable tabelaConsultas;
    // End of variables declaration//GEN-END:variables
}
