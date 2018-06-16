package exercicio2;
public class Homem extends Personagem{

    public Homem(String nome, int numeroCasas) {
        super(nome, numeroCasas);
    }
    public Homem(String nome){
        this.nome = nome;
        this.numeroCasas = 1; 
    }
    public Homem(){
        
    }
    @Override
    public int andar(int andar) {
        return andar * this.numeroCasas;
    }
    
    
}
