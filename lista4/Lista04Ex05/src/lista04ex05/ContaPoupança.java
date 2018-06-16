package lista04ex05;

public class ContaPoupança implements Tributavel, Conta{

    public ContaPoupança() {
        super();
    }
    
    @Override
    public void atualizarSaldo(float taxa) {
        this.saldo += (this.saldo * taxa * 3)/100;
    }

    @Override
    public void calcularTributo() {
        this.saldo -= 50;
    }
}
