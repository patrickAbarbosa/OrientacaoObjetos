package exercicio2;

public class Teste {

    public static void main(String[] args) {
        Personagem p0 = new Homem("Steve");
        Personagem p1 = new Atleta("Bolt");
        
        System.out.println( p0.getNome() + "  anda: " + p0.andar(5));
        System.out.println( p1.getNome() + "  anda: " + p1.andar(30));
        
        Personagem t0 = new Bicicleta("Bicileta");
        Personagem t1 = new Moto("Moto", 6);
       
        System.out.println( t0.getNome() + "  anda: " + t0.andar(5));
        System.out.println( t1.getNome() + "  anda: " + t1.andar(30));
        
        System.out.println( t0.getNome() + "  anda: " + t0.andar(5));
        
        Personagem c0 = new Carro("Golf", 10);
        Personagem c1 = new Carro("Prius", 45);
        
        System.out.println( c0.getNome() + "  anda: " + c0.andar(5));
        System.out.println( c1.getNome() + "  anda: " + c1.andar(30));
    
        System.out.println( c0.getNome() + "  anda: " + c0.andar(5));
    }
    
}
