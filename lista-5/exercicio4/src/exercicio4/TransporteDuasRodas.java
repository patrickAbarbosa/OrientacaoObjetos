package exercicio4;
public class TransporteDuasRodas extends Personagem{

    public TransporteDuasRodas(String nome, int numeroCasas) {
        super(nome, numeroCasas);
    }

    @Override
    public int andar(int andar) {
        return andar * this.numeroCasas;
    }
    
}
