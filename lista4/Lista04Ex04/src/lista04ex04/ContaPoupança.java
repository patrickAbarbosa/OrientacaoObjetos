package lista04ex04;

public class ContaPoupança extends Conta {

    public ContaPoupança() {
        super();
    }
    
    @Override
    public void atualizarSaldo(float taxa) {
        this.saldo += ((float)(this.saldo * taxa * 3 )/100);
    }
}
