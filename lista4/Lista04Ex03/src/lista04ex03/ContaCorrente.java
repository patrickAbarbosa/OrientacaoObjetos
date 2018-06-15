/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04ex03;

/**
 *
 * @author igorphelype
 */
public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super();
    }

    @Override
    public void depositar(float valor){
        super.depositar((float)(valor-0.10));
    }
    @Override
    public void atualizarSaldo(float taxa) {
        super.atualizarSaldo(taxa*2);
    }
}
