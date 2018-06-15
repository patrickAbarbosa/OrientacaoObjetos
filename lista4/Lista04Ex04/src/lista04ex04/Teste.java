package lista04ex04;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        //Conta c1;
        ContaCorrente c2;
        ContaPoupança c3;
        ArrayList <Conta> contas = new ArrayList<Conta>();
        AtualizadorContas atualizador = new AtualizadorContas(1);

        //c1 = new Conta();
        c2 = new ContaCorrente();
        c3 = new ContaPoupança();

        //c1.depositar(1000);
        c2.depositar(1000);
        c3.depositar(1000);
        
        //contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        
        atualizador.atualizar(contas);

        System.out.println("Teste - Usando Atualizador\n");
        //System.out.println("Conta: "+c1.getSaldo());
        System.out.println("Conta Corrente: "+c2.getSaldo());
        System.out.println("Conta Poupança: "+c3.getSaldo());
    }    
}
