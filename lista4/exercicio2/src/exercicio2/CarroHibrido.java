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
        if(this.nivelBateria >=2){
            this.nivelBateria -= (float)(this.numeroCasas * andar * 0.01);
            return this.numeroCasas * andar;
        }         
        else if(this.nivelCombustivel >=10){
            this.nivelCombustivel -= (float)(andar * this.numeroCasas * 0.02f);
            return  andar * this.numeroCasas;
        }
        else{
            System.out.println("Não é possivel andar, nível de gasolina baixo!");
            return 0;
        }       
    }
}
