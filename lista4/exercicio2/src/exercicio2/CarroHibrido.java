package exercicio2;

public class CarroHibrido extends Carro{
    private float nivelBateria;

    public CarroHibrido(float nivelBateria, String nome, float nivelCombustivel) {
        super(nome, nivelCombustivel);
        this.nivelBateria = nivelBateria;
    }

    public float getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(float nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    @Override
    public int andar(int andar) {
        if(this.nivelBateria >=2)
            return this.numeroCasas * andar;
        else if(super(nivel))
    }
    
    
    
    
    
}
