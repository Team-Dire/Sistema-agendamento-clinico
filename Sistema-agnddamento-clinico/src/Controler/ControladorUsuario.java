package Controler;

public class ControladorUsuario {
    public static void add(String nomeDeUsuario, String senha) {

    }

    public static boolean autenticar(String cpf, char[] senha) {
        if (!cpf.equals("") && !senha.equals("")){
            return true;
        }
        return false;
    }

}
