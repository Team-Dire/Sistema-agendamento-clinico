package user;

import java.io.Serializable;

public class Administrador extends Usuario implements Serializable{
    public Administrador(String nomeDeUsuario, char[] senha, String cpf) {
        super(nomeDeUsuario, senha, cpf);
    }
}
