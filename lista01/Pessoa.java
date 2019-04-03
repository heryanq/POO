/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String xnome, int xidade, double xpeso, double xaltura) {
        this.nome = xnome;
        this.idade = xidade;
        this.peso = xpeso;
        this.altura = xaltura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void envelhecer() {
        this.idade ++;
        if (this.idade < 21) {
            crescer();
        }
    }
    
    public void engordar(double peso_extra) {
        this.peso += peso_extra;
    }
    
    public void emagrecer(double peso_perdido) {
        this.peso -= peso_perdido;
    }
    
    public void crescer() {
        this.altura += 0.05;
    }
    
}
