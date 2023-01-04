/*
 * 
 * 
 */
package ui;

import consulta.Consulta;
import controler.ControladorConsulta;
import controler.ControladorUsuario;
import serializacao.Serializa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import user.*;

/**
 *
 * @author Guilherme
 */
public class UIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form UIPrincipal
     */
    public UIPrincipal() {
        initComponents();
    }
    
    private Usuario usuarioLogin = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        btnNovoUsuario = new javax.swing.JMenuItem();
        btnAssociarSecretarioMedico = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        btnConfirmarConsulta = new javax.swing.JMenuItem();
        btnNovaConsulta = new javax.swing.JMenuItem();
        btnCancelarConsulta = new javax.swing.JMenuItem();
        menuVerificarConsultas = new javax.swing.JMenu();
        btnVerifiacrConsultasDia = new javax.swing.JMenuItem();
        btnVerificarConsultasPaciente = new javax.swing.JMenuItem();
        btnVerificarConsultasMedico = new javax.swing.JMenuItem();
        btnPagarConsulta = new javax.swing.JMenuItem();
        bntHistorico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            @Override
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuUsuario.setText("Usuários");

        btnNovoUsuario.setText("Novo usuario");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(btnNovoUsuario);

        btnAssociarSecretarioMedico.setText("Associar Secretário a um Médico");
        btnAssociarSecretarioMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarSecretarioMedicoActionPerformed(evt);
            }
        });
        menuUsuario.add(btnAssociarSecretarioMedico);

        jMenuBar1.add(menuUsuario);

        menuConsultas.setText("Consultas");

        btnConfirmarConsulta.setText("Confirmar Consulta");
        btnConfirmarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarConsultaActionPerformed(evt);
            }
        });
        menuConsultas.add(btnConfirmarConsulta);

        btnNovaConsulta.setText("Nova Consulta");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });
        menuConsultas.add(btnNovaConsulta);

        btnCancelarConsulta.setText("Cancelar Consulta");
        btnCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultaActionPerformed(evt);
            }
        });
        menuConsultas.add(btnCancelarConsulta);

        menuVerificarConsultas.setText("VerificarConsultas");

        btnVerifiacrConsultasDia.setText("Do dia");
        btnVerifiacrConsultasDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifiacrConsultasDiaActionPerformed(evt);
            }
        });
        menuVerificarConsultas.add(btnVerifiacrConsultasDia);

        btnVerificarConsultasPaciente.setText("De Paciente");
        btnVerificarConsultasPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarConsultasPacienteActionPerformed(evt);
            }
        });
        menuVerificarConsultas.add(btnVerificarConsultasPaciente);

        btnVerificarConsultasMedico.setText("De Médico");
        btnVerificarConsultasMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarConsultasMedicoActionPerformed(evt);
            }
        });
        menuVerificarConsultas.add(btnVerificarConsultasMedico);

        menuConsultas.add(menuVerificarConsultas);

        btnPagarConsulta.setText("Pagar Consulta");
        btnPagarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarConsultaActionPerformed(evt);
            }
        });
        menuConsultas.add(btnPagarConsulta);

        bntHistorico.setText("Histórico");
        bntHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntHistoricoActionPerformed(evt);
            }
        });
        menuConsultas.add(bntHistorico);

        jMenuBar1.add(menuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Serializa.leituraDoArquivo();

        //caso não exista nenhum usuário
        if (ControladorUsuario.isListaUsuarioEmpty()){
            this.renderPrimeiroUsuario();
        }else{
            this.renderAutenticacao();
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        if (this.usuarioLogin instanceof Administrador){
            java.awt.EventQueue.invokeLater(() -> {
                UIAdicionarUsuario form = new UIAdicionarUsuario(new javax.swing.JFrame(), true);
                form.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnAssociarSecretarioMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarSecretarioMedicoActionPerformed
        if (this.usuarioLogin instanceof Administrador || this.usuarioLogin instanceof Medico){
            java.awt.EventQueue.invokeLater(() -> {
                UIAssociarSecretarioMedico dialog = new UIAssociarSecretarioMedico(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnAssociarSecretarioMedicoActionPerformed

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UINovaConsulta dialog = new UINovaConsulta(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Serializa.gravaNoArquivo();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultaActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UICancelarConsulta dialog = new UICancelarConsulta(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnCancelarConsultaActionPerformed

    private void btnConfirmarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarConsultaActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UIConfirmarPaciente dialog = new UIConfirmarPaciente(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnConfirmarConsultaActionPerformed

    private void btnVerifiacrConsultasDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifiacrConsultasDiaActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UIConsultasDia dialog = new UIConsultasDia(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnVerifiacrConsultasDiaActionPerformed

    private void btnVerificarConsultasPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarConsultasPacienteActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UIConsultasPaciente dialog = new UIConsultasPaciente(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnVerificarConsultasPacienteActionPerformed

    private void btnVerificarConsultasMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarConsultasMedicoActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UIConsultasMedico dialog = new UIConsultasMedico(new javax.swing.JFrame(), true, (Secretario) this.usuarioLogin);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnVerificarConsultasMedicoActionPerformed

    private void btnPagarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarConsultaActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UIPagarConsulta dialog = new UIPagarConsulta(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
    }//GEN-LAST:event_btnPagarConsultaActionPerformed

    private void bntHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntHistoricoActionPerformed
        if (this.usuarioLogin instanceof Secretario){
            java.awt.EventQueue.invokeLater(() -> {
                UIHistoricoConsultas dialog = new UIHistoricoConsultas(new javax.swing.JFrame(), true, (Secretario) this.usuarioLogin);
                dialog.setVisible(true);
            });
        } else {
            JOptionPane.showMessageDialog(null,"Usuário não autorizado para utilizar esta função!");
        }
       
    }//GEN-LAST:event_bntHistoricoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UIPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bntHistorico;
    private javax.swing.JMenuItem btnAssociarSecretarioMedico;
    private javax.swing.JMenuItem btnCancelarConsulta;
    private javax.swing.JMenuItem btnConfirmarConsulta;
    private javax.swing.JMenuItem btnNovaConsulta;
    private javax.swing.JMenuItem btnNovoUsuario;
    private javax.swing.JMenuItem btnPagarConsulta;
    private javax.swing.JMenuItem btnVerifiacrConsultasDia;
    private javax.swing.JMenuItem btnVerificarConsultasMedico;
    private javax.swing.JMenuItem btnVerificarConsultasPaciente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVerificarConsultas;
    // End of variables declaration//GEN-END:variables

    private void renderPrimeiroUsuario(){
        java.awt.EventQueue.invokeLater(() -> {
            UIAdicionarUsuario form = new UIAdicionarUsuario(new javax.swing.JFrame(), true);
            form.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            form.setVisible(true);
            this.usuarioLogin = form.getAdministrador();
        });
    }
    
    private void renderAutenticacao(){
        java.awt.EventQueue.invokeLater(() -> {
            UIAutenticar dialog = new UIAutenticar(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
            this.usuarioLogin = dialog.getUsuarioAutenticado();
        });
    }

    public static void notificarSecretario() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        ArrayList<Consulta> consultasHoje = ControladorConsulta.getConsultasDia(new Date());
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setNumRows(0);
        
        tableModel.setColumnIdentifiers(new Object[] {
            "Nome do Paciente", "CPF do Paciente", "Nome do Médico", "Horário", "Confirmada"
        });

        for (Consulta cons : consultasHoje){
            tableModel.addRow(new Object[] {
                cons.getPaciente(), cons.getCpfpaciente(), cons.getMedico().getNomeDeUsuario(), formater.format(cons.getHorario()), cons.getConfirmada() ? "Sim" : "Não"
            });
        }
        
        JTable tabelaConsultas = new JTable(tableModel);
        JOptionPane.showMessageDialog(null, new Object[] {
        new JLabel("Consultas do dia:"), new JScrollPane(tabelaConsultas)
        });
    }
}
