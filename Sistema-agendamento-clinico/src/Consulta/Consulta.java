/*
 * 
 * 
 */
package Consulta;

import java.io.Serializable;
import java.util.Date;
import user.Medico;

/**
 *
 * @author Guilherme
 */
public class Consulta implements Serializable {
    private String paciente;
    private String CPFpaciente;
    private Medico medico;
    private Date horario;
    private Boolean confirmada = false;

    public Consulta(String paciente, String CPFpaciente, Medico medico, Date horario, Boolean confirmada) {
        this.paciente = paciente;
        this.CPFpaciente = CPFpaciente;
        this.medico = medico;
        this.horario = horario;
        this.confirmada = confirmada;
    }

    public void confirmar(){
        this.confirmada = true;
    }

    public void notificar(){
        return;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getCPFpaciente() {
        return CPFpaciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Date getHorario() {
        return horario;
    }

    public Boolean getConfirmada() {
        return confirmada;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setCPFpaciente(String CPFpaciente) {
        this.CPFpaciente = CPFpaciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public void setConfirmada(Boolean confirmada) {
        this.confirmada = confirmada;
    }
    
}
