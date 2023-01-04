package user;

import java.io.Serializable;

public class Usuario implements Serializable{

    private String nomeDeUsuario;
    private char[] senha;
    private String cpf;

    public Usuario(String nomeDeUsuario, char[] senha, String cpf) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public char[] getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
