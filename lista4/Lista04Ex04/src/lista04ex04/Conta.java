package lista04ex04;

public abstract class Conta {
    protected float saldo;

    public Conta() {
        saldo = 0;
    }
    
    public void depositar(float valor){
        saldo += valor;
    }
    
    public void sacar(float valor){
        saldo -= valor;
    }
    
    public abstract void atualizarSaldo(float taxa);
    //this.saldo += (this.saldo*taxa)/100;

    public float getSaldo() {
        return saldo;
    }
}
