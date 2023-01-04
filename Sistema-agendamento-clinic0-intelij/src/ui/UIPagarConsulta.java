/*
 * 
 * 
 */
package ui;

import controler.ControladorConsulta;
import pagamento.MetodoPagamento;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class UIPagarConsulta extends javax.swing.JDialog {

    /**
     * Creates new form UIPagarConsulta
     */
    public UIPagarConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomePaciente = new javax.swing.JLabel();
        labelValorConsulta = new javax.swing.JLabel();
        labelTipoPagamento = new javax.swing.JLabel();
        labelMetodoPagamento = new javax.swing.JLabel();
        inputTipoPagamento = new javax.swing.JComboBox<>();
        inputMetodoPagamento = new javax.swing.JComboBox<>();
        inputValorConsulta = new javax.swing.JFormattedTextField();
        inputNomePaciente = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputNomeConvenio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelNomePaciente.setText("Nome Completo do Paciente:");

        labelValorConsulta.setText("Valor da Consulta:");

        labelTipoPagamento.setText("Tipo de pagamento:");

        labelMetodoPagamento.setText("Método  de pagamento:");

        inputTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convênio", "Particular" }));
        inputTipoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoPagamentoActionPerformed(evt);
            }
        });

        inputMetodoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Cartão de Débito", "Cartão de Crédito" }));

        inputValorConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Convênio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomePaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomePaciente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelValorConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputValorConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMetodoPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputMetodoPagamento, 0, 254, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipoPagamento)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTipoPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNomeConvenio))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomePaciente)
                    .addComponent(inputNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorConsulta)
                    .addComponent(inputValorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoPagamento))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetodoPagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String inputNome = this.inputNomePaciente.getText();
        float valor = Float.parseFloat(this.inputValorConsulta.getText().replaceAll(",", "."));
        String tipoPagamento = (String) this.inputTipoPagamento.getSelectedItem();
        String nomeConvenio = this.inputNomeConvenio.getText();
        int metodoPagamento = this.inputMetodoPagamento.getSelectedIndex();
        
        if (inputNome.isEmpty()){
            JOptionPane.showMessageDialog(null,"Insira o nome do Paciente.");
            return;
        }
        if (valor <= 0){
            JOptionPane.showMessageDialog(null,"Insira o valor da consulta.");
            return;
        }
        
        
        Boolean pagou = false;
        
        if (tipoPagamento.equals("Convênio")){
            if (nomeConvenio.isEmpty()){
                JOptionPane.showMessageDialog(null,"Insira o nome do Convênio.");
                return;
            }
            pagou = ControladorConsulta.pagarConsulta(inputNome, valor, nomeConvenio);
        } else { //se for pagamento particular
            switch (metodoPagamento) {
                case 0 -> {
                    pagou = ControladorConsulta.pagarConsulta(inputNome, valor, MetodoPagamento.pix);
                }
                case 1 -> {
                    pagou = ControladorConsulta.pagarConsulta(inputNome, valor, MetodoPagamento.cartaoDebito);
                }
                case 2 -> {
                    pagou = ControladorConsulta.pagarConsulta(inputNome, valor, MetodoPagamento.cartaoCredito);
                }   
            } 
        }   
        
        if (pagou.equals(false)) {
            JOptionPane.showMessageDialog(null,"Houve algum problema no pagamento!");
            return;
        }
        
        JOptionPane.showMessageDialog(null,"Pagamento registrado com sucesso!"); 
        this.setVisible(false);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void inputTipoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoPagamentoActionPerformed
        int tipoPagamento = this.inputTipoPagamento.getSelectedIndex();
        
        if (tipoPagamento == 0){
            this.inputMetodoPagamento.setEnabled(false);
            this.inputNomeConvenio.setEditable(true);
        } else {
            this.inputMetodoPagamento.setEnabled(true);
            this.inputNomeConvenio.setText("");
            this.inputNomeConvenio.setEditable(false);
        }
    }//GEN-LAST:event_inputTipoPagamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> inputMetodoPagamento;
    private javax.swing.JTextField inputNomeConvenio;
    private javax.swing.JTextField inputNomePaciente;
    private javax.swing.JComboBox<String> inputTipoPagamento;
    private javax.swing.JFormattedTextField inputValorConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelMetodoPagamento;
    private javax.swing.JLabel labelNomePaciente;
    private javax.swing.JLabel labelTipoPagamento;
    private javax.swing.JLabel labelValorConsulta;
    // End of variables declaration//GEN-END:variables

    
}
