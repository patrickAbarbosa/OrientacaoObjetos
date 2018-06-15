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
public class PessoaFisica extends Contribuinte {
    String cpf;
    
    public PessoaFisica(String cpf, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    @Override
    void imprimirImpostoDeRenda(){
        double imposto = this.calcularImposto();
        System.out.println("--- Declaração de Imposto de renda de Pessoa Física ---");
        System.out.println("Nome:-------------"+this.nome);
        System.out.println("CPF:--------------"+this.cpf);
        System.out.println("Renda Bruta:------"+this.rendaBruta);
        System.out.println("Desconto:---------"+imposto);
        System.out.println("Renda Liquida:----"+(this.rendaBruta - imposto));
        System.out.println("");
    }

    @Override
    double calcularImposto(){
        double imposto = 0;
        double porcentagem = 0;
        if(this.rendaBruta > 1400 && this.rendaBruta < 2100){
            porcentagem = 10;
        }else if(this.rendaBruta > 2100 && this.rendaBruta < 2800){
            porcentagem = 15;
        }else if(this.rendaBruta > 2800 && this.rendaBruta < 3600){
            porcentagem = 25;
        }else if(this.rendaBruta > 3600){
            porcentagem = 30;
        }
        imposto = (this.rendaBruta * porcentagem)/100;
        return imposto;
    }
}
