package lista04ex04;

import java.util.ArrayList;

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
