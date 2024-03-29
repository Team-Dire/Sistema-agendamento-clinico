package ui;

import clinica.Clinica;
import consulta.Consulta;
import controler.ControladorConsulta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme
 */
public class UIAdiarConsultas extends javax.swing.JDialog {

    /**
     * Creates new form UIAdiarConsultas
     */
    public UIAdiarConsultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHorario = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        inputHorario = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaConsultas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelHorario.setText("Horário*:");

        btnAgendar.setText("Salvar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        inputHorario.setModel(new javax.swing.SpinnerDateModel());

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
        jScrollPane2.setViewportView(tabelaConsultas);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelHorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        String horarioString = formater.format(this.inputHorario.getValue()); 
        int indexLinha = this.tabelaConsultas.getSelectedRow();
        String nomePaciente = (String) this.tabelaConsultas.getValueAt(indexLinha, 0);
        String cpfPaciente = (String) this.tabelaConsultas.getValueAt(indexLinha, 1);
        String nomeMedico = (String) this.tabelaConsultas.getValueAt(indexLinha, 2);

        
        Date novoHorario = null;
        try {
            novoHorario = formater.parse(horarioString);
        } catch (ParseException ex) {}

        if(!ControladorConsulta.adiarConsulta(nomePaciente, cpfPaciente, nomeMedico, novoHorario)){
            JOptionPane.showMessageDialog(null, "Médico indisponível na data e horário informados!! Ou Data inválida!!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Consulta Agendada!!");
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        int indexLinha = this.tabelaConsultas.getSelectedRow();
        if (indexLinha == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma consulta para editar!!");
            return;
        }
    
        String horarioString = (String) this.tabelaConsultas.getValueAt(indexLinha, 3);
        Date novoHorario = null;
        try {
            novoHorario = formater.parse(horarioString);
        } catch (ParseException ex) {
            Logger.getLogger(UIAdiarConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.inputHorario.setValue(novoHorario);
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JSpinner inputHorario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelHorario;
    private javax.swing.JTable tabelaConsultas;
    // End of variables declaration//GEN-END:variables
}
