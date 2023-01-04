/*
 * 
 * 
 */
package ui;

import controler.ControladorUsuario;
import java.util.Arrays;
import javax.swing.JOptionPane;
import user.Administrador;
import user.Usuario;

/**
 *
 * @author Guilherme
 */
public class UIAdicionarUsuario extends javax.swing.JDialog {

    /**
     * Creates new form UIAdicionarUsuario
     */
    public UIAdicionarUsuario(java.awt.Frame parent, boolean modal) {
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

        labelNome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labbelCPF = new javax.swing.JLabel();
        inputCPF = new javax.swing.JTextField();
        labbelSenha = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        labelConfirmarSenha = new javax.swing.JLabel();
        inputConfirmarSenha = new javax.swing.JPasswordField();
        labelTipoUsuario = new javax.swing.JLabel();
        inputTipoUsuario = new javax.swing.JComboBox<>();
        labelEspecializacaoMedico = new javax.swing.JLabel();
        inputEspecializacao = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        labelCamposObrigatorios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(252, 200));
        getContentPane().setLayout(new java.awt.GridLayout(9, 2, 10, 10));

        labelNome.setText("Nome*:");
        getContentPane().add(labelNome);

        inputNome.setToolTipText("");
        getContentPane().add(inputNome);

        labbelCPF.setText("CPF*:");
        getContentPane().add(labbelCPF);
        getContentPane().add(inputCPF);

        labbelSenha.setText("Senha*:");
        getContentPane().add(labbelSenha);
        getContentPane().add(inputSenha);

        labelConfirmarSenha.setText("Confirmar Senha*:");
        getContentPane().add(labelConfirmarSenha);
        getContentPane().add(inputConfirmarSenha);

        labelTipoUsuario.setText("Tipo de usário*:");
        getContentPane().add(labelTipoUsuario);

        inputTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico", "Secretário", "Administrador" }));
        inputTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(inputTipoUsuario);

        labelEspecializacaoMedico.setText("Especialização Médico:");
        getContentPane().add(labelEspecializacaoMedico);
        getContentPane().add(inputEspecializacao);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);

        labelCamposObrigatorios.setForeground(new java.awt.Color(255, 0, 51));
        labelCamposObrigatorios.setText("Campos obrigatórios *.");
        getContentPane().add(labelCamposObrigatorios);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nome = this.inputNome.getText();
        String cpf = this.inputCPF.getText();
        char[] senha = this.inputSenha.getPassword();
        char[] confirmarSenha = this.inputConfirmarSenha.getPassword();
        String tipoUsuario = this.inputTipoUsuario.getSelectedItem().toString();
        String especializacaoMedico = this.inputEspecializacao.getText();
        
        if (ControladorUsuario.isListaUsuarioEmpty() && !tipoUsuario.equalsIgnoreCase("Administrador")){
            JOptionPane.showMessageDialog(null, "O Primeiro Usuário deve ser um administrador!!");
            return;
        }
        
        if (nome.isBlank() || cpf.isBlank() || senha.equals("") || confirmarSenha.equals("") || tipoUsuario.isBlank()){
            JOptionPane.showMessageDialog(null, "Alguns campos estão vazios!! Preencha os campos obrigatórios!!");
            return;
        }
        
        if (tipoUsuario.equalsIgnoreCase("Médico") && especializacaoMedico.isBlank()){
            JOptionPane.showMessageDialog(null, "A especialização do Médico é obrigatória apra esse tipo de usuário!!");
            return;
        }
        
        if (!Arrays.equals(senha, confirmarSenha)){
            JOptionPane.showMessageDialog(null, "As senhas não são iguais!!");
            return;
        }
        
        if(!ControladorUsuario.add(nome, cpf, senha, tipoUsuario, especializacaoMedico)){
            JOptionPane.showMessageDialog(null, "Usuário já registrado!");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Usuário registrado!");
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void inputTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoUsuarioActionPerformed
        String tipoUsuario = (String) this.inputTipoUsuario.getSelectedItem();
        
        if (!tipoUsuario.equalsIgnoreCase("Médico")){
            this.inputEspecializacao.setEditable(false);
            return;
        }
        this.inputEspecializacao.setText("");
        this.inputEspecializacao.setEditable(true);
    }//GEN-LAST:event_inputTipoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField inputCPF;
    private javax.swing.JPasswordField inputConfirmarSenha;
    private javax.swing.JTextField inputEspecializacao;
    private javax.swing.JTextField inputNome;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JComboBox<String> inputTipoUsuario;
    private javax.swing.JLabel labbelCPF;
    private javax.swing.JLabel labbelSenha;
    private javax.swing.JLabel labelCamposObrigatorios;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelEspecializacaoMedico;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTipoUsuario;
    // End of variables declaration//GEN-END:variables

    public Usuario getAdministrador() {
        String cpf = this.inputCPF.getText();
        return (Administrador) ControladorUsuario.getUsuario(cpf);
    }
}
