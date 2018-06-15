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
public class Banco {
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public void adicionaConta(Conta conta){
        contas.add(conta);
    }
    public void getConta(int index){
        contas.get(index);
    }
    public int getTotalContas(){
        return contas.size();
    }
}
