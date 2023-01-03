/*
 * 
 * 
 */
package Pagamento;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Guilherme
 */
public class PagamentoConvenio extends Pagamento implements Serializable {
    
    private final String nomeConvenio;

    public PagamentoConvenio(String nomeConvenio, float valor) {
        super(valor);
        this.nomeConvenio = nomeConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }
}
