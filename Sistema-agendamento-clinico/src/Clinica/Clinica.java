/*
 * 
 * 
 */
package Clinica;

import Consulta.Consulta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import user.*;

/**
 *
 * @author Guilherme
 */
public class Clinica implements Serializable{
    
    private static Clinica instance;
    
    public static Clinica getInstance(){
        if (instance == null){
            instance = new Clinica();
        }
        return instance;
    }

    public static void setInstance(Clinica instance) {
        Clinica.instance = instance;
    }
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Consulta> consultas;

    private Clinica() {
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
        if (tipoUsuario.equalsIgnoreCase("Administrador")){
            Administrador adm = new Administrador(nomeDeUsuario, senha, cpf);
            this.usuarios.add(adm);
            return;
        }
        
        Secretario secretario = new Secretario(nomeDeUsuario, senha, cpf);
        this.usuarios.add(secretario);
    }
    
    public void addConsulta(String nomePaciente, String CPFPaciente, Medico medico, Date horario){
        this.consultas.add(new Consulta(nomePaciente, CPFPaciente, medico, horario, false));
    }
    
}
