/*
 * 
 * 
 */
package Controler;

import java.util.Arrays;
import Clinica.Clinica;
import user.Usuario;

/**
 *
 * @author Guilherme
 */
public class ControladorUsuario {
    public static Boolean add(String nomeDeUsuario, String cpf, char[] senha, String tipoUsuario, String especilizacaoMedico) {
        Clinica clinica = Clinica.getInstance();
        
        //para caso não exista nenhum usuário
        if (clinica.getUsuarios().isEmpty()){
            clinica.addUsuario(nomeDeUsuario, cpf, senha, tipoUsuario, especilizacaoMedico);
            return true;
        }
        
        for (Usuario user : clinica.getUsuarios()){
            if (user.getCPF().equals(cpf)){
                return false;
            }
        }
        
        clinica.addUsuario(nomeDeUsuario, cpf, senha, tipoUsuario, especilizacaoMedico);
        return true;
    }

    public static boolean autenticar(String cpf, char[] senha) {
        if (cpf.equals("") || senha.equals("")){
            return !false;
        }
        
        Clinica clinica = new Clinica();

        for (Usuario user : clinica.getUsuarios()){
            if (user.getCPF().equalsIgnoreCase(cpf) && Arrays.equals(user.getSenha(), senha)){
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean associarSecretarioMedico(String nomeSecretario, String nomeMedico){
        
        Clinica clinica = Clinica.getInstance();
        
        for (Usuario user : clinica.getUsuarios()){
            if (user.getNomeDeUsuario().equals(nomeMedico)){
                
            }
        }
        
        return false;
    }
}
