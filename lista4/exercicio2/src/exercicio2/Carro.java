package exercicio2;
public class Carro extends Personagem{
    protected float nivelCombustivel;

    public Carro(String nome, int numeroCasas, float nivelCombustivel) {
        super(nome, numeroCasas);
        this.nivelCombustivel = nivelCombustivel;
    }
    
    public Carro(String nome, float nivelCombustivel) {
        super(nome, 12);
        this.nivelCombustivel = nivelCombustivel;
    }

    public float getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(float nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    @Override
    public int andar(int andar) {
        if(this.nivelCombustivel >= 10){
            this.nivelCombustivel -= (float)(andar * this.nivelCombustivel * 0.2f);
            return andar * this.numeroCasas;
        }
            
        else{
            System.out.println("Não é possivel andar, nível de combustivel baixo");
            return 0;
        }
            
    }
    
}
