/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04ex03;

import java.util.ArrayList;

/**
 *
 * @author igorphelype
 */
public class AtualizadorContas {

    private float taxa;
    
    public AtualizadorContas(float taxa){
        this.taxa = taxa;
    }
    
    public void atualizar(ArrayList <Conta> contas){
        for(Conta conta : contas){
            conta.atualizarSaldo(this.taxa);
        }
    }    
}
