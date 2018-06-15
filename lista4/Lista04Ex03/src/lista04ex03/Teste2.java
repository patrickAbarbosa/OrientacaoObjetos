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
public class Teste2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1, c2, c3;
        ArrayList <Conta> contas = new ArrayList<Conta>();
        AtualizadorContas atualizador = new AtualizadorContas(1);

        c1 = new Conta();
        c2 = new ContaCorrente();
        c3 = new ContaPoupança();
        c1.depositar(1000);
        c2.depositar(1000);
        c3.depositar(1000);
        
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        
        atualizador.atualizar(contas);

        System.out.println("Teste2 - Usando Atualizador\n");
        System.out.println("Conta: "+c1.getSaldo());
        System.out.println("Conta Corrente: "+c2.getSaldo());
        System.out.println("Conta Poupança: "+c3.getSaldo());
    }
}