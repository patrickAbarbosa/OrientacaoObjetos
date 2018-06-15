package lista04ex04;

import java.util.ArrayList;

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
