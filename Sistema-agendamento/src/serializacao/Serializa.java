/*
 * 
 * 
 */
package serializacao;

import clinica.Clinica;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Guilherme
 */
public class Serializa {
    public static void gravaNoArquivo() {
        File arquivo = new File("bancoDeDados.dat");
        Clinica clinica = Clinica.getInstance();

        try {
            arquivo.delete();
            arquivo.createNewFile();
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arquivo));
            objOutput.writeObject(clinica);
            objOutput.close();
        } catch (IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }
    }

    public static void leituraDoArquivo() {
        try {
            File arquivo = new File("bancoDeDados.dat");
            if (arquivo.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arquivo));
                Clinica.setInstance((Clinica)objInput.readObject());
                objInput.close();
            }
        } catch (IOException | ClassNotFoundException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }
    }
}
