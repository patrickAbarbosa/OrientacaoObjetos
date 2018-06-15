package exercicio2;

public class Atleta extends Homem{

    public Atleta(String nome) {
        super(nome);
        this.numeroCasas = 2;
    }

    @Override
    public int andar(int andar) {
        return this.numeroCasas * andar;
    }
    
}
