package user;

public class Medico extends Usuario {

    private final String especializacao;

    public Medico(String nomeDeUsuario, char[] senha, String CPF, String especializacao) {
        super(nomeDeUsuario, senha, CPF);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }
}
