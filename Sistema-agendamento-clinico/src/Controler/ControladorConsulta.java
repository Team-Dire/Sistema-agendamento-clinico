/*
 * 
 * 
 */
package Controler;

import Clinica.Clinica;
import Consulta.Consulta;
import java.util.Date;
import user.Medico;
import user.Usuario;

/**
 *
 * @author Guilherme
 */
public class ControladorConsulta {
    public static boolean add(String nomePaciente, String CPFPaciente, String nomeMedico, Date horario){
        Clinica clinica = Clinica.getInstance();
        Date hoje = new Date();
        
        long diferencaMili = hoje.getTime() - horario.getTime();
        long diferencaDias = (diferencaMili / (1000*60*60*24)) % 365;
        long diferencaMin = (diferencaMili / (1000*60)) % 60;
        
        if(diferencaDias > 60 || diferencaMin < 30){
            return false;
        }        
        for (Consulta consultaLoop : clinica.getConsultas()){
            if (consultaLoop.getMedico().getNomeDeUsuario().equals(nomeMedico) && consultaLoop.getHorario().equals(horario)){
                return false;
            }
        }
        
        Medico med = null;
        for (Usuario user : clinica.getUsuarios()){
            if(user instanceof Medico userMed && userMed.getNomeDeUsuario().equals(nomeMedico)){
                med = userMed;
            }
        }
        
        clinica.addConsulta(nomePaciente, CPFPaciente, med, horario);
        return true;
    }
    
    public static boolean cancela(String nomePaciente, String CPFPaciente, String nomeMedico){
        return false;
    }
    
    public static boolean confirmar(String nomePaciente, String CPFPaciente, String nomeMedico, Date horario){
        return false;
    }
}
