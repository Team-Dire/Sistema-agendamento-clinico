package user;

public class Secretario extends Usuario{
    public Secretario(String nomeDeUsuario, String senha, String CPF) {
        super(nomeDeUsuario, senha, CPF);
    }

    public void associarAoMedico(Medico medico){
        return;
    }
}
