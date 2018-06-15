package exercicio2;

public class Bicicleta extends TransporteDuasRodas{

    public Bicicleta(String nome) {
        super(nome);
    }
    
    public Bicicleta(){
        
    }

    @Override
    public int andar(int andar) {
        return this.numeroCasas * andar;
    }
    
}
