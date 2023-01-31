package user;

import java.io.Serializable;

public class Medico extends Usuario implements Serializable {

    private final String especializacao;

    public Medico(String nomeDeUsuario, char[] senha, String cpf, String especializacao) {
        super(nomeDeUsuario, senha, cpf);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }
}
