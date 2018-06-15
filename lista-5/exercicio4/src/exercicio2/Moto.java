package exercicio2;
public class Moto extends TransporteDuasRodas{
    protected float nivelCombustivel;
    public Moto(String nome, int numeroCasas) {
        super(nome, 6);
    }
    public Moto(){
        
    }

    @Override
    public int andar(int andar) {
        if(this.nivelCombustivel >= 5)
            return (int) this.nivelCombustivel * andar;
        else{
            System.out.println("Não é possivel andar, nível de combustivel baixo!");
            return 0;
        }
    }
    
    
}
