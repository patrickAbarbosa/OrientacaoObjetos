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
abstract public class Contribuinte {
    protected String nome;
    protected double rendaBruta;
    
    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    abstract void imprimirImpostoDeRenda();
    abstract double calcularImposto();
}
