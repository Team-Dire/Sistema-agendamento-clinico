/*
 * 
 * 
 */
package controler;

import java.util.Arrays;
import clinica.Clinica;
import user.*;

public class ControladorUsuario {
    private ControladorUsuario(){

    }

    public static Boolean add(String nomeDeUsuario, String cpf, char[] senha, String tipoUsuario, String especilizacaoMedico) {
        Clinica clinica = Clinica.getInstance();
        
        //para caso não exista nenhum usuário
        if (clinica.getUsuarios().isEmpty()){
            clinica.addUsuario(nomeDeUsuario, cpf, senha, tipoUsuario, especilizacaoMedico);
            return true;
        }
        
        for (Usuario user : clinica.getUsuarios()){
            if (user.getCpf().equals(cpf)){
                return false;
            }
        }
        
        clinica.addUsuario(nomeDeUsuario, cpf, senha, tipoUsuario, especilizacaoMedico);
        return true;
    }

    public static Boolean autenticar(String cpf, char[] senha) {
        if (cpf.equals("") || senha.equals("")){
            return false;
        }
        
        Clinica clinica = Clinica.getInstance();

        for (Usuario user : clinica.getUsuarios()){
            if (user.getCpf().equalsIgnoreCase(cpf) && Arrays.equals(user.getSenha(), senha)){
                return true;
            }
        }
        
        return false;
    }
    
    public static Boolean associarSecretarioMedico(String nomeSecretario, String nomeMedico){
        
        Clinica clinica = Clinica.getInstance();
        
        for (Usuario user : clinica.getUsuarios()){
            if (user instanceof Secretario userSecre){
                for (Medico med : userSecre.getMedicosAssociados()){
                    if (nomeMedico.equals(med.getNomeDeUsuario())){
                        return false;
                    }
                }
            }
        }
        
        for (Usuario user : clinica.getUsuarios()){
            if (user instanceof Secretario userSecre && userSecre.getNomeDeUsuario().equals(nomeSecretario)){
                for (Usuario med : clinica.getUsuarios()){
                    if (med instanceof Medico userMed && nomeMedico.equals(med.getNomeDeUsuario())){
                        userSecre.associarAoMedico(userMed);
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public static Boolean isListaUsuarioEmpty(){
        Clinica clinica = Clinica.getInstance();
        return clinica.getUsuarios().isEmpty();
    }
    
    public static Usuario getUsuario(String cpf){
        Clinica clinica = Clinica.getInstance();
        for (Usuario user : clinica.getUsuarios()){
            if(user.getCpf().equals(cpf)){
                return user;
            }
        }
        return null;
    }
    
    public static Boolean secretarioTrabalhaComMedico(Secretario secre){
        
        
        
        return false;
    }
}
