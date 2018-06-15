package exercicio2;
public class TransporteDuasRodas extends Personagem{

    public TransporteDuasRodas(String nome, int numeroCasas) {
        super(nome, numeroCasas);
    }
    
    public TransporteDuasRodas(String nome) {
        super(nome, 3);
    }
    
    public TransporteDuasRodas(){
        
    }
    @Override
    public int andar(int andar) {
        return andar * this.numeroCasas;
    }
    
}
