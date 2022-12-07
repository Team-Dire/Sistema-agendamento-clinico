package user;

public class Secretario extends Usuario{
    public Secretario(String nomeDeUsuario, char[] senha, String CPF) {
        super(nomeDeUsuario, senha, CPF);
    }

    public void associarAoMedico(Medico medico){
        return;
    }
}
