package user;

import java.io.Serializable;

public class Medico extends Usuario implements Serializable {

    private final String especializacao;

    public Medico(String nomeDeUsuario, char[] senha, String CPF, String especializacao) {
        super(nomeDeUsuario, senha, CPF);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }
}
