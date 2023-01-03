/*
 * 
 * 
 */
package Pagamento;

import java.io.Serializable;

/**
 *
 * @author Guilherme
 */
public class Pagamento implements Serializable{
    
    private float valor;

    public Pagamento(float valor) {
        this.valor = valor;
    }
}
