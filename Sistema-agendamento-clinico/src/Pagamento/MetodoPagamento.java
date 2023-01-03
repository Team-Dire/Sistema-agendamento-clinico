/*
 * 
 * 
 */
package Pagamento;

/**
 *
 * @author Guilherme
 */
public enum MetodoPagamento {
    pix(0), cartaoDebito(1), cartaoCredito(2);
    
    private final int metodo;
    
    MetodoPagamento (int metodo) {
        this.metodo = metodo;
    }

    public  int getMetodo() {
        return metodo;
    }
}