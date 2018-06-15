package exercicio2;
public abstract class Personagem {
    protected String nome;
    protected int numeroCasas;

    public Personagem(String nome, int numeroCasas) {
        this.nome = nome;
        this.numeroCasas = numeroCasas;
    }

    public Personagem() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCasas() {
        return numeroCasas;
    }

    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }
    
    public abstract int andar(int andar);
}
