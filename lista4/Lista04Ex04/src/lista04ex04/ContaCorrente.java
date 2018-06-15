package lista04ex04;

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
        this.saldo += (this.saldo * taxa * 2);
    }
}
