package user;

public class Usuario {

    private String nomeDeUsuario;
    private char[] senha;
    private String CPF;

    public Usuario(String nomeDeUsuario, char[] senha, String CPF) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.CPF = CPF;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public char[] getSenha() {
        return senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
