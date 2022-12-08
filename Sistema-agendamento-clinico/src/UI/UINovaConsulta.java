/*
 * 
 * 
 */
package UI;

import Clinica.Clinica;
import Controler.ControladorConsulta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import user.Medico;
import user.Secretario;
import user.Usuario;

/**
 *
 * @author Guilherme
 */
public class UINovaConsulta extends javax.swing.JDialog {

    /**
     * Creates new form UINovaConsulta
     */
    public UINovaConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomePaciente = new javax.swing.JLabel();
        inputNomePaciente = new javax.swing.JTextField();
        labelCPFPaciente = new javax.swing.JLabel();
        inputCPFPaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMedicos = new javax.swing.JList<>();
        labelHorario = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputHorario = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelNomePaciente.setText("Nome do Paciente*:");

        labelCPFPaciente.setText("CPF do Paciente:");

        jLabel3.setText("Médico*:");

        jScrollPane1.setViewportView(listaMedicos);

        labelHorario.setText("Horário*:");

        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Campos obrigatórios*.");

        inputHorario.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCPFPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNomePaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAgendar)
                    .addComponent(inputNomePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(inputCPFPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(inputHorario))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(labelCPFPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCPFPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendar)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String nomePaciente = this.inputNomePaciente.getText();
        String CPFPaciente = this.inputCPFPaciente.getText();
        String nomeMedico = this.listaMedicos.getSelectedValue();
        String horarioString = formater.format(this.inputHorario.getValue());
        
        if (nomePaciente.isEmpty() || CPFPaciente.isEmpty() || nomeMedico == null || horarioString.isEmpty()){
            JOptionPane.showMessageDialog(null, "Algum dos campos obrigatórios estão vazios!! Por favor preencha-os!!");
            return;
        }

        Date horario = null;
        try {
            horario = formater.parse(horarioString);
        } catch (ParseException ex) {}
        
        if(!ControladorConsulta.add(nomePaciente, CPFPaciente, nomeMedico, horario)){
            JOptionPane.showMessageDialog(null, "Médico indisponível na data e horário informados!! Ou Data inválida!!");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Consulta Agendada!!");
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Clinica clinica = Clinica.getInstance();
        
        Vector<String> nomesMedicos = new Vector<>();
        
        for (Usuario user : clinica.getUsuarios()){
            if (user instanceof Medico){
                nomesMedicos.add(user.getNomeDeUsuario());
            }
        }
        
        this.listaMedicos.setListData(nomesMedicos);
    }//GEN-LAST:event_formWindowActivated

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JTextField inputCPFPaciente;
    private javax.swing.JSpinner inputHorario;
    private javax.swing.JTextField inputNomePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCPFPaciente;
    private javax.swing.JLabel labelHorario;
    private javax.swing.JLabel labelNomePaciente;
    private javax.swing.JList<String> listaMedicos;
    // End of variables declaration//GEN-END:variables
}
