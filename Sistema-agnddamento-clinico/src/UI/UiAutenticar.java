package UI;

import Controler.ControladorUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UiAutenticar extends JDialog{
    private JLabel labelCPF;
    private JTextField inputCPF;
    private JPasswordField inputSenha;
    private JLabel labelSenha;
    private JPanel painelPrincipal;
    private JButton btnLogar;

    private JFrame frame = new JFrame();

    public UiAutenticar() {
        btnLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLogarActionPerformed();
            }
        });
    }

    private String getCPF(){
        return this.inputCPF.getText();
    }

    private char[] getSenha(){
        return this.inputSenha.getPassword();
    }

    private void btnLogarActionPerformed(){
        char[] senha = UiAutenticar.this.getSenha();
        String cpf = UiAutenticar.this.getCPF();

        if (!ControladorUsuario.autenticar(cpf, senha)) {
            JOptionPane.showMessageDialog(null, "CPF ou Senha estão errados!!\nTente novamente!!");
            return;
        }

        JFrame frameAutenticacao = new JFrame("Autenticação");
        frameAutenticacao.setVisible(false);
    }


    public Container getPainelPrincipal() {
        return this.painelPrincipal;
    }
}
