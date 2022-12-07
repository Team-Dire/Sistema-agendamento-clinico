package UI;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.HierarchyBoundsAdapter;
import java.security.cert.TrustAnchor;
import java.util.jar.JarFile;

public class UiPrincipal extends JFrame{
    private JPanel painelPrincipal;
    private JMenuBar baraMenu;
    private JMenu menuUsuarios;
    private JMenuItem btnAddMedico;
    private JMenuItem btnAddSecretario;
    private JMenu menuConsultas;
    private JMenuItem btnConfirmaraConsultas;
    private JMenuItem btnAddConsulta;

    public static void main (String[] args){
        JFrame framePrincipal = new JFrame("Agendamento Clínico");
        framePrincipal.setContentPane(new UiPrincipal().painelPrincipal);
        framePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        framePrincipal.pack();
        framePrincipal.setVisible(true);
        UiPrincipal.interfaceAutenticacao();
        UiAutenticar frameAutenticar = new UiAutenticar();
        frameAutenticar.setVisible(true);
    }
}
