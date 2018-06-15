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
public class ContaPoupança extends Conta {

    public ContaPoupança() {
        super();
    }
    
    @Override
    public void atualizarSaldo(float taxa) {
        super.atualizarSaldo(taxa*3);
    }
}
