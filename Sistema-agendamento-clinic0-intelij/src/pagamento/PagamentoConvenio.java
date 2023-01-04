/*
 * 
 * 
 */
package pagamento;

import java.io.Serializable;

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
