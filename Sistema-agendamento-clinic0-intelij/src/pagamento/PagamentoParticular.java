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
public class PagamentoParticular extends Pagamento implements Serializable {
    
    private final MetodoPagamento metodoDePagamento;

    public PagamentoParticular(MetodoPagamento metodoDePagamento, float valor) {
        super(valor);
        this.metodoDePagamento = metodoDePagamento;
    }

    public MetodoPagamento getMetodoDePagamento() {
        return metodoDePagamento;
    }
}
