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
public class Quadrado {
    private int lado;

    public Quadrado(int xlado) {
        this.lado = xlado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado1) {
        this.lado = lado1;
    }
    
    public int calcularÁrea() {
        return this.lado * this.lado;
    }
    
}
