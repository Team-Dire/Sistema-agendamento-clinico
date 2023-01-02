/*
 * 
 * 
 */
package UI;

import Consulta.Consulta;
import Controler.ControladorConsulta;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.Secretario;

/**
 *
 * @author Guilherme
 */
public class UIConsultasMedico extends javax.swing.JDialog {

    /**
     * Creates new form UIConsultasMedico
     */
    public UIConsultasMedico(java.awt.Frame parent, boolean modal, Secretario secre) {
        super(parent, modal);
        initComponents();
        this.secre = secre;
    }
    
    private Secretario secre;

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeMedico = new javax.swing.JLabel();
        labelConsulta = new javax.swing.JLabel();
        inputNomeMedico = new javax.swing.JTextField();
        btnVerificarPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelNomeMedico.setText("Nome do Médico:");

        labelConsulta.setText("Consultas:");

        btnVerificarPaciente.setText("Buscar");
        btnVerificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarPacienteActionPerformed(evt);
            }
        });

        tabelaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Paciente", "CPF do Paciente", "Nome do Médico", "Horário", "Confirmada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelConsulta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomeMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificarPaciente)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeMedico)
                    .addComponent(btnVerificarPaciente)
                    .addComponent(inputNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(labelConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarPacienteActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        ArrayList<Consulta> consultasHoje = ControladorConsulta.getConsultasMedico(this.inputNomeMedico.getText(), this.secre);
        if (consultasHoje.isEmpty()){
            JOptionPane.showMessageDialog(null, "Médico não trabalha com o secretário");
            return;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) this.tabelaConsultas.getModel();
        tableModel.setNumRows(0);

        for (Consulta cons : consultasHoje){
            tableModel.addRow(new Object[] {
                cons.getPaciente(), cons.getCPFpaciente(), cons.getMedico().getNomeDeUsuario(), formater.format(cons.getHorario()), cons.getConfirmada() ? "Sim" : "Não"
            });
        }
    }//GEN-LAST:event_btnVerificarPacienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificarPaciente;
    private javax.swing.JTextField inputNomeMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JTable tabelaConsultas;
    // End of variables declaration//GEN-END:variables
}
