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
public class PessoaJuridica extends Contribuinte{
    String cnpj;
    
    public PessoaJuridica(String cnpj, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    @Override
    void imprimirImpostoDeRenda() {
        double imposto = this.calcularImposto();
        System.out.println("--- Declaração de Imposto de renda de Pessoa Juridica ---");
        System.out.println("Nome:-------------"+this.nome);
        System.out.println("CNPJ:-------------"+this.cnpj);
        System.out.println("Renda Bruta:------"+this.rendaBruta);
        System.out.println("Desconto:---------"+imposto);
        System.out.println("Renda Liquida:----"+(this.rendaBruta - imposto));
        System.out.println("");
    }
    
    @Override
    double calcularImposto(){
        double imposto = (this.rendaBruta * 10)/100;
        return imposto;
    }
}
