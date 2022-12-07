/*
 * 
 * 
 */
package sistema.agendamento.clinico;

import Consulta.Consulta;
import java.util.ArrayList;
import user.Medico;
import user.Secretario;
import user.Usuario;

/**
 *
 * @author Guilherme
 */
public class Clinica {
    
    private static final Clinica instance = null;
    
    public static Clinica getInstance(){
        if (instance == null){
            return new Clinica();
        }
        return instance;
    }
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Consulta> consultas;

    public Clinica() {
        this.usuarios = new ArrayList<>();
        this.consultas = new  ArrayList<>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void addUsuario(String nomeDeUsuario, String cpf, char[] senha, String tipoUsuario, String especilizacaoMedico) {
        if (tipoUsuario.equalsIgnoreCase("Médico")){
            Medico medico = new Medico(nomeDeUsuario, senha, cpf, especilizacaoMedico);
            this.usuarios.add(medico);
            return;
        }
        
        Secretario secretario = new Secretario(nomeDeUsuario, senha, cpf);
        this.usuarios.add(secretario);

    }
    
    
}
