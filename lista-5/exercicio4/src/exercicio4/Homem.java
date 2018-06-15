package exercicio4;
public class Homem extends Personagem{

    public Homem(String nome, int numeroCasas) {
        super(nome, numeroCasas);
    }
    public Homem(String nome){
        this.nome = nome;
        this.numeroCasas = 1; 
    }

    @Override
    public int andar(int andar) {
        return andar * this.numeroCasas;
    }
    
    
}
