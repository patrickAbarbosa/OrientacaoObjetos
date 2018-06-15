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
public class Conta {
    private float saldo;

    public Conta() {
        saldo = 0;
    }
    
    public void depositar(float valor){
        saldo += valor;
    }
    
    public void sacar(float valor){
        saldo -= valor;
    }
    
    public void atualizarSaldo(float taxa){
        this.saldo += (this.saldo*taxa)/100;
    }

    public float getSaldo() {
        return saldo;
    }
}
