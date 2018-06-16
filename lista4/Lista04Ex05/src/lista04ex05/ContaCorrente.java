package lista04ex05;

public class ContaCorrente implements Tributavel, Conta {

    public ContaCorrente() {
        super();
    }

    @Override
    public void depositar(float valor){
        super.depositar((float)(valor-0.10));
    }
    
    @Override
    public void atualizarSaldo(float taxa) {
        this.saldo += (this.saldo * taxa * 2)/100;
    }

    @Override
    public void calcularTributo() {
        this.saldo -= (this.saldo * 1)/100;
    }
}
