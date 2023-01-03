/*
 * 
 * 
 */
package Consulta;

import Pagamento.PagamentoParticular;
import Pagamento.PagamentoConvenio;
import Pagamento.Pagamento;
import Pagamento.MetodoPagamento;
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
    
    private Pagamento pagamento;

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
    
    public Pagamento getPagamento() {
        return pagamento;
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
    
    public void pagar(float valor, MetodoPagamento metodoPagamento){
        this.pagamento = new PagamentoParticular(metodoPagamento, valor);
    }
    
    public void pagar(float valor, String nomeConvenio){
        this.pagamento = new PagamentoConvenio(nomeConvenio, valor);
    }
    
}
