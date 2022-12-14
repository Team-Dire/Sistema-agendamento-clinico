/*
 * 
 * 
 */
package Controler;

import Clinica.Clinica;
import Consulta.Consulta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import user.Medico;
import user.Secretario;
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
        long diferencaDias = Math.abs(diferencaMili / (1000*60*60*24) % 365);
        long diferencaMin = Math.abs((diferencaMili / (1000*60)) % 60);
        
        if(diferencaDias > 60) {
            return false;
        }        
        if (diferencaMin < 30){
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
    
    public static boolean cancela(String nomePaciente, Date horario){
        
        Clinica clinica = Clinica.getInstance();
        for (Consulta cons : clinica.getConsultas()){
            if (cons.getPaciente().equals(nomePaciente) && cons.getHorario().equals(horario)) {
                clinica.getConsultas().remove(cons);
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean confirmar(String nomePaciente, Date horario){
        
        Clinica clinica = Clinica.getInstance();
        for (Consulta cons : clinica.getConsultas()){
            if (cons.getPaciente().equals(nomePaciente) && cons.getHorario().equals(horario)) {
                cons.confirmar();
                return true;
            }
        }
        
        return false;
    }
    
    public static ArrayList<Consulta> getConsultasDia(Date diaDate){
        Clinica clinica = Clinica.getInstance();
        ArrayList<Consulta> consultasHoje = new ArrayList<>();
        
        Calendar dia = Calendar.getInstance();
        dia.setTime(diaDate);
        
        for (Consulta cons : clinica.getConsultas()){
            Calendar dataCons = Calendar.getInstance();
            dataCons.setTime(cons.getHorario());
            if (dia.get(Calendar.YEAR) == dataCons.get(Calendar.YEAR) && dia.get(Calendar.MONTH) == dataCons.get(Calendar.MONTH) && dia.get(Calendar.DATE) == dataCons.get(Calendar.DATE)){
                consultasHoje.add(cons);
            }
        }
        
        return consultasHoje;
    }
    
    public static ArrayList<Consulta> getConsultaPaciente(String nomePaciente){
        Clinica clinica = Clinica.getInstance();
        ArrayList<Consulta> consultasHoje = new ArrayList<>();
        
        for (Consulta cons : clinica.getConsultas()){
            if (cons.getPaciente().equals(nomePaciente)){
                consultasHoje.add(cons);
            }
        }
        
        return consultasHoje;
    }
    
    public static ArrayList<Consulta> getConsultasMedico(String nomeMedico, Secretario secre){
        Clinica clinica = Clinica.getInstance();
        ArrayList<Consulta> consultasHoje = new ArrayList<>();
        
        for (Consulta cons : clinica.getConsultas()){
            if (cons.getMedico().getNomeDeUsuario().equals(nomeMedico) && secre.getMedicosAssociados().contains(cons.getMedico())){
                consultasHoje.add(cons);
            }
        }
        
        return consultasHoje;
    }
}
