/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04ex01;

/**
 *
 * @author igorphelype
 */
public class Lista04Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuinte empresax = new PessoaJuridica("098765", "Empresa x", 10000);
        Contribuinte pessoax = new PessoaFisica("098765", "Pessoa x", 5000);
        pessoax.imprimirImpostoDeRenda();
        empresax.imprimirImpostoDeRenda();
    }
    
}
