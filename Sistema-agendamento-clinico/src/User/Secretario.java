package user;

import java.io.Serializable;
import java.util.ArrayList;

public class Secretario extends Usuario implements Serializable {
    
    private ArrayList<Medico> medicosAssociados;
    
    public Secretario(String nomeDeUsuario, char[] senha, String CPF) {
        super(nomeDeUsuario, senha, CPF);
        this.medicosAssociados = new ArrayList<>();
    }

    public ArrayList<Medico> getMedicosAssociados() {
        return medicosAssociados;
    }

    public void associarAoMedico(Medico medico){
        this.medicosAssociados.add(medico);
    }
}
