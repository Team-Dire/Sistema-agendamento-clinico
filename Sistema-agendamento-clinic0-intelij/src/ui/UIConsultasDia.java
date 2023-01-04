/*
 * 
 * 
 */
package ui;

import consulta.Consulta;
import controler.ControladorConsulta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme
 */
public class UIConsultasDia extends javax.swing.JDialog {

    /**
     * Creates new form UIConsultasDia
     */
    public UIConsultasDia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEscolherDia = new javax.swing.JLabel();
        spinnerData = new javax.swing.JSpinner();
        labelConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultas = new javax.swing.JTable();
        btnVerificarData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelEscolherDia.setText("Escolher dia:");

        spinnerData.setModel(new javax.swing.SpinnerDateModel());

        labelConsulta.setText("Consultas:");

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

        btnVerificarData.setText("Verificar data");
        btnVerificarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelConsulta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEscolherDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificarData)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscolherDia)
                    .addComponent(spinnerData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarData))
                .addGap(12, 12, 12)
                .addComponent(labelConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        ArrayList<Consulta> consultasHoje = ControladorConsulta.getConsultasDia((Date) this.spinnerData.getValue());
        DefaultTableModel tableModel = (DefaultTableModel) this.tabelaConsultas.getModel();
        tableModel.setNumRows(0);

        for (Consulta cons : consultasHoje){
            tableModel.addRow(new Object[] {
                cons.getPaciente(), cons.getCpfpaciente(), cons.getMedico().getNomeDeUsuario(), formater.format(cons.getHorario()), cons.getConfirmada() ? "Sim" : "Não"
            });
        } 
    }//GEN-LAST:event_formWindowActivated

    private void btnVerificarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDataActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        

        ArrayList<Consulta> consultasHoje = ControladorConsulta.getConsultasDia((Date) this.spinnerData.getValue());
        DefaultTableModel tableModel = (DefaultTableModel) this.tabelaConsultas.getModel();
        tableModel.setNumRows(0);

        for (Consulta cons : consultasHoje){
            tableModel.addRow(new Object[] {
                cons.getPaciente(), cons.getCpfpaciente(), cons.getMedico().getNomeDeUsuario(), formater.format(cons.getHorario()), cons.getConfirmada() ? "Sim" : "Não"
            });
        } 
    }//GEN-LAST:event_btnVerificarDataActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificarData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelEscolherDia;
    private javax.swing.JSpinner spinnerData;
    private javax.swing.JTable tabelaConsultas;
    // End of variables declaration//GEN-END:variables
}
