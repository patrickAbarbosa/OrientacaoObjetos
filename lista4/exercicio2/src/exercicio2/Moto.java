package exercicio2;

public class Moto extends TransporteDuasRodas{
   
    private float nivelCombustivel;
    
    public Moto(String nome, int numeroCasas) {
        super(nome, 6);
    }
    
    public Moto(String nome, float nivelCombustivel) {
        super(nome);
    }
    public Moto(){
        
    }

    public float getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(float nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }
    
    
    
    @Override
    public int andar(int andar) {
        if(this.nivelCombustivel >= 5){
            this.nivelCombustivel -= this.numeroCasas * andar * 0.01f;
            return this.numeroCasas * andar;
        }
            
        else{
            System.out.println("Não é possivel andar, nível de combustivel baixo!");
            return 0;
        }
    }
    
    
}
