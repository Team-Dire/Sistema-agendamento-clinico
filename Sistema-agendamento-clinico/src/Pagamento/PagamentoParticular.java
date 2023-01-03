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
