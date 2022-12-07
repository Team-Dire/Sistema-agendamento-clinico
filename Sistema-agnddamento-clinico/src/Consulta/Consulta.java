package Consulta;

import user.Medico;

import java.util.Date;

public class Consulta {

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
}
